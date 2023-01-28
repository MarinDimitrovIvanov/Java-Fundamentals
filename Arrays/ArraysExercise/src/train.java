import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());

        int[] peopleArr = new int[numberOfWagons];
        for (int i = 0; i < peopleArr.length; i++) {
            peopleArr[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int number : peopleArr) {
            sum += number;
            System.out.print(number + " ");
        }
        System.out.printf("%n%d",sum);
    }
}
