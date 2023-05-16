import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();

        String command = scanner.nextLine();
        while (!"Generate".equals(command)) {
            String[] commandArr = command.split(">>>");
            if (commandArr[0].equals("Contains")) {
                String substring = commandArr[1];
                if (rawActivationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", rawActivationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (commandArr[0].equals("Flip")) {
                int startIndex = Integer.parseInt(commandArr[2]);
                int endIndex = Integer.parseInt(commandArr[3]);
                if (commandArr[1].equals("Upper")) {
                    String substring = rawActivationKey.substring(startIndex, endIndex);
                    String UpSubstring = substring.toUpperCase();
                    rawActivationKey = rawActivationKey.replaceFirst(substring, UpSubstring);
                    System.out.println(rawActivationKey);

                } else if (commandArr[1].equals("Lower")) {
                    String substring = rawActivationKey.substring(startIndex, endIndex);
                    String lowSubstring = substring.toLowerCase();
                    rawActivationKey = rawActivationKey.replaceFirst(substring, lowSubstring);
                    System.out.println(rawActivationKey);
                }

            } else if (commandArr[0].equals("Slice")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                StringBuilder sb = new StringBuilder(rawActivationKey);
                rawActivationKey = sb.replace(startIndex, endIndex, "").toString();
                System.out.println(rawActivationKey);
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + rawActivationKey);

    }
}
