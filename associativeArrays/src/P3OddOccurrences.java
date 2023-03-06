import java.util.*;

public class P3OddOccurrences {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String[] input = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : input) {
            String lowerCaseWord = word.toLowerCase();
            counts.putIfAbsent(lowerCaseWord,0);
            counts.put(lowerCaseWord, counts.get(lowerCaseWord)+1);
        }
      List<String> output = new ArrayList<>();

        for (Map.Entry<String,Integer> entry: counts.entrySet()) {
            if (entry.getValue() % 2 != 0 ){
                output.add(entry.getKey());
            }
        }
        for (int i = 0; i < output.size(); i++) {
            if (i<output.size()-1){
                System.out.printf("%s, ",output.get(i));
            }else {
                System.out.printf("%s",output.get(i));
            }
        }
    }
    }
