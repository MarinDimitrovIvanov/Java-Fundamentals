import java.util.Scanner;

public class mEx4TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        calculateTribonacciElement(num);
    }
    public static void calculateTribonacciElement (int num){
        int[] numberArr = new int[4];
        numberArr[2] = 1;
        System.out.print(numberArr[2] + " ");
        for (int i = 0; i < num-1; i++) {
            numberArr[3] = numberArr[0]+numberArr[1]+numberArr[2];
            System.out.print(numberArr[3] + " ");
            for (int j = 1; j <= 3 ; j++) {
                numberArr[j-1] = numberArr[j];
            }
        }
    }
}
