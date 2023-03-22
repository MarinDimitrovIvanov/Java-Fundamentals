import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;
public class ME2Judge {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String input = scanner.nextLine();
        Map<String, Map<String, Integer>> contestMap = new LinkedHashMap<>();

         while (!"no more time".equals(input)){
             String userName = input.split(" -> ")[0];
             String contest = input.split(" -> ")[1];
             int points = Integer.parseInt(input.split(" -> ")[2]);

             contestMap.putIfAbsent(contest, new TreeMap<>());
             contestMap.get(contest).putIfAbsent(userName, 0);

             if (contestMap.get(contest).get(userName) < points){
                 contestMap.get(contest).put(userName, points);
             }
             input = scanner.nextLine();
         }
        for (Map.Entry<String,Map<String,Integer>> entry: contestMap.entrySet()) {
            System.out.printf("%s: %s participants%n",entry.getKey(),entry.getValue().size());
            Map<String,Integer> sorted = new LinkedHashMap<>();
            entry.getValue().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(e->sorted.put(e.getKey(),e.getValue()));
            int position = 1;
            for (Map.Entry<String,Integer> sort: sorted.entrySet()) {
                System.out.printf("%d. %s <::> %d%n",position , sort.getKey(),sort.getValue());
                position++;
            }

        }

        Map<String, Integer> statistics = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String,Map<String,Integer>> entry: contestMap.entrySet()) {
            for (Map.Entry<String,Integer> student:entry.getValue().entrySet()) {
                statistics.putIfAbsent(student.getKey(),0);
                statistics.put(student.getKey(), statistics.get(student.getKey())+student.getValue());
            }
        }
        Map<String,Integer> sortedStatistic = new LinkedHashMap<>();
       statistics.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                       .forEachOrdered(e -> sortedStatistic.put(e.getKey(), e.getValue()));

        System.out.println("Individual standings:");
        int position = 1;
        for (Map.Entry<String,Integer> entry:sortedStatistic.entrySet()) {
            System.out.printf("%d. %s -> %d%n",position,entry.getKey(),entry.getValue());
            position++;

        }
    }
}
