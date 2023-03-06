import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E2MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resource = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"stop".equals(input)) {
            String element = input;
            resource.putIfAbsent(element, 0);
            int quantity = Integer.parseInt(scanner.nextLine());
            resource.put(element, resource.get(element) + quantity);
            input = scanner.nextLine();
        }
        for (Map.Entry<String,Integer> entry:resource.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
