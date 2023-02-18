import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shootForTheWin {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int shotTargetCount = 0;
        while (!"End".equals(input)){
            int indexShot = Integer.parseInt(input);
            if (indexShot >= 0 && indexShot <= targets.size()-1){
                if (targets.get(indexShot) >= 0){
                    int shotTargetValue = targets.get(indexShot);
                    targets.set(indexShot,-1);
                    shotTargetCount++;
                    for (int i = 0; i <= targets.size()-1; i++) {
                        if (targets.get(i)>=0){
                            if (targets.get(i)>shotTargetValue){
                                targets.set(i,targets.get(i) - shotTargetValue);
                            }else {
                                targets.set(i,targets.get(i) + shotTargetValue);
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",shotTargetCount);
        for (int num:targets) {
            System.out.print(num + " ");
        }
    }
}
