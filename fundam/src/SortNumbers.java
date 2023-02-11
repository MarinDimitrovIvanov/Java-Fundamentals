import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1  = Integer.parseInt(scanner.nextLine());
        int number2  = Integer.parseInt(scanner.nextLine());
        int number3  = Integer.parseInt(scanner.nextLine());
        int a, b, c;
        if (number1 >= number2){
            a = number1;
            b = number2;
        }else {
            a = number2;
            b = number1;
        }
        if (a >= number3){
               c = number3;
        }else {
            int currentA = a;
            a = number3;
            c = currentA;
        }
        if (b <= c) {
            int currentB = b;
            b = c;
            c = currentB;


        }
        System.out.printf("%d%n%d%n%d", a,b,c);

    }
}
