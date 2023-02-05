import java.util.Scanner;

public class reversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        String thirdChar = scanner.nextLine();
        char first = firstChar.charAt(0);
        char second = secondChar.charAt(0);
        char third = thirdChar.charAt(0);

        String combine = "" + third + second + first;

        System.out.printf("%s",combine);
    }
}
