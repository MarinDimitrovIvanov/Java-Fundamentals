import java.util.Arrays;
import java.util.Scanner;

public class mExSubmitSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] sumArr = new int[number];

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < input.length(); j++) {
                char cC = input.charAt(j);
                    if (cC == 65 || cC == 97 || cC == 69 || cC == 101 || cC == 73 || cC == 105
                            || cC == 79 || cC == 111 || cC == 85 || cC == 117) {
                        sum +=  cC * input.length();
                    } else {
                        sum +=  cC / input.length();
                    }
            }
            sumArr[i] = sum;
        }
        Arrays.sort(sumArr);

        for (int element:sumArr) {
            System.out.println(element);
        }
    }
}
