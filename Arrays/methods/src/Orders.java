import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
           switch (product){
               case "coffee":
                   printSumOfCoffee(quantity);
                   break;
               case "water":
                   printSumOfWater(quantity);
                   break;
               case "coke":
                   printSumOfCoke(quantity);
                   break;
               case "snacks":
                  printSumOfSnacks(quantity);
                   break;
           }
    }
    public static void printSumOfCoffee(int quantity){
        System.out.printf("%.2f",quantity * 1.50);
    }
    public static void printSumOfWater(int quantity){
        System.out.printf("%.2f",quantity * 1.0);
    }
    public static void printSumOfCoke(int quantity){
        System.out.printf("%.2f",quantity * 1.40);
    }
    public static void printSumOfSnacks(int quantity){
        System.out.printf("%.2f",quantity * 2.00);
    }
}
