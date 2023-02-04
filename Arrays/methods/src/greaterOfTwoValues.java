import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tape = scanner.nextLine();

        switch (tape){
            case "int":
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
                break;


        }

    }
    public static int getMax (int firstNum, int secondNum){

        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }
    public static char getMax (char firstchar, char secondChar){
        if (firstchar > secondChar){
            return firstchar;
        }
        return secondChar;
    }

    public static String getMax (String firstText, String secondText){
        if (firstText.compareTo(secondText) > 0){
            return firstText;
        }
        return secondText;
    }
}
