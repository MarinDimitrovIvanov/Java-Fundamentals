import java.util.Scanner;

public class P2RepeatString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] words = scanner.nextLine().split("\\s+");
        String result = "";
         for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int repeat = currentWord.length();
             for (int j = 0; j < repeat; j++) {
                 result += currentWord;
             }
        }
        System.out.println(result);
    }
}
