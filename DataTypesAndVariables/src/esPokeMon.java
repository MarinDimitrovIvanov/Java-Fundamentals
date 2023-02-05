import java.util.Scanner;

public class esPokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int halfPower = 0;
        if (pokePower % 2 == 0){
            halfPower = pokePower / 2;
        }
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor  = Integer.parseInt(scanner.nextLine());
        int powerLeft = pokePower;
        int countPoke = 0;
        while (powerLeft >= distance){
            countPoke ++;
            powerLeft -= distance;
            if (halfPower == powerLeft  && exhaustionFactor != 0) {
                powerLeft /= exhaustionFactor;
            }

        }

        System.out.printf("%d%n%d", powerLeft, countPoke);
    }
}
