import java.util.Scanner;

public class E6ReplaceRepeatingChar {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < input.length()-1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i+1);
            if (current != next){
                sb.append(current);
            }
        }
        sb.append(input.charAt(input.length()-1));

        System.out.println(sb);
    }
}
