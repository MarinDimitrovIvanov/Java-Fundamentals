import java.math.BigDecimal;
import java.util.Scanner;

public class mesFloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal diff = new BigDecimal(0);

        BigDecimal numberA = new BigDecimal(scanner.nextLine());
        BigDecimal numberB = new BigDecimal(scanner.nextLine());
            diff = numberA.subtract(numberB);

        System.out.println(diff);

    }
}
