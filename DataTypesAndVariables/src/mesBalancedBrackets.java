import java.util.Scanner;

public class mesBalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nLines = Integer.parseInt(scanner.nextLine());
        boolean isOpen = false;
        boolean isBalanced = true;
        for (int i = 0; i < nLines; i++) {

            String input = scanner.nextLine();
            if (input.charAt(0)==40){
                if (isOpen){
                    isBalanced = false;
                    break;
                }
                isOpen = true;
            }else if ( input.charAt(0) == 41 ){
                if (!isOpen){
                    isBalanced = false;
                    break;
                }
                isOpen = false;
            }
        }
        if (!isBalanced || isOpen){
            System.out.println("UNBALANCED");
        }else {
            System.out.println("BALANCED");
        }
    }
}
