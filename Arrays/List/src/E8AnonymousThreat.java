import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
       String command = scanner.nextLine();
        while (!"3:1".equals(command)){
            if (command.startsWith("merge")){
             int startIndex = Integer.parseInt(command.split("\\s+")[1]);
             int endIndex = Integer.parseInt(command.split("\\s+")[2]);
            if (startIndex < 0 ){
                startIndex = 0;
                }
            if (endIndex > inputList.size()-1){
                endIndex = inputList.size()-1;
            }
            if ( (startIndex >= 0 && startIndex < inputList.size()-1) && ( endIndex > 0 && endIndex <= inputList.size()-1)) {

                String merge = "";
                for (int i = startIndex; i <= endIndex; i++) {
                    merge += inputList.get(i);
                }
                for (int i = startIndex; i <= endIndex; i++) {
                    inputList.remove(startIndex);
                }

                inputList.add(startIndex,merge);
                }
            } else if (command.startsWith("divide")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int partition = Integer.parseInt(command.split("\\s+")[2]);
                String stringPerDivide = inputList.get(index);
                inputList.remove(index);
                int numberOfSymbols = stringPerDivide.length()/partition;

                int beginIndex = 0;
                for (int i = 1; i < partition; i++) {
                    String partsOfString = stringPerDivide.substring(beginIndex,beginIndex+numberOfSymbols);
                    inputList.add(index, partsOfString);
                    beginIndex += numberOfSymbols;
                    index++;
                }
                String lastPart = stringPerDivide.substring(beginIndex, stringPerDivide.length());
                inputList.add(index, lastPart);
            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(" ",inputList));

    }
}
