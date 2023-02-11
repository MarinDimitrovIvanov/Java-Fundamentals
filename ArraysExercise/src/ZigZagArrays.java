import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[number];
        int[] secondArr = new int [number];

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0){
                firstArr[i-1] = scanner.nextInt();
                secondArr[i-1] = scanner.nextInt();
            }else {
                secondArr[i-1] = scanner.nextInt();
                firstArr[i-1] = scanner.nextInt();
            }
        }
        for (int num : firstArr ) {
            System.out.print(num +" " );
        }
        System.out.println();
        for (int num : secondArr ) {
            System.out.print(num +" " );
        }
    }
}
