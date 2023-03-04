import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P1RandomizeWord {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String[] words = (scanner.nextLine().split("\\s+"));
         Random rnd = new Random();
        for (int i = 0; i <= words.length-1 ; i++) {
            String current = words[i];
            int index = rnd.nextInt(words.length);
            words[i] = words[index];
            words[index] = current;
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
