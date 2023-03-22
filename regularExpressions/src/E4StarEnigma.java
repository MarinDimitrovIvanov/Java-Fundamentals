import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E4StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            String inputLowerCase = input.toLowerCase();
            int key = 0;
            for (int j = 0; j < input.length(); j++) {
                char current = inputLowerCase.charAt(j);
                if (current == 's' || current == 't' || current == 'a' || current == 'r') {
                    key++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char current = input.charAt(j);
                current -= key;
                sb.append(current);
            }
            String command = sb.toString();
            String regex = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:[0-9]+[^@\\-!:>]*!(?<attack>[AD]{1})![^@\\-!:>]*->[0-9]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(command);
            if (matcher.find()) {
                String planet = matcher.group("planet");
                String attack = matcher.group("attack");
                if (attack.equals("D")) {
                    destroyed.add(planet);
                } else if (attack.equals("A")) {
                    attacked.add(planet);
                }
            }
        }

        System.out.println("Attacked planets: " + attacked.size());
        Collections.sort(attacked);
        attacked.forEach(e -> System.out.println("-> " + e));
        System.out.println("Destroyed planets: " + destroyed.size());
        Collections.sort(destroyed);
        destroyed.forEach(e -> System.out.println("-> " + e));
    }
}
