import java.util.Scanner;

public class P09PalindromeInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (! "END".equals(input)){

                System.out.println(isPalindrome(input));

            input = scanner.nextLine();
        }
    }
    public static boolean isPalindrome (String text){
        int number = Integer.parseInt(text);
        int initial = number;
        int reversed = 0;
        while (number > 0){
         int current = number % 10;
         reversed += current;
         reversed *=10;
         number /= 10;
       }
        reversed /= 10;
        if (initial==reversed){
            return true;
        }else {
            return false;
        }
//        String reversed = "";
//        for (int i = text.length()-1; i >=0; i--) {
//            char symbol = text.charAt(i);
//            reversed += symbol;
//        }
//        if (reversed.equals(text)){
//            return true;
//        }else {
//            return false;
//        }
    }
}
