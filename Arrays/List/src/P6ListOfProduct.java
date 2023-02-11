import java.util.*;

public class P6ListOfProduct {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < num; i++) {
        products.add(scanner.nextLine());
        }

        Collections.sort (products);

        int number = 1;
        for (String product : products) {
            System.out.println(number + "."+ product);
            number++;
        }


    }
}
