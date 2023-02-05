import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.nextLine().charAt(0);
        if (ch >= 97 && ch <= 122 ){
            System.out.println("lower-case");
        }else if (ch >= 65 && ch <= 90 ){
            System.out.print("upper-case");
        }
    }
}
