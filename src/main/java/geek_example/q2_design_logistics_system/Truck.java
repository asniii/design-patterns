package geek_example.q2_design_logistics_system;

public class Truck extends Vehicle {
    private final static int capacityOfTruck = 100;

    public Truck(int id, String vehicleNo){
        super(id,vehicleNo,capacityOfTruck);
    }
}
