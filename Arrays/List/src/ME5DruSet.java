import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ME5DruSet {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         double savings = Double.parseDouble(scanner.nextLine());
         List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

         String iput = scanner.nextLine();
         List<Integer> modifyDrumSet = new ArrayList<>();
        for (int i = 0; i <= drumSet.size()-1; i++) {
            modifyDrumSet.add(drumSet.get(i));
        }
        int count = 0;
        while (!"Hit it again, Gabsy!".equals(iput)){
            int hitPower  = Integer.parseInt(iput);

            for (int i = 0; i <= modifyDrumSet.size()-1; i++) {
                int current = modifyDrumSet.get(i);
                current -= hitPower;
                modifyDrumSet.set(i,current);
            }

            for (int i = 0; i <= modifyDrumSet.size()-1; i++) {
                if (modifyDrumSet.get(i) <= 0){
                    if(savings >= (drumSet.get(i))*3){
                        modifyDrumSet.set(i, drumSet.get(i));
                        savings -= (drumSet.get(i))*3;
                    }else {
                        modifyDrumSet.remove(i);
                        drumSet.remove((i));
                        if (i != modifyDrumSet.size()-1){
                            i--;
                        }
                    }
                }
            }
            iput = scanner.nextLine();
        }

        for (int num:modifyDrumSet) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
