import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> passengerL = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!"end".equals(command)){

            if (command.startsWith("Add")){
               int passengerWagon = Integer.parseInt(command.split("\\s+")[1]);
                passengerL.add(passengerWagon);
            }else {
                int passengers = Integer.parseInt(command);
                for (int i = 0; i < passengerL.size(); i++) {
                 if ((passengerL.get(i)+passengers) <= capacity){
                     passengerL.set(i,(passengerL.get(i)+passengers));
                     break;
                 }
                }
            }
            command = scanner.nextLine();
        }

        for (int num: passengerL) {
            System.out.print(num +" ");
        }
    }
}
