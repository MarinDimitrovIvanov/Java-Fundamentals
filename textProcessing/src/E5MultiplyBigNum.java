import java.math.BigInteger;
import java.util.Scanner;

public class E5MultiplyBigNum {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String numberSum = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

            int remain = 0;
            StringBuilder st = new StringBuilder();
            for (int i = numberSum.length() - 1; i >= 0; i--) {
                int multiply = 0;
                int current = Character.getNumericValue(numberSum.charAt(i));
                multiply = (current * secondNumber) + remain;
                remain = 0;
                if (multiply > 9) {
                    st.append(multiply % 10);
                    remain = multiply / 10;
                } else {
                    st.append(multiply);
                }
                if (i == 0 && remain > 0) {
                    st.append(remain);

                }
            }
            boolean isZero = true;
            String test = st.toString();
        for (int i = 0; i < test.length(); i++) {
            char current = test.charAt(i);
            if (current != '0'){
                isZero = false;
                break;
            }
        }



            if (isZero){
                System.out.println("0");
            }else {
                System.out.println(st.reverse());
            }

    }
}
