import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String massage = scanner.nextLine();
        String command = scanner.nextLine();
        StringBuilder massageBuilder = new StringBuilder(massage);
        while (!"Decode".equals(command)) {
            if (command.contains("Move")) {
                int numberOfLetters = Integer.parseInt(command.split("\\|")[1]);
                String lettersToMove = massageBuilder.substring(0, numberOfLetters);
                String currentMassage = massageBuilder.substring(numberOfLetters, massageBuilder.length());
                massageBuilder = new StringBuilder(currentMassage);
                massageBuilder.append(lettersToMove);
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split("\\|")[1]);
                String value = command.split("\\|")[2];
                massageBuilder.insert(index, value);
            } else if (command.contains("ChangeAll")) {
                String substring = command.split("\\|")[1];
                String replacement = command.split("\\|")[2];
                String changed = massageBuilder.toString().replace(substring, replacement);
                massageBuilder = new StringBuilder(changed);
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + massageBuilder);
    }
}
