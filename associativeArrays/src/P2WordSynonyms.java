import java.util.*;

public class P2WordSynonyms {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();
        for (int i = 0; i < num; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            wordsMap.putIfAbsent(word,new ArrayList<>());
            wordsMap.get(word).add(synonym);
        }
        for (Map.Entry<String,ArrayList<String>> entry:wordsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(), String.join(", ",entry.getValue()));
        }

    }
}
