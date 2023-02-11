import java.text.DecimalFormat;
import java.util.Scanner;

public class matPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat( "0.####").format(mathPower(number, power)));
    }
    public static double mathPower(double num, int pow){
        return Math.pow(num,pow);
    }
}
