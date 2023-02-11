import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printChar( first, second);

    }
    public static void printChar (char char1, char char2){
        if (char1 < char2 ){
            for (int i = char1+1; i < char2 ; i++) {
                System.out.print((char) i + " ");
            }
        } else if (char2 < char1) {
            for (int i = char2 + 1 ; i < char1 ; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
