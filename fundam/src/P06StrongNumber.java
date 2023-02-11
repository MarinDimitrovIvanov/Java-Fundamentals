import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sumFact = 0;
        while (number > 0){
            int current = number % 10;
            int fact = 1;
            for (int i = 1; i <= current ; i++) {
                fact *= i;
            }
            sumFact += fact;
            number /= 10;
        }
        if (startNumber == sumFact){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
