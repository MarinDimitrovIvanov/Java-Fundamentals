import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class P1CountRealNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                 .mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> count = new TreeMap<>();
         for (Double num:numbers) {
            if (!count.containsKey(num)){
                count.put(num, 0);
            }
            count.put(num, count.get(num)+1);
        }
        for (Map.Entry<Double, Integer> entry:count.entrySet()) {
            DecimalFormat df = new DecimalFormat("#,######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue() );
        }

    }
}
