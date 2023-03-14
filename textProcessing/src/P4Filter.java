import java.util.Scanner;

public class P4Filter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String[] banWord = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < banWord.length; i++) {
            String currentBanWord = banWord[i];
            String asterisk = "";
            int asterisksNum = currentBanWord.length();
            for (int j = 0; j < asterisksNum; j++) {
                asterisk += '*';
            }
            text = text.replaceAll(currentBanWord,asterisk);
        }
        System.out.println(text);
    }
}
