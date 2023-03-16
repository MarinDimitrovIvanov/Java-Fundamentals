import java.util.Arrays;
import java.util.Scanner;

public class ME3treasureFinder {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int[] key = Arrays.stream(scanner.nextLine().split("\\s+"))
                 .mapToInt(Integer::parseInt).toArray();
         String cryptMassage = scanner.nextLine();
         while (!"find".equals(cryptMassage)){
             StringBuilder sb = new StringBuilder();
             for (int i = 0; i < cryptMassage.length(); i++) {
             char current = cryptMassage.charAt(i);
             int currentKey = key[i % key.length];
             current -= currentKey;
             sb.append(current);
             }
            int startIndexOfTreasure = sb.indexOf("&");
             int endIndexOfTreasure = sb.lastIndexOf("&");
             String treasure = sb.substring(startIndexOfTreasure+1,endIndexOfTreasure);
             int startIndexCoordinates = sb.indexOf("<");
             int endIndexCoordinates = sb.lastIndexOf(">");
             String coordinates = sb.substring(startIndexCoordinates+1,endIndexCoordinates);
             System.out.printf("Found %s at %s%n",treasure, coordinates);

             cryptMassage = scanner.nextLine();
         }

    }
}
