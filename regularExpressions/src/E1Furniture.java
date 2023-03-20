import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        System.out.println("Bought furniture:");
        double sum = 0;
        while (!"Purchase".equals(input)) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                System.out.println(furniture);
                sum += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total money spend: %.2f",sum);
    }
}
