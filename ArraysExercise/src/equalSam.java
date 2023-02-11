import java.util.Arrays;
import java.util.Scanner;

public class equalSam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        boolean isFound = false;
        for (int i = 0; i < inputArr.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            int currentElement = inputArr[i];
            for (int j = 0; j < i; j++) {
                sumLeft += inputArr[j];
            }
            for (int j = i+1; j < inputArr.length ; j++) {
                sumRight += inputArr[j];
            }
            if (sumLeft == sumRight){
                System.out.println(i);
                isFound = true;
                break;
            }

        }
            if (!isFound){
                System.out.println("no");
            }
    }
}
