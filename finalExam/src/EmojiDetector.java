import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        long coolThreshold = 1;
        for (int i = 0; i < input.length(); i++) {
            char current  = input.charAt(i);
            if (Character.isDigit(current)){
                int num = Integer.parseInt(""+input.charAt(i));
                coolThreshold *= num;
            }
        }
        System.out.println("Cool threshold: "+coolThreshold);

        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> emojisList = new ArrayList<>();
        int count = 0;
        while (matcher.find()){
            count++;
            long emojiCool = 0;
            String emojiPrint = matcher.group();
            String emoji = matcher.group("emoji");
            for (int i = 0; i < emoji.length(); i++) {
                char current = emoji.charAt(i);
                emojiCool += (int) current;
            }
            if (emojiCool > coolThreshold){
                emojisList.add(emojiPrint);
            }
        }
        System.out.println(count+" emojis found in the text. The cool ones are:");
        if(emojisList.size()>0){
            for (String emoji:emojisList) {
                System.out.println(emoji);
            }
        }

    }
}
