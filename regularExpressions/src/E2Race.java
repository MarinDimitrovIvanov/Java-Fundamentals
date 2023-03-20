import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E2Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nameList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map <String, Integer> racerMap = new LinkedHashMap<>();
        nameList.forEach(e-> racerMap.put(e,0));



        String input = scanner.nextLine();


        while (!"end of race".equals(input)){
            String regexName = "[A-Za-z]";
            Pattern patternName = Pattern.compile(regexName);
            Matcher matcher = patternName.matcher(input);
            String regexDistance = "[0-9]";
            Pattern patternDistance = Pattern.compile(regexDistance);
            Matcher matcherDistance = patternDistance.matcher(input);
            StringBuilder sb = new StringBuilder();
            while (matcher.find()){
                sb.append(matcher.group());
            }
            String racerName = sb.toString();
            int distance = 0;
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }

            if (nameList.contains(racerName)){
                racerMap.put(racerName,racerMap.get(racerName)+distance );
            }


            input = scanner.nextLine();

        }
        for (int i = 0; i < 3; i++) {
            String name = nameList.get(i);
            if (i == 0){
                System.out.println("1st place: " + nameList.get(i));
            } else if (i == 1){
                System.out.println("2nd place: " + nameList.get(i));
            } else if (i == 2){
                System.out.println("3rd place: " + nameList.get(i));
            }
        }
    }
}
