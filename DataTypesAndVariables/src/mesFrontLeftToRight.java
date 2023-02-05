import java.util.Scanner;

public class mesFrontLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nLines; i++) {

            long leftNumber = Long.parseLong(scanner.next());
            long rightNumber = Long.parseLong(scanner.next());
            long Sum = 0;

            if (leftNumber > rightNumber){
                while (leftNumber != 0){
                    Sum += leftNumber % 10;
                    leftNumber /= 10;
                }
            }else {
                while (rightNumber != 0){
                    Sum += rightNumber % 10;
                    rightNumber /= 10;
                }
            }
            System.out.println(Math.abs(Sum));
        }
    }
}
