import java.util.Arrays;
import java.util.Scanner;

public class mEx6ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(e->Integer.parseInt(e))
            .toArray();
    String input = scanner.nextLine();
    while (!"end".equals(input)){
        String[] commandline = input.split(" ");
        String command = commandline[0];
        switch (command){
            case "exchange":
                int index = Integer.parseInt(commandline[1]);
                if (index < 0 || index > numbers.length-1){
                    System.out.println("Invalid index");
                }else {
                    int[] changedArr = new int[numbers.length];
                    for (int i = index + 1; i < numbers.length; i++) {
                        changedArr[i - (index + 1)] = numbers[i];
                    }
                    for (int i = index; i >= 0; i--) {
                        changedArr[i + changedArr.length - 1 - index] = numbers[i];
                    }
                    numbers = changedArr;
                }
                break;
            case "max":
                String type = commandline[1];
                if ("even".equals(type)){
                    int maxEven = maxEven(numbers);
                    if (maxEven >-1){
                        System.out.println(maxEven);
                    }else {
                        System.out.println("Invalid index");
                    }
                }else if("odd".equals(type)){
                    int maxOdd  = maxOdd(numbers);
                    if (maxOdd >-1){
                        System.out.println(maxOdd);
                    }else {
                        System.out.println("Invalid index");
                    }
                }
                break;
            case "min":
                String typeMin = commandline[1];
                if ("even".equals(typeMin)){
                    int minEven = minEven(numbers);
                    if (minEven >-1){
                        System.out.println(minEven);
                    }else {
                        System.out.println("Invalid index");
                    }
                }else if("odd".equals(typeMin)){
                    int minOdd  = minOdd(numbers);
                    if (minOdd >-1){
                        System.out.println(minOdd);
                    }else {
                        System.out.println("Invalid index");
                    }
                }
                break;
            case "first":

                break;
            case "last":

                break;



        }

        input = scanner.nextLine();
    }

    }
    public static int maxEven (int[] numbers){
        int maxnum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current % 2 == 0) {
                if (current >= maxnum) {
                    maxnum = current;
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }
    public static int maxOdd(int[] numbers){
        int maxnum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current % 2 != 0) {
                if (current >= maxnum) {
                    maxnum = current;
                    maxIndex = i;
                }
            }
        }
        return maxIndex;
    }

    public static int minOdd (int[] numbers){
        int minNum = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current % 2 != 0) {
                if (current <= minNum) {
                    minNum = current;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
    public static int minEven (int[] numbers){
        int minNum = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            if (current % 2 == 0) {
                if (current <= minNum) {
                    minNum = current;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }

}
