import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int sum = sumOfDigit(number1, number2);
        System.out.println(subtractDigit(sum, number3));
    }
    public static int sumOfDigit (int num1, int num2){
        return num1+num2;
    }
    public static int subtractDigit (int sum, int num3){
        return sum - num3;
    }


}
