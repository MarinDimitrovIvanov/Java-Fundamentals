import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E2ChangeList {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();
        while (!"end".equals(commandLine)){
            String command = commandLine.split(" ")[0];
            switch (command){
                case "Delete":
                    int element = Integer.parseInt(commandLine.split("\\s+")[1]);
                    numbers.removeAll(Arrays.asList(element));
                    break;

                case"Insert":
                    int elementToInsert = Integer.parseInt(commandLine.split("\\s+")[1]);
                    int position = Integer.parseInt(commandLine.split("\\s+")[2]);
                    numbers.add(position,elementToInsert);
                    break;
            }
            commandLine = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num +" ");
        }
    }
}
