import java.math.BigInteger;
import java.util.Scanner;

public class E5MultiplyBigNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();
        BigInteger sum = new BigInteger( "1");
        sum = sum.multiply(number).multiply(secondNumber);
        System.out.println(sum);

    }
}
