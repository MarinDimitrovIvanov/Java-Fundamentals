import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .map(Double::parseDouble)
                                .collect(Collectors.toList());


        int length = numbers.size()-1;
        for (int i = 0; i < length; i++) {
            if (numbers.get(i).equals(numbers.get(i+1))){
                numbers.set(i,numbers.get(i)+numbers.get(i+1));
                numbers.remove(i+1);
                i= -1;
                length -= 1;

            }
        }
        for (double number:numbers) {
            System.out.print(new DecimalFormat("0.#").format( number) + " ");
        }

    }
}
