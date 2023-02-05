import java.util.Scanner;

public class concatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimeter = scanner.nextLine();

        System.out.printf("%s %s %s",firstName, delimeter, secondName);
    }
}
