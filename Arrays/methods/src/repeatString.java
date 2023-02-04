import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s",repeatString(text,number));
    }
    public static String repeatString(String text, int num){
        String reatString ="";
        for (int i = 0; i < num ; i++) {
            reatString += text;
        }

        return  reatString;
    }
}
