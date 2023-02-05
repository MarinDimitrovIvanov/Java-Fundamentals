import java.util.Scanner;

public class esWaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacityOfTack = 255;
        int sumLitres = 0;
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters > capacityOfTack){
                System.out.println("Insufficient capacity!");
            }else {
                capacityOfTack -= liters;
                sumLitres += liters;
            }
        }
        System.out.printf("%d",sumLitres);
    }
}
