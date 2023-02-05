import java.util.Scanner;

public class esElevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double couses = Math.ceil(numberOfPeople *1.0 / capacity);
        System.out.printf("%.0f",couses);
    }
}
