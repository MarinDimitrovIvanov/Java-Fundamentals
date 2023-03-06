import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E4SoftUniParking {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num = Integer.parseInt(scanner.nextLine());

        Map<String,String> registeredUser = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String commandLine = scanner.nextLine();
            String command = commandLine.split("\\s+")[0];
            String username = commandLine.split("\\s+")[1];
            switch (command){
                case "register":
                    String licensePlateNumber = commandLine.split("\\s+")[2];
                   if (!registeredUser.containsKey(username)){
                       registeredUser.put(username, licensePlateNumber);
                       System.out.printf("%s registered %s successfully%n",username, licensePlateNumber);
                   }else {
                       System.out.printf("ERROR: already registered with plate number %s%n", registeredUser.get(username));
                   }
                    break;
                case "unregister":
                    if (!registeredUser.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    }else {
                        registeredUser.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }

                    break;
            }
        }

        registeredUser.forEach((key, value) -> System.out.printf("%s => %s%n",key,value));
    }
}
