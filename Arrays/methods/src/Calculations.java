import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String operation = scanner.nextLine();
    int a = Integer.parseInt(scanner.nextLine());
    int b = Integer.parseInt(scanner.nextLine());
    switch (operation){
        case "add":
            add(a,b);
            break;
        case "multiply":
            multiply(a,b);
            break;
        case "subtract":
            subtract(a,b);
            break;
        case "divide":
            divide(a,b);
            break;
    }
    }
    public static void add(int namA, int numB){
        System.out.println(namA + numB );
    }
    public static void multiply(int namA, int numB){
        System.out.println(namA * numB );
    }public static void subtract (int namA, int numB){
        System.out.println(namA - numB );
    }public static void divide (int namA, int numB){
        System.out.println(namA / numB );
    }
}
