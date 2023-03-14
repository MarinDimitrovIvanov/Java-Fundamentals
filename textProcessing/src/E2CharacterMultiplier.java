import java.util.Scanner;

public class E2CharacterMultiplier {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
        String firstString = input.split("\\s+")[0];
        String secondString = input.split("\\s+")[1];
        int totalSum = 0;
        if (firstString.length() == secondString.length()){
            for (int i = 0; i < firstString.length(); i++) {
                totalSum += firstString.charAt(i) * secondString.charAt(i);
            }

        } else if (firstString.length() > secondString.length()) {
            for (int i = 0; i < secondString.length(); i++) {
                totalSum += firstString.charAt(i) * secondString.charAt(i);
            }

            for (int i = secondString.length(); i < firstString.length(); i++) {
                totalSum += firstString.charAt(i);
            }

        }else {
            for (int i = 0; i < firstString.length(); i++) {
                totalSum += firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = firstString.length(); i < secondString.length(); i++) {
                totalSum += secondString.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
