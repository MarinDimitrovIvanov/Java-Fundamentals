import java.util.Scanner;

public class esSumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char current = scanner.nextLine().charAt(0);
            sum += current;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
