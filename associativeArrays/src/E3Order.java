import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E3Order {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"buy".equals(input)){
        String product = input.split(" ")[0];
        double price = Double.parseDouble(input.split(" ")[1]);
        int quantity = Integer.parseInt(input.split(" ")[2]);

        productPrice.putIfAbsent(product,0.0);
        productPrice.put(product, price);

        productQuantity.putIfAbsent(product,0);
        productQuantity.put(product, productQuantity.get(product)+quantity);
            input = scanner.nextLine();
        }
//        for (Map.Entry<String, Double> entry:productPrice.entrySet()) {
//            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()*productQuantity.get(entry.getValue()));
//        }

        productPrice.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value * productQuantity.get(key)));
    }
}
