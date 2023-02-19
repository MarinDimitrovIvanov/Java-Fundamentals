import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class heartDelivery {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> heartsForEachHouse = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int position = 0;
        while (!"Love!".equals(input)){
            int length = Integer.parseInt(input.split(" ")[1]);

            int index = length + position;
            if (index > heartsForEachHouse.size()-1){
                index = 0;
            }
            if (heartsForEachHouse.get(index) == 0){
                System.out.printf("Place %d already had Valentine's day.%n", index);
            }else {
                int current = heartsForEachHouse.get(index) - 2;
                heartsForEachHouse.set(index, current);
                if (current == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            }
            position = index;
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",position);
           int  countValentin = 0;
        for (int i = 0; i <= heartsForEachHouse.size()-1; i++) {
            if (heartsForEachHouse.get(i)==0){
                countValentin ++;
            }
        }
        if (countValentin == heartsForEachHouse.size()){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.",heartsForEachHouse.size()-countValentin);
        }
    }
}
