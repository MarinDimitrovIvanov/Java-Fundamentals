import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if (isDivisibleTo8(i) && hasOneOddDigit(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isDivisibleTo8 (int num){
        int sum = 0;
        while (num > 0) {
            int current = num % 10;
            sum += current;
            num /= 10;
        }

        return  sum % 8 == 0;
    }
    public  static boolean hasOneOddDigit (int num){

        for (int i = 0; i < num; i++) {
            int current = num % 10;
            if (current % 2!= 0){
                return true;
            }
            num /= 10;
        }
        return false;
    }
}
