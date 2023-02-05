import java.util.Scanner;

public class P01SmallestOfTreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println(smallestNumber(number1,  number2, number3));

    }

    public static int smallestNumber(int num1, int num2, int num3){
        return  Math.min((Math.min(num1,num2)),num3);
    }
}
