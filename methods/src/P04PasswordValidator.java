import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!isBetween6And10(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!hasOnlyLetterAndDigit(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!atLeast2Digit(password)){
            System.out.println("Password must have at least 2 digits");
        }


        if (isBetween6And10(password) && hasOnlyLetterAndDigit(password) && atLeast2Digit(password)){
            System.out.println("Password is valid");
        }


    }
    public static boolean isBetween6And10 (String pass){

        int count = 0;
        for (char current : pass.toCharArray()) {
            count++;
        }
        return count >= 6 && count <= 10;
    }
    public static boolean hasOnlyLetterAndDigit (String pass){
        for (char current : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(current)){
               return false;
            }
        }
        return true;
    }
    public static boolean atLeast2Digit(String pass){
        int count = 0;
        for (char current : pass.toCharArray()) {
            if (Character.isDigit(current)) {
                count++;
            }
            if (count == 2 ){
                return true;
            }
        }
        return false;
    }

}
