import java.util.Scanner;

public class calculateRectArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double heght = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.0f",calculateArea(width,heght));

    }
    public static double calculateArea(double a, double b){
        return a * b;
    }
}
