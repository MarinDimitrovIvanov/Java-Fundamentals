import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String barcode = matcher.group();
                String group = "";
                for (int j = 0; j < barcode.length(); j++) {
                    char current = barcode.charAt(j);
                    if (Character.isDigit(current)) {
                        group += current;
                    }
                }
                if (group.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + group);
                }
            } else {
                System.out.println("Invalid barcode");
            }


        }


    }
}
