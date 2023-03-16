import java.util.Scanner;

public class ME1ExtractPersonInfo {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String text = scanner.nextLine();
            int beginIndexName = text.indexOf('@');
            int endIndexName = text.indexOf('|');
            int beginIndexAge = text.indexOf('#');
            int endIndexAge = text.indexOf('*');
            String name = text.substring(beginIndexName+1, endIndexName);
            String age = text.substring(beginIndexAge+1, endIndexAge);
            System.out.printf("%s is %s years old.%n",name,age);
        }
    }
}
