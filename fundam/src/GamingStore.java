import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double startMoney = money;

        String input = scanner.nextLine();
        while (!"Game Time".equals(input)){
            double price = 0;
            boolean isfound = false;
            switch (input){
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    isfound = true;
                    break;
            }

            if (money >= price && !isfound){
                money -= price;
                System.out.printf("Bought %s%n",input);
            }else if (money < price){
                System.out.println("Too Expensive");
            }else {
                System.out.println("Not Found");
            }
            if (money == 0){
                System.out.println("Out of money!");
                break;
            }
            input = scanner.nextLine();
        }
        if (money>0){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", startMoney - money, money);

        }
    }
}
