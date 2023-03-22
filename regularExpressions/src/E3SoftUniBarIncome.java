import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E3SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%([^|$%.]*)<(?<product>\\w+)>([^|$%.]*)\\|(?<count>[0-9]+)\\|([^|$%.]*?)(?<price>[0-9]+[.]?[0-9]+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalSum = 0.0;
        String input = scanner.nextLine();
        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                System.out.printf("%s: %s - %.2f%n", name, product, count * price);
                totalSum += count * price;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
