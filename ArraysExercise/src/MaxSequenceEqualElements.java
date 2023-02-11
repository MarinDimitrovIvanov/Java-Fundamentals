import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
        int mostExist = 0;
        int maxCount = 0;
        for (int i = 0; i < inputArr.length; i++) {
            int current = inputArr[i];
            int count = 1;
            for (int j = i + 1; j <inputArr.length ; j++) {
                if ( current == inputArr[j]){
                    count ++;
                    if (maxCount < count){
                        maxCount = count;
                        mostExist = inputArr[j];
                    }
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(mostExist + " ");
        }
    }
}
