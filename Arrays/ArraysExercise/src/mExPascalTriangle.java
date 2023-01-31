import java.util.Scanner;

public class mExPascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


            int[] elementArr = new int[3];
        elementArr[0] =0; elementArr [1] = 1; elementArr[2] = 0;
            System.out.println(elementArr[1] +" ");

            for (int i = 1; i < number; i++) {
              int[] nextArr = new int[elementArr.length+i];
                nextArr[0] = 0;
                nextArr[elementArr.length+i-1] = 0;
                for (int j = 1; j < nextArr.length-1 ; j++) {
                    nextArr[j] = elementArr[j-1]+elementArr[j];
                }
                for (int k = 1; k < nextArr.length-1; i++) {
                    System.out.print(nextArr[k] +" ");
                }
                System.out.println();
               elementArr = nextArr;
            }

    }
}
