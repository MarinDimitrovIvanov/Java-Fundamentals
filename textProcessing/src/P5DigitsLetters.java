import java.util.Scanner;

public class P5DigitsLetters {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String text = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isDigit(currentChar)){
                digit.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letter.append(currentChar);
            }else {
                other.append(currentChar);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);
    }
}
