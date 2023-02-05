import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",1.00*calculateFactorial(num1)/calculateFactorial(num2));
    }
    public static long calculateFactorial ( int num){
        long factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
