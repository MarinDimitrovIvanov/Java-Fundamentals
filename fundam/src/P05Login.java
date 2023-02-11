import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password ="";

        for (int i = username.length()-1; i >= 0; i--) {
            char current = username.charAt(i);
            password += current;
        }

        for (int i = 1; i <= 4 ; i++) {
            String inputPass = scanner.nextLine();
                if (password.equals(inputPass)) {
                    System.out.printf("User %s logged in.", username);
                    break;
                } else {
                    if (i==4){
                        System.out.printf("User %s blocked!",username);
                    }else {
                        System.out.println("Incorrect password. Try again.");
                    }
                }
        }
    }
}
