import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printIntegerSign(number);
    }
    public static void printIntegerSign(int num){
        String signWord = "";
    if (num > 0){
        signWord = "positive";
    } else if (num < 0) {
        signWord = "negative";
    }else {
        signWord = "zero";
    }
        System.out.printf("The number %d is %s.",num , signWord);
    }
}
