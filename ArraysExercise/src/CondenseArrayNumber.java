import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e-> Integer.parseInt(e))
                .toArray();
        while (numArr.length > 1){
            int[] condensed = new int[numArr.length-1];

            for (int i = 0; i < numArr.length-1 ; i++) {
                int current = numArr[i] + numArr[i + 1];
                condensed[i] = current;
            }
            numArr = condensed;
        }
        System.out.println(numArr[0]);
    }
}
