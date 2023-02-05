import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int digit = 1; digit <= n; digit++) {
            int currentDigit = digit;
            int sum = 0;
            while (currentDigit > 0) {
                sum += currentDigit % 10;
                currentDigit /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", digit);
            }else {
                System.out.printf("%d -> False%n", digit);
            }

        }
    }
}
