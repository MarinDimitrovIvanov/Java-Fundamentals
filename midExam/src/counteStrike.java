import java.util.Scanner;

public class counteStrike {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int initialEnergy  = Integer.parseInt(scanner.nextLine());

         String inpit = scanner.nextLine();
         int count = 0;
         boolean noEnergy = false;
         while (!"End of battle".equals(inpit)){
         int distance = Integer.parseInt(inpit);
                if (distance <= initialEnergy){
                    initialEnergy -= distance;
                    count++;
                    if (count % 3 == 0){
                        initialEnergy += count;
                    }

                }else {
                    noEnergy = true;
                    break;
                }
             inpit = scanner.nextLine();
         }

         if (noEnergy){
             System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",count, initialEnergy);
         }else {
             System.out.printf("Won battles: %d. Energy left: %d", count, initialEnergy);

         }

    }
}
