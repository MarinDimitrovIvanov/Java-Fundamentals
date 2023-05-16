import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(#|@)(?<word>[a-zA-Z]{3,})\\1\\1(?<word1>[a-zA-Z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        List<String> mirrorWords = new ArrayList<>();
        boolean isFind = false;
            while (matcher.find()) {
                isFind = true;
                count++;
                String word = matcher.group("word");
                String word1 = matcher.group("word1");
                StringBuilder reversed = new StringBuilder(word).reverse();
                if (reversed.toString().equals(word1)) {
                    mirrorWords.add(word);
                    mirrorWords.add(word1);
                }
            }
        if (isFind) {
            System.out.println(count + " word pairs found!");
        } else {
            System.out.println("No word pairs found!");
        }
        if(mirrorWords.size()>0){
            System.out.println("The mirror words are:");
            for (int i = 0; i < mirrorWords.size(); i += 2) {
                if (i == mirrorWords.size() - 2) {
                    System.out.print(mirrorWords.get(i) + " <=> " + mirrorWords.get(i + 1));
                } else {
                    System.out.print(mirrorWords.get(i) + " <=> " + mirrorWords.get(i + 1) + ", ");
                }

            }
        } else {
            System.out.println("No mirror words!");

        }
    }
}

