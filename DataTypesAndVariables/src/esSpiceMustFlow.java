import java.util.Scanner;

public class esSpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int sumOfYield = 0;
        int days = 0;

        if (startingYield < 100) {
            System.out.printf("%d%n%d",days, sumOfYield);
        }else {
            while (startingYield >= 100){ ;

                days++;
                sumOfYield += startingYield - 26;
                startingYield -= 10;
            }
            sumOfYield -= 26;
            System.out.printf("%d%n%d",days, sumOfYield);
        }
    }
}
