import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String massage = scanner.nextLine();

        String command =scanner.nextLine();
StringBuilder sb = new StringBuilder(massage);
        while (!"Reveal".equals(command)){

            if (command.contains("InsertSpace")){
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                sb.insert(index," ");
                System.out.println(sb);
                
            } else if (command.contains("Reverse")) {
                String substring = command.split(":\\|:")[1];
                if (sb.toString().contains(substring)){
                    StringBuilder reversed = new StringBuilder(substring);
                    reversed.reverse();
                    String newString = sb.toString().replace(substring,reversed.toString());
                    sb = new StringBuilder(newString);
                    System.out.println(sb);
                }else {
                    System.out.println("error");
                }
            }else if (command.contains("ChangeAll")) {
                String substring = command.split(":\\|:")[1];
                String replacement = command.split(":\\|:")[2];
                while (sb.toString().contains(substring)){
                    String replaced = sb.toString().replace(substring,replacement);
                    sb = new StringBuilder(replaced);
                }
                System.out.println(sb);
            }
            command =scanner.nextLine();
        }
        System.out.println("You have a new text message: " + sb);
    }
}
