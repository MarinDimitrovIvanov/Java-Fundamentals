import java.util.Scanner;

public class mesRefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNumberInRange = Integer.parseInt(scanner.nextLine());
        for (int number = 2; number <= maxNumberInRange; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, isPrime);
        }
    }
}

