import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;
        switch (typeOfGroup) {
            case "Students":
                switch (dayOfTheWeek) {
                    case "Friday":
                        price = numberOfGroup < 30 ? 8.45 : 8.45 * 0.85;
                        totalPrice = numberOfGroup * price;
                        break;
                    case "Saturday":
                        price = numberOfGroup < 30 ? 9.80 : 9.80 * 0.85;
                        totalPrice = numberOfGroup * price;
                        break;
                    case "Sunday":
                        price = numberOfGroup < 30 ? 10.46 : 10.46 * 0.85;
                        totalPrice = numberOfGroup * price;
                        break;
                }
                break;
            case "Business":
                switch (dayOfTheWeek) {
                    case "Friday":
                        price = 10.90;
                        totalPrice = numberOfGroup < 100 ? numberOfGroup * price : (numberOfGroup - 10) * price;
                        break;
                    case "Saturday":
                        price = 15.60;
                        totalPrice = numberOfGroup < 100 ? numberOfGroup * price : (numberOfGroup - 10) * price;
                        break;
                    case "Sunday":
                        price = 16;
                        totalPrice = numberOfGroup < 100 ? numberOfGroup * price : (numberOfGroup - 10) * price;
                        break;
                }
                break;
            case "Regular":
                switch (dayOfTheWeek) {
                    case "Friday":
                        price = 15;
                        if (numberOfGroup >= 10 && numberOfGroup <= 20) {
                            price *= 0.95;
                        }
                        totalPrice = numberOfGroup * price;
                        break;
                    case "Saturday":
                        price = 20;
                        if (numberOfGroup >= 10 && numberOfGroup <= 20) {
                            price *= 0.95;
                        }
                        totalPrice = numberOfGroup * price;
                        break;
                    case "Sunday":
                        price = 22.50;
                        if (numberOfGroup >= 10 && numberOfGroup <= 20) {
                            price *= 0.95;
                        }
                        totalPrice = numberOfGroup * price;
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
