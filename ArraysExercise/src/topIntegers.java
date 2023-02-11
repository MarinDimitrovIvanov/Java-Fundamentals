import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(e-> Integer.parseInt(e))
            .toArray();

        for (int i = 0; i < numberArr.length; i++) {
            int current = numberArr[i];
            boolean isBigger = true;
            for (int j = i+1; j < numberArr.length; j++) {
                int nextNumber = numberArr[j];
                if (current <= nextNumber){
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(current + " ");
            }
        }
    }
}
