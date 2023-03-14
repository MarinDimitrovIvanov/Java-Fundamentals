import java.util.Scanner;

public class E8LettersChangeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            char firstLetter = current.charAt(0);
            char lastLetter = current.charAt(current.length()-1);
            double number = Double.parseDouble(current.substring(1, current.length()-1));
            sum += operationFirstLetter(firstLetter,lastLetter,number);
        }
        System.out.printf("%.2f",sum);
    }
    private static double operationFirstLetter(char firstLetter,char lastLetter, double number) {
        double sum = 0;
        if (Character.isUpperCase(firstLetter)){
            sum = number/(firstLetter-64);
        }else {
            sum = number*(firstLetter-96);
        }
        if (Character.isUpperCase(lastLetter)){
            sum -= lastLetter-64;
        }else {
            sum +=lastLetter-96;
        }
        return sum;
    }
}
