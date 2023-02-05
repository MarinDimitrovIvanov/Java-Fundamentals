import java.util.Scanner;

public class mEx3LongestLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        if (lengthOfLine(x1,y1,x2,y2) >= lengthOfLine(x3,y3,x4,y4)){
            printClosestPoint(x1,y1,x2,y2);
        }else {
            printClosestPoint(x3,y3,x4,y4);
        }
    }
    public static double lengthOfLine (double x1, double y1, double x2, double y2){
        double l1 = Math.abs(y2-y1);
        double l2 = Math.abs(x2-x1);
        double distance = Math.sqrt(l1 * l1 + l2 * l2);

        return distance;
    }
    public static void printClosestPoint (double x1, double y1, double x2, double y2){
        double distance1 =Math.sqrt(x1 * x1 + y1 * y1);
        double distance2 =Math.sqrt(x2 * x2 + y2 * y2);

        if (distance2 < distance1){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f) ", x2,y2,x1,y1);
        }else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1,y1,x2,y2);
        }
    }
}
