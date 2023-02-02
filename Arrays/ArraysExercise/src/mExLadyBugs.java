import java.util.Arrays;
import java.util.Scanner;

public class mExLadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfField = Integer.parseInt(scanner.nextLine());

        int[] indexesLadybugs = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e-> Integer.parseInt(e))
                    .toArray();
        String input = scanner.nextLine();
        while (!"end".equals(input)){
            String[] commandArr = input.split(" ");




        }
    }
}
