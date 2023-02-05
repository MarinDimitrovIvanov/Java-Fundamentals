import java.util.Scanner;

public class mEx2CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
    printClosestPoint(x1,y1,x2,y2);
    }
    public static void printClosestPoint (double x1, double y1, double x2, double y2){
        double diagonal1 =Math.sqrt(x1 * x1 + y1 * y1);
        double diagonal2 =Math.sqrt(x2 * x2 + y2 * y2);

        if (diagonal2 < diagonal1){
            System.out.printf("(%.0f, %.0f)", x2,y2);
        }else {
            System.out.printf("(%.0f, %.0f)", x1,y1);
        }
    }
}
