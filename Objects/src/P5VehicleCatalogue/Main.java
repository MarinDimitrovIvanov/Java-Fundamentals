package P5VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehiclesList = new ArrayList<>();
        int countTruck = 0;
        int countCar = 0;
        int powerOfCar = 0;
        int powerOfTruck = 0;
        while (!"End".equals(input)) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehiclesList.add(vehicle);

            if (type.equals("car")){
                countCar++;
                powerOfCar += horsepower;
            }else {
                countTruck++;
                powerOfTruck += horsepower;
            }

            input = scanner.nextLine();
        }
        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)){

            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getModel().equals(model)){
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }
        Double averageCarPower = countCar == 0 ? 0 : 1.00 * powerOfCar / countCar;
        Double averageTruckPower = countTruck == 0 ? 0 : 1.00 * powerOfTruck / countTruck;
        System.out.printf("Cars have average horsepower of: %.2f.%nTrucks have average horsepower of: %.2f."
                ,averageCarPower, averageTruckPower);
    }
}
