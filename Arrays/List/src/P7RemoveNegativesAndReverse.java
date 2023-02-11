import java.util.*;
import java.util.stream.Collectors;

public class P7RemoveNegativesAndReverse {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

       numbers.removeIf(n -> n < 0);
        if (numbers.size() == 0 ){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);
            for (int num: numbers) {
                System.out.print(num + " ");
            }
        }
    }
}
