import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(vowelsCount(text));

    }
    public static int vowelsCount (String input){

        int count = 0;
        for (char symbol : input.toLowerCase().toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i'  || symbol == 'o' || symbol == 'u')
                count++;
        }

        return  count;
    }
}
