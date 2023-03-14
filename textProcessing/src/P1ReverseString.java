import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1ReverseString {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        List<String> words = new ArrayList<>();
         while (!"end".equals(input)){
             words.add(input);

             input  = scanner.nextLine();
         }

        for (int i = 0; i < words.size(); i++) {
        String currentWord = words.get(i);
        String reversed = "";
            for (int j = currentWord.length()-1 ; j >= 0 ; j--) {
                char currentChar = currentWord.charAt(j);
                reversed += currentChar;
            }
            System.out.printf("%s = %s%n", currentWord,reversed);

        }
    }
}
