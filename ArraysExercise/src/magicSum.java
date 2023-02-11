import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length-1; i++) {
            int currentElement = inputArr[i];
            for (int j = i+1; j < inputArr.length ; j++) {
                if (magicNumber == currentElement + inputArr[j]){
                    System.out.println("" + currentElement + " "+ inputArr[j]);
                }
            }
        }
    }
}
