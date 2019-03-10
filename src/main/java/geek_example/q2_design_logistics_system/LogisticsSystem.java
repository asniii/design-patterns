package geek_example.q2_design_logistics_system;

import java.util.ArrayList;
import java.util.List;

public class LogisticsSystem {
    private List<Order> orders;
    private List<Vehicle> vehicles;
    private List<User> users;

    public LogisticsSystem(){
        this.orders = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void takeAnOrder(Order order){
        System.out.println("Adding an order to the system.");
        orders.add(order);
    }

    public void processOrder(Order order){
        System.out.println("Processing an order of the system");
    }

    public Location trackOrder(Order order){
        System.out.println("Tracking an order of the system.");
        Location location = null;
        // location = findLocationOfGivenOrder();
        return location;
    }

    public void cancelOrder(Order order){
        System.out.println("Going to cancel an order on the system.");
    }

    public void registerNewUser(User user){
        System.out.println("Register new user");
        users.add(user);
    }

    public List<Order> getOrders(){
        return orders;
    }

    public void setOrders(List<Order> orders){
        this.orders = orders;
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public List<User> getUsers()
    {
        return users;
    }

    public void setUsers(List<User> users)
    {
        this.users = users;
    }


}
