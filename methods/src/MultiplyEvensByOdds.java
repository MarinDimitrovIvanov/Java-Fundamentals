import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(evenSum(Math.abs(number)) * oodSum(Math.abs(number)));
    }
    public static int evenSum (int num ) {
        int sum = 0;
        while (num > 0) {
            int current = num % 10;
            if (current % 2 == 0) {
                sum += current;
            }
            num /= 10;
        }
        return sum;
    }
    public static int oodSum (int num ) {
        int sum = 0;
        while (num > 0) {
            int current = num % 10;
            if (current % 2 != 0) {
                sum += current;
            }
            num /= 10;
        }
        return sum;
    }




}
