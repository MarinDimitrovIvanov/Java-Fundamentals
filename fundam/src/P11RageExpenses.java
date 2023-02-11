import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lostGames   = Integer.parseInt(scanner.nextLine());
        double headsetPrice   = Double.parseDouble(scanner.nextLine());
        double mousePrice   = Double.parseDouble(scanner.nextLine());
        double keyboardPrice  = Double.parseDouble(scanner.nextLine());
        double displayPrice  = Double.parseDouble(scanner.nextLine());

        double sum = lostGames / 2 * headsetPrice
                   + lostGames / 3 * mousePrice
                   + lostGames / 6 * keyboardPrice
                   + lostGames / 12 * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",sum);
    }
}
