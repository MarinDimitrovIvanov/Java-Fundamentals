package P5VehicleCatalogue;

public class Vehicle {
    public  String type;
    public  String model;
    public  String color;
    public  int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        String typeVeh = type.equals("car") ? "Car" : "Truck";
        return  "Type: " + typeVeh + System.lineSeparator()+
                "Model: " + model + System.lineSeparator()+
                "Color: " + color + System.lineSeparator() +
                "Horsepower: " + horsePower ;
    }
}
