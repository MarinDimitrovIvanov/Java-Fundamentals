import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double sumMoney = 0;
        while (!"Start".equals(input)){
            double coin = Double.parseDouble(input);
            if (coin == 0.1){
                sumMoney += 0.1;
            } else if (coin == 0.2) {
                sumMoney += 0.2;
            } else if (coin == 0.5) {
                sumMoney += 0.5;
            }else if (coin == 1.0) {
                sumMoney += 1.0;
            }else if (coin == 2.0) {
                sumMoney += 2.0;
            }else {
                System.out.printf("Cannot accept %.2f%n",coin);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!"End".equals(input)){
            String product = input;

            switch (product){
                case "Nuts":
                    if (sumMoney >= 2.0){
                        sumMoney -= 2.0;
                        System.out.printf("Purchased %s%n",product);
                    }else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Water":
                    if (sumMoney >= 0.7){
                        sumMoney -= 0.7;
                        System.out.printf("Purchased %s%n",product);
                    }else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Crisps":
                    if (sumMoney >= 1.5){
                        sumMoney -= 1.5;
                        System.out.printf("Purchased %s%n",product);
                    }else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Soda":
                    if (sumMoney >= 0.8){
                        sumMoney -= 0.8;
                        System.out.printf("Purchased %s%n",product);
                    }else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                case "Coke":
                    if (sumMoney >= 1.0){
                        sumMoney -= 1.0;
                        System.out.printf("Purchased %s%n",product);
                    }else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");

            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",sumMoney);
    }
}
