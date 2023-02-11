import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P3MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int count = Math.min(firstNumbers.size(), secondNumbers.size());
        List<Integer> mergedList = new ArrayList<>();

        if ( firstNumbers.size() > secondNumbers.size()){
            for (int i = 0; i < count; i++) {
                mergedList.add(firstNumbers.get(i));
                mergedList.add(secondNumbers.get(i));
            }
            for (int i = count ; i <=  firstNumbers.size()-1; i++) {
                mergedList.add(firstNumbers.get(i));
            }


        }else {
            if ( firstNumbers.size() < secondNumbers.size()) {
                for (int i = 0; i < count; i++) {
                    mergedList.add(secondNumbers.get(i));
                    mergedList.add(firstNumbers.get(i));
                }
                for (int i = count ; i <= secondNumbers.size() - 1; i++) {
                    mergedList.add(secondNumbers.get(i));
                }
            }
        }

        for (int number:mergedList) {
            System.out.print(number + " ");
        }
    }
}
