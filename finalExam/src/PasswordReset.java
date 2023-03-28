import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String command = scanner.nextLine();
        while (!"Done".equals(command)) {

            if (command.contains("TakeOdd")) {
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < password.length(); i += 2) {
                    char current = password.charAt(i);
                    sb.append(current);
                }
                password = sb.toString();
                System.out.println(password);
            } else if (command.contains("Cut")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int length = Integer.parseInt(command.split(" ")[2]);
                String substring = password.substring(index, index + length);
                password = password.replace(substring, "");

                System.out.println(password);
            } else if (command.contains("Substitute")) {
                String substring = command.split(" ")[1];
                String substitute = command.split(" ")[2];
               if (!password.contains(substring)){
                    System.out.println("Nothing to replace!");
                }else {
                   while (password.contains(substring)) {
                       password = password.replace(substring, substitute);
                   }
                   System.out.println(password);
               }

            }
            command = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
