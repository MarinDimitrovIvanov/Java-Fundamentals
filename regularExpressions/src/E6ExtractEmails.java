import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E6ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s*,\\s*");
        for (int i = 0; i < input.length; i++) {
            String regexHealth = "[^0-9+\\-*/.]";
            Pattern patternHealth = Pattern.compile(regexHealth);
            int sumHealth = 0;
            Matcher matcher = patternHealth.matcher(input[i]);
            while (matcher.find()) {
                sumHealth += matcher.group().charAt(0);
            }
            String regexDamage = "[+\\-]?[0-9]+[.]?[0-9]*";
            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher matcherDamage = patternDamage.matcher(input[i]);
            double sumDamage = 0;
            while (matcherDamage.find()) {
                    sumDamage += Double.parseDouble(matcherDamage.group());
                }

            for (int j = 0; j < input[i].length(); j++) {
                char current = input[i].charAt(j);
                if (current == '*') {
                    sumDamage *= 2;
                }
                if (current == '/') {
                    sumDamage /= 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", input[i], sumHealth, sumDamage);
        }
    }
}
