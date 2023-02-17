import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E3HouseParty {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

         for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            if (input.contains("is going")){
                if (guests.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    guests.add(name);
                }
            }else if(input.contains("is not going")){
                if (!guests.contains(name)){
                    System.out.printf("%s is not in the list!%n", name);
                }else {
                    guests.remove(name);
                }
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
