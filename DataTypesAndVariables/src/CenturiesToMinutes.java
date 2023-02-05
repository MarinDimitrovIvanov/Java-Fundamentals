import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short number = Short.parseShort(scanner.nextLine());
        int years = number * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                number, years, days, hours, minutes);

    }
}
