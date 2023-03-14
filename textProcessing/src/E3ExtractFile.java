import java.util.Scanner;

public class E3ExtractFile {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String[] input =  scanner.nextLine().split("\\\\");
        String file = input[input.length-1].split("\\.")[0];
        String extension = input[input.length-1].split("\\.")[1];

        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);
    }
}
