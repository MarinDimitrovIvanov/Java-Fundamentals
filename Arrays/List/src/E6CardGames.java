import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E6CardGames {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCard = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCard = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while ( !(firstPlayerCard.isEmpty() || secondPlayerCard.isEmpty()) ){
            if (firstPlayerCard.get(0) > secondPlayerCard.get(0)){
                int currentFirst = firstPlayerCard.get(0);
                int currentSecond = secondPlayerCard.get(0);
                firstPlayerCard.remove(0);
                secondPlayerCard.remove(0);
                firstPlayerCard.add(currentFirst);
                firstPlayerCard.add(currentSecond);
            } else if ( firstPlayerCard.get(0) < secondPlayerCard.get(0)) {
                int currentFirst = firstPlayerCard.get(0);
                int currentSecond = secondPlayerCard.get(0);
                firstPlayerCard.remove(0);
                secondPlayerCard.remove(0);
                secondPlayerCard.add(currentSecond);
                secondPlayerCard.add(currentFirst);
            }else {
                firstPlayerCard.remove(0);
                secondPlayerCard.remove(0);
            }
        }
        int sum = 0;
        if (firstPlayerCard.isEmpty()){
            for (int num:secondPlayerCard) {
                sum +=num;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }else {
            for (int num:firstPlayerCard) {
                sum +=num;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
    }
}
