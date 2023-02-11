import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney  = Double.parseDouble(scanner.nextLine());
        int countOfStudents  = Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber   = Double.parseDouble(scanner.nextLine());
        double priceOfRobe   = Double.parseDouble(scanner.nextLine());
        double priceOfBelt  = Double.parseDouble(scanner.nextLine());

        double sumNeeded = (priceOfLightsaber * Math.ceil(1.10 * countOfStudents))
                        + priceOfRobe * countOfStudents + priceOfBelt * (countOfStudents-countOfStudents/6);

        if (sumNeeded <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.",sumNeeded);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",sumNeeded-amountOfMoney);
        }
    }
}
