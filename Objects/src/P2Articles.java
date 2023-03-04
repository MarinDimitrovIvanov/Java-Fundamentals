import java.util.Scanner;

public class P2Articles {
    static class Article{
        public String title;
        public  String content;
        public String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " +  this.author ;
        }
        public void edit (String newContent) {
            this.content = newContent;
        }
        public void rename (String newTitle) {

            this.title = newTitle;
        }
        public void changeAuthor(String newAuthor) {

            this.author = newAuthor;
        }
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String[] token = scanner.nextLine().split(", ");
         String title = token[0];
         String content = token[1];
         String author = token[2];
         Article article = new Article(title, content, author);
         int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String commandLine = scanner.nextLine();
            String command = commandLine.split(" ")[0];
            String newWord = commandLine.split(": ")[1];
            switch (command){
                case "Edit:":
                    article.edit(newWord);
                    break;
                case "ChangeAuthor:":
                    article.changeAuthor(newWord);
                    break;
                case "Rename:":
                    article.rename(newWord);
                    break;
            }
        }
        System.out.println(article);
    }
}
