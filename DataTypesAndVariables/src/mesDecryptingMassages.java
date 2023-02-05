import java.util.Scanner;

public class mesDecryptingMassages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        String massage ="";
        for (int i = 0; i < numberOfLines; i++) {
            char input = scanner.nextLine().charAt(0);
            input += key;
            massage += input;
        }
        System.out.println(massage);
    }
}
