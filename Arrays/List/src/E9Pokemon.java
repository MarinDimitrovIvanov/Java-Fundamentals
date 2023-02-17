import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E9Pokemon {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> distanceList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int indexes = Integer.parseInt(scanner.nextLine());
        int sumRemovedElement = 0;
        while (true){
            if (indexes >= 0 && indexes <= distanceList.size()-1) {
                int removedElement = distanceList.get(indexes);
                sumRemovedElement += removedElement;
                distanceList.remove(indexes);
                increaceDecreace (distanceList,removedElement);

            }else if (indexes < 0 ){
                indexes = 0;
                int removedElement = distanceList.get(indexes);
                sumRemovedElement += removedElement;
                distanceList.set(0,distanceList.get(distanceList.size()-1));
                increaceDecreace (distanceList,removedElement);

            } else if (indexes > distanceList.size()-1) {
                indexes = distanceList.size()-1;
                int removedElement = distanceList.get(indexes);
                sumRemovedElement += removedElement;
                distanceList.set(distanceList.size()-1,distanceList.get(0));
                increaceDecreace (distanceList,removedElement);
            }
            if (distanceList.isEmpty()){
                break;
            }
            indexes = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sumRemovedElement);
    }

    private static void increaceDecreace(List<Integer> distanceList, int removedElement) {
        for (int i = 0; i <= distanceList.size()-1; i++) {
            int current = 0;
            if (distanceList.get(i)>removedElement){
                current = distanceList.get(i) - removedElement;
                distanceList.set(i,current);
            }else {
                current = distanceList.get(i) + removedElement;
                distanceList.set(i,current);
            }
        }
    }
}
