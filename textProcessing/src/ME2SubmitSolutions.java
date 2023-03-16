import java.util.Scanner;

public class ME2SubmitSolutions {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         char beginChar = scanner.nextLine().charAt(0);
         char endChar = scanner.nextLine().charAt(0);
         String text = scanner.nextLine();
         int sum = 0;
         for (int i = 0; i < text.length(); i++) {
             char currentChar = text.charAt(i);
            if (currentChar > beginChar && currentChar < endChar ){
                sum += currentChar;
            }
        }
        System.out.println(sum);

    }
}
