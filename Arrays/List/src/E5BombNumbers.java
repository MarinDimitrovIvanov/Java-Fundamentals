import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E5BombNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .collect(Collectors.toList());

        String bombPower = scanner.nextLine();
        int bomb = Integer.parseInt(bombPower.split("\\s+")[0]);
        int power = Integer.parseInt(bombPower.split("\\s+")[1]);

       while (numbers.contains(bomb)){

           int bombIndex = numbers.indexOf(bomb);

           int leftIndex = Math.max(0, bombIndex-power);
           int rightIndex = Math.min(bombIndex+power, numbers.size()-1);

           for (int i = rightIndex; i >= leftIndex ; i--) {
               numbers.remove(i);
           }
       }

        int sum = 0;
        for (int num : numbers ) {
            sum += num;
        }
        System.out.println(sum);

        //System.out.println(numbers.stream().mapToInt(Integer::parseInt).sum());
    }
}
