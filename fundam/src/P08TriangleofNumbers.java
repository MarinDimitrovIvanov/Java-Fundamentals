import java.util.Scanner;

public class P08TriangleofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
