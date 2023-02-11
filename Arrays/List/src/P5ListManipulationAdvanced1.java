import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5ListManipulationAdvanced1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            if (command.startsWith("Contains")){
                int number = Integer.parseInt(command.split("\\s+")[1]);
                isContains (numbers,number);
            } else if (command.startsWith("Print")) {
                String evenOdd = command.split("\\s+")[1];
                if (evenOdd.equals("even")){
                    printEven(numbers);
                } else if (evenOdd.equals("odd")) {
                    printOdd(numbers);
                }
            } else if (command.startsWith("get")) {
                printSum(numbers);
            } else if (command.startsWith("Filter")) {
                String condition = command.split("\\s+")[1];
                int num = Integer.parseInt(command.split("\\s+")[2]);
                printWithCondition(numbers, condition, num);
            }

            command = scanner.nextLine();
        }
    }

    private static void printOdd(List<Integer> numbers) {
        for (int num:numbers) {
            if (num % 2 != 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printWithCondition(List<Integer> numbers,String condition, int num) {
        switch (condition){
            case "<":
                for (int element : numbers) {
                    if (element < num){
                        System.out.print(element + " ");
                    }
                }
                break;
            case ">":
                for (int element : numbers) {
                    if (element > num){
                        System.out.print(element + " ");
                    }
                }
                break;
            case ">=":
                for (int element : numbers) {
                    if (element >= num){
                        System.out.print(element + " ");
                    }
                }
                break;
            case"<=":
                for (int element : numbers) {
                    if (element <= num){
                        System.out.print(element + " ");
                    }
                }
                break;
        }
        System.out.println();
    }
    private static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
    private static void printEven(List<Integer> numbers) {
        for (int num:numbers) {
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    private static void isContains(List<Integer> numbers, int number) {
        if (numbers.contains(number)){
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }
    }
}
