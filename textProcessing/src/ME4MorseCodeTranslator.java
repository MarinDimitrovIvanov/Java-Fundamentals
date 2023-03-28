import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ME4MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] codeString = "A .- B -... C -.-. D -.. E . F ..-. G --. H .... I .. J .--- K -.- L .-.. M -- N -. O --- P .--. Q --.- R .-. S ... T - U ..- V ...- W .-- X -..- Y -.-- Z --.".split(" ");
        Map<String,String> code = new LinkedHashMap<>();
        for (int i = 0; i < codeString.length; i= i+2) {
            code.put(codeString[i],codeString[i+1]);
        }
        String input = scanner.nextLine();
        String[] massage = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < massage.length; i++) {
            if (massage[i].equals("|")){
                sb.append(" ");
            }else {
                String current = massage[i];
                for (Map.Entry entry:code.entrySet()) {
                    if (entry.getValue().equals(current)){
                        sb.append(entry.getKey());
                        break;
                    }
                }
            }
        }

        System.out.println(sb);

    }
}
