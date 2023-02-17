import java.util.*;
import java.util.stream.Collectors;

public class ME4MixedUpList {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> mixList =new ArrayList<>();

        while (!(firstList.isEmpty() || secondList.isEmpty())){
            mixList.add(firstList.get(0));
            firstList.remove(0);
            mixList.add(secondList.get(secondList.size()-1));
            secondList.remove((secondList.size()-1));
        }
        int startNum = 0;
        int endNum = 0;
        if (firstList.isEmpty()){
             startNum = Math.min(secondList.get(0), secondList.get(1));
             endNum = Math.max(secondList.get(0), secondList.get(1));
        }else {
            startNum = Math.min(firstList.get(0), firstList.get(1));
            endNum = Math.max(firstList.get(0), firstList.get(1));
        }
        List<Integer> output = new ArrayList<>();
        for (int num:mixList) {
            if (num > startNum && num < endNum){
                output.add(num);
            }
        }
        Collections.sort(output);
        for (int num: output) {
            System.out.print(num + " ");
        }



    }
}
