import java.util.Scanner;

public class esBeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = Double.MIN_VALUE;
        String modelOfKen ="";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume > biggestKeg){
                modelOfKen = model;
                biggestKeg = volume;
            }
        }
        System.out.printf("%s",modelOfKen);
    }
}
