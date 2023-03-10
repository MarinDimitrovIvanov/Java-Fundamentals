import java.util.Scanner;
import java.util.Arrays;
public class treasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] initialLootsArr = scanner.nextLine().split("\\|");



        String input = scanner.nextLine();

        while (!"Yohoho!".equals(input)){
        String[] commandLineArr = input.split(" ");
        String command = commandLineArr[0];
        switch (command){
            case "Loot":

                for (int i = 1; i < commandLineArr.length; i++) {
                    String curElement = commandLineArr[i];
                    boolean haveIt = false;
                    for (int j = 0; j < initialLootsArr.length; j++) {
                        if (curElement.equals(initialLootsArr[j])){
                          haveIt = true;
                          break;
                        }
                    }
                        if (!haveIt) {
                            String[] newArr = new String[1 + initialLootsArr.length];
                            newArr[0] = curElement;
                            for (int k = 0; k < initialLootsArr.length; k++) {
                                newArr[k + 1] = initialLootsArr[k];
                            }
                            initialLootsArr = newArr;
                        }
                }
                break;
            case "Drop":
                int index = Integer.parseInt(commandLineArr[1]);

                if (index > 0 && index < initialLootsArr.length) {
                    String oldElement = initialLootsArr[index];
                    for (int i = index ; i < initialLootsArr.length - 1; i++) {
                        initialLootsArr[i] = initialLootsArr[i + 1];
                    }
                    initialLootsArr[initialLootsArr.length - 1] = oldElement;
                }
                break;
            case "Steal":
                int indexSteal = Integer.parseInt(commandLineArr[1]);
                if (indexSteal > initialLootsArr.length){
                    indexSteal = initialLootsArr.length;
                }
                for (int i = initialLootsArr.length-(indexSteal); i < initialLootsArr.length ; i++) {
                    System.out.print(initialLootsArr[i]);
                    if (i < initialLootsArr.length-1 ){
                        System.out.print(", ");
                    }
                }

                initialLootsArr = Arrays.copyOf(initialLootsArr, initialLootsArr.length-indexSteal);
                break;
        }
            input = scanner.nextLine();
        }
            int sum = 0;
        for (int i = 0; i < initialLootsArr.length; i++) {
            int numberOfLetters = initialLootsArr[i].length();
            sum += numberOfLetters;
        }
        double average = (1.0 * sum) / initialLootsArr.length;
        System.out.println();
        if (initialLootsArr.length > 0) {
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
