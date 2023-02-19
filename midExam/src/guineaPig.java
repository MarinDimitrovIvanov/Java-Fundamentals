import java.util.Scanner;

public class guineaPig {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double quantityFood  = Double.parseDouble(scanner.nextLine());
        double quantityHay = Double.parseDouble(scanner.nextLine());
        double quantityCover  = Double.parseDouble(scanner.nextLine());
        double guineaWeight   = Double.parseDouble(scanner.nextLine());
        boolean notEnough = false;
        for (int i = 1; i <= 30; i++) {
            quantityFood -= 0.3;
            if (i % 2 ==0){
                quantityHay -= 0.05 * quantityFood;
            }
            if (i % 3 == 0 ){
                quantityCover -= 1.0 * 1 / 3 * guineaWeight;
            }
            if (quantityFood <= 0.0001 || quantityHay <= 0.0001 || quantityCover <= 0.0001){
                notEnough = true;
                break;
            }
        }
        if (notEnough){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",quantityFood,quantityHay,quantityCover);
        }

    }
}
