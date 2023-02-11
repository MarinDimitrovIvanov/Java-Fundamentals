import java.util.Scanner;

public class SortNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1  = Integer.parseInt(scanner.nextLine());
        int number2  = Integer.parseInt(scanner.nextLine());
        int number3  = Integer.parseInt(scanner.nextLine());
        int a, b, c;
        if (number1 >= number2 && number1 >= number3) {
            a = number1;
            if (number2 >= number3) {
                b = number2;
                c = number3;
            } else {
                b = number3;
                c = number2;
            }
        } else if (number2 >= number1 && number2 >= number3) {
            a = number2;
            if (number1 >= number3) {
                b = number1;
                c = number3;
            } else {
                b = number3;
                c = number1;
            }
        } else {
            a = number3;
            if (number1 >= number2) {
                b = number1;
                c = number2;
            } else {
                b = number2;
                c = number1;
            }
        }

        System.out.printf("%d%n%d%n%d", a,b,c);

    }
}
