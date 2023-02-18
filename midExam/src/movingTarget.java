import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!"End".equals(input)) {

            String command = input.split("\\s+")[0];
            int index = Integer.parseInt(input.split("\\s+")[1]);
            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(input.split("\\s+")[2]);
                    if (exist(index, targets)) {
                        targets.set(index,targets.get(index)-power);
                            if(targets.get(index)<=0){
                                targets.remove(index);
                            }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(input.split("\\s+")[2]);
                    if (exist(index,targets)){
                        targets.add(index,value);
                    }else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(input.split("\\s+")[2]);
                    if ( index-radius >= 0 && index + radius <= targets.size()-1 ){
                    for (int i = index + radius; i >= index-radius ; i--) {
                        if (exist(i,targets)){
                            targets.remove(i);
                        }
                    }
                    }else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= targets.size()-1 ; i++) {
            if (i != targets.size()-1){
                System.out.print(targets.get(i) + "|");
            }else {
                System.out.print(targets.get(i));
            }
        }
    }
    private static boolean exist(int index, List<Integer> targets) {
        if (index >= 0 && index <= targets.size() - 1) {
            return true;
        }
        return false;
    }
}
