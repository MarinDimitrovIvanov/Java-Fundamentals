import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shopingList {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<String> initiaList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!"Go Shopping!".equals(input)){
            String command = input.split(" ")[0];
            String item = input.split(" ")[1];
            switch (command){
                case "Urgent":
                    if (!initiaList.contains(item)){
                        initiaList.add(0,item);
                    }
                    break;
                case "Unnecessary":
                        initiaList.remove(item);
                    break;
                case "Correct":
                    String newItem = input.split(" ")[2];
                    if (initiaList.contains(item)){
                        int index = initiaList.indexOf(item);
                        initiaList.set(index,newItem);
                    }
                    break;
                case "Rearrange":
                    if (initiaList.contains(item)){
                        int index = initiaList.indexOf(item);
                        String current = initiaList.get(index);
                        initiaList.remove(index);
                        initiaList.add(current);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(String.join(", ",initiaList));
    }
}
