import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotation; i++) {

        String current = inputArr[0];
        for (int j = 0; j < inputArr.length-1; j++) {
            inputArr[j] = inputArr [j+1];
        }
        inputArr [inputArr.length-1] = current;
        }
        for (String element:inputArr) {
            System.out.print(element + " ");
        }
    }
}
