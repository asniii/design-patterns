package geek_example.q2_design_logistics_system;

public class Bike extends Vehicle{
    private final static int capacityOfBike = 10;

    public Bike(int id, String vehicleNo) {
        super(id,vehicleNo,capacityOfBike);
    }
}
