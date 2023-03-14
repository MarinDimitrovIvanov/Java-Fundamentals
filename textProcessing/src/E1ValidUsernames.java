import java.util.Scanner;

public class E1ValidUsernames {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] input = scanner.nextLine().split(", ");

        for (String name : input) {
            if (isValidname(name)){
                System.out.println(name);
            }

        }

    }

    private static boolean isValidname(String name) {
        boolean isValid = true;

        if (name.length() < 3 || name.length() > 16){
            return false;
            }

        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)  && currentChar != '-' && currentChar != '_'){
                return  false;
            }
        }
        return isValid;
    }
}
