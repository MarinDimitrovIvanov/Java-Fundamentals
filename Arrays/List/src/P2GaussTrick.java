import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2GaussTrick {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> gaussList = new ArrayList<>();

        if (numbers.size() % 2 == 0 ){

            int count = numbers.size() /2;
            for (int i = 0; i < count; i++) {
                int sum = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
                gaussList.add(0, sum);
            }

        }else{
                int count = numbers.size() /2;
                for (int i = 0; i < count; i++) {
                    int sum = numbers.get(i) + numbers.get(numbers.size() - 1 - i);
                    gaussList.add(0, sum);
                }
                gaussList.add(numbers.get(numbers.size()/2));
        }

        for (int number:gaussList) {
            System.out.print(number +" ");
        }
    }

}
