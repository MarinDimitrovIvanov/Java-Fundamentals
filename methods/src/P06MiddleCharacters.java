import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        printMiddleChar(text);

    }
    public static  void  printMiddleChar (String text){
        int count = 0;
        for (char symbol:text.toCharArray()) {
            count ++;
        }
        if (count % 2 != 0){
            System.out.println(text.charAt(count / 2) );
        }else {
            System.out.print(text.charAt(count / 2 - 1) );
            System.out.print(text.charAt(count / 2) );
        }

    }

}
