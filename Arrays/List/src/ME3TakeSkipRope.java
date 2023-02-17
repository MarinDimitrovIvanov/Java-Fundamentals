import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ME3TakeSkipRope {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String  inputMassage = scanner.nextLine();

          //Scanner type = new Scanner(inputMassage);

        List<Integer> numbersList = new ArrayList<>();
        List<String> nonNumbersList = new ArrayList<>();
        for (int i = 0; i <= inputMassage.length()-1; i++) {
            char currentChar = inputMassage.charAt(i);
            if (Character.isDigit(currentChar)){
               numbersList.add(Character.getNumericValue(inputMassage.charAt(i)));
            }else {
                nonNumbersList.add(String.valueOf(inputMassage.charAt(i)));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int i = 0; i <= numbersList.size()-1 ; i++) {
            if ( i % 2 == 0){
                takeList.add(numbersList.get(i));
            }else {
                skipList.add(numbersList.get(i));
            }
        }
        String output ="";
        int count = 0;
        for (int i = 0; i <= takeList.size()-1  ; i++) {
            for (int j = 0; j < takeList.get(count); j++) {
                if (!nonNumbersList.isEmpty()) {
                    output += nonNumbersList.get(0);
                    nonNumbersList.remove(0);
                }
            }
            for (int j = 0; j < skipList.get(count); j++) {
                if (!nonNumbersList.isEmpty()) {
                    nonNumbersList.remove(0);
                }
            }
            count++;
        }
        System.out.println(output);
    }
}
