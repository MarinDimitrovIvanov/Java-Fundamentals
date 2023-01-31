import java.util.Arrays;
import java.util.Scanner;

public class mExRecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
        int prev = -1;
        int len = 1;
        for (int i = 0; i < inputArr.length; i++) {


        }
    }
}
