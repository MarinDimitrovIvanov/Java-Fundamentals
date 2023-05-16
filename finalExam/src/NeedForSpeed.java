import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carsMap = new LinkedHashMap<>();
        for (int i = 0; i < numberOfCars; i++) {
            String[] inputCar = scanner.nextLine().split("\\|");
            String car = inputCar[0];
            int mileage = Integer.parseInt(inputCar[1]);
            int fuel = Integer.parseInt(inputCar[2]);
            if (fuel > 75) {
                fuel = 75;
            }
            carsMap.putIfAbsent(car, new ArrayList<>());
            carsMap.get(car).add(0, mileage);
            carsMap.get(car).add(1, fuel);
            //"{car}, 0-{mileage}, 1-{fuel}"
        }
        String command = scanner.nextLine();
        while (!"Stop".equals(command)) {
            String car = command.split("\\s+:\\s+")[1];
            if (command.contains("Drive")) {
                int distance = Integer.parseInt(command.split("\\s+:\\s+")[2]);
                int fuel = Integer.parseInt(command.split("\\s+:\\s+")[3]);
                if (fuel > carsMap.get(car).get(1)) {
                    System.out.println("Not enough fuel to make that ride");
                } else {
                    int newDistance = distance + carsMap.get(car).get(0);
                    int newFuel = carsMap.get(car).get(1) - fuel;

                    carsMap.get(car).set(0, newDistance);
                    carsMap.get(car).set(1, newFuel);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    if (newDistance > 100000) {
                        carsMap.remove(car);
                        System.out.println("Time to sell the " + car + "!");
                    }
                }
            } else if (command.contains("Refuel")) {
                int fuel = Integer.parseInt(command.split("\\s+:\\s+")[2]);
                if (fuel + carsMap.get(car).get(1) > 75) {
                    fuel = 75 - carsMap.get(car).get(1);
                }
                carsMap.get(car).set(1, fuel+carsMap.get(car).get(1));
                System.out.printf("%s refueled with %d liters%n", car, fuel);
            } else if (command.contains("Revert")) {
                int kilometers = Integer.parseInt(command.split("\\s+:\\s+")[2]);
                if(carsMap.get(car).get(0)-kilometers<10000){
                    carsMap.get(car).set(0, 10000);
                }else {
                    carsMap.get(car).set(0, carsMap.get(car).get(0)-kilometers);
                    System.out.printf("%s mileage decreased by %d kilometers%n", car,kilometers );
                }
            }
            command = scanner.nextLine();
        }
    carsMap.entrySet().forEach(e-> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",e.getKey(),e.getValue().get(0),e.getValue().get(1)));

    }
}
