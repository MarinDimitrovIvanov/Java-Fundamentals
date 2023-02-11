import java.util.Scanner;
public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        String word = "";

        for (int i = 1; i <= number; i++){
            String messageDigit = scan.nextLine();
            int mainDigit = Integer.parseInt(messageDigit);
            mainDigit = mainDigit %10;
            int digit = 0;
            if (mainDigit == 8 || mainDigit == 9){
                int textLength = (messageDigit.length()-1);
                digit = 1+((mainDigit-2)*3)+textLength;
            }else{
                int textLength = (messageDigit.length()-1);
                digit = ((mainDigit-2)*3)+textLength;
            }

            if (mainDigit == 0){
                word += " ";
                continue;
            }
            char letter = (char)(97+digit);
            word +=letter;
        }
        System.out.println(word);
    }
}
