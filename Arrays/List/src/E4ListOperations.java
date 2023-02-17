import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E4ListOperations {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();
        while (!"End".equals(commandLine)){
           if (commandLine.contains("Add")){
               int number = Integer.parseInt(commandLine.split("\\s+")[1]);
               numbers.add(number);
           } else if (commandLine.contains("Insert")) {
               int number = Integer.parseInt(commandLine.split("\\s+")[1]);
               int index = Integer.parseInt(commandLine.split("\\s+")[2]);
               if (index >= 0 && index <= numbers.size()){
                   numbers.add(index,number);
               }else {
                   System.out.println("Invalid index");
               }
           } else if (commandLine.contains("Remove")) {
               int index = Integer.parseInt(commandLine.split("\\s+")[1]);
               if (index >= 0 && index <= numbers.size()-1 ){
                   numbers.remove(index);
               }else {
                   System.out.println("Invalid index");
               }
           } else if (commandLine.contains("Shift left")) {
               int count = Integer.parseInt(commandLine.split("\\s+")[2]);
               for (int i = 0; i < count; i++) {
                   int firstNum = numbers.get(0);
                   numbers.remove(0);
                   numbers.add(firstNum);
               }

           } else if (commandLine.contains("Shift right")) {
               int count = Integer.parseInt(commandLine.split("\\s+")[2]);
               for (int i = 0; i < count; i++) {
                   int lastNum = numbers.get(numbers.size()-1);
                   numbers.remove(numbers.size()-1);
                   numbers.add(0,lastNum);
               }
           }
            commandLine = scanner.nextLine();
        }

        for (int num: numbers) {
            System.out.print(num +" ");
        }
    }
}
