import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e->Integer.parseInt(e))
                        .toArray();
        String input = scanner.nextLine();

              while (!"end".equals(input)){
            String[] commandLineArr = input.split(" ");
            String command = commandLineArr[0];

            if("decrease".equals(command)){
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i] -= 1;
                }
            }else {
                int index1 = Integer.parseInt(commandLineArr[1]);
                int index2 = Integer.parseInt(commandLineArr[2]);

                if ("swap".equals(command)){
                    int current = inputArr[index1];
                    inputArr[index1] = inputArr [index2];
                    inputArr [index2] = current;
                }else if("multiply".equals(command)){
                    inputArr[index1] *= inputArr[index2];
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < inputArr.length; i++) {

            System.out.print(inputArr[i]);
            if ( i < inputArr.length-1){
                System.out.print(", ");
            }

        }
    }
}
