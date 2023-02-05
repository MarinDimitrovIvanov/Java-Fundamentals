import java.util.Scanner;

public class esSnowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfSnowballs = Integer.parseInt(scanner.nextLine());
        double highestValue = 0;
        int highestSnow = 0;
        int highestTime = 0;
        double highestQuality = 0;
        for (int i = 0; i < numOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowDevTime = snowballSnow * 1.0 / snowballTime;
            double snowBallQuality = Math.pow(snowDevTime, snowballQuality);
            if (highestValue < snowBallQuality){
                highestSnow = snowballSnow;
                highestTime = snowballTime;
                highestQuality = snowballQuality;
                highestValue = snowBallQuality;

            }
        }
        System.out.printf("%d : %d = %.0f (%.0f)",highestSnow, highestTime, highestValue,highestQuality );
    }
}
