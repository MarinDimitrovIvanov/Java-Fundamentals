import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4WordFilter {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] wordEvenLength = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(w->w.length() % 2 == 0)
                .toArray(String[]::new);
                ;

        for (String word:wordEvenLength) {
            System.out.println(word);
        }
    }
}
