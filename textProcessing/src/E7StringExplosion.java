import java.util.Scanner;

public class E7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(currentChar != '>' && count > 0 ){
                count--;
            }else {
                sb.append(currentChar);
                if (currentChar == '>') {
                    int power = Character.getNumericValue(input.charAt(i + 1));
                    count += power;
                }
            }
        }

        System.out.println(sb);
    }
}
