import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E1CountCharsInString {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i <= input.length()-1 ; i++) {
            char current = input.charAt(i);
            if (current == ' '){
                continue;
            }
            counts.putIfAbsent(current,0);
            counts.put(current,counts.get(current)+1);
        }
        for (Map.Entry<Character,Integer> entry:counts.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
