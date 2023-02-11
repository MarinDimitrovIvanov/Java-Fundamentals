import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",calculate(num1, operator, num2));

    }
    public static double calculate (int number1, char operator, int number2){
        double result = 0.0;
        switch (operator){
        case '/':
            result = 1.00 * number1 / number2;
            break;
        case '*':
            result = number1 * number2;
            break;
        case '+':
            result = number1 + number2;
            break;
        case '-':
            result = number1 - number2;
            break;
        }
        return  result;
    }
}
