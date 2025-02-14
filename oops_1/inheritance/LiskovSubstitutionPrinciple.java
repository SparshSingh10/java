import java.util.ArrayList;
import java.util.List;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class Motorcycle extends Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class Car extends Vehicle {
    public Integer getNumberOfWheels() {
        return 4;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class Bicycle extends Vehicle {
   
}

public class LiskovSubstitutionPrinciple
{
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Motorcycle());
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        for (Vehicle vehicle : vehicles) {

            System.out.println(vehicle.hasEngine().toString());
        }
    }
}
