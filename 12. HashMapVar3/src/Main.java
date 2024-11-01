import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Adding orders
        Order order1 = new Order("001", "Alice", Arrays.asList("Pizza", "Pasta"));
        Order order2 = new Order("002", "Bob", Arrays.asList("Burger", "Fries"));
        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        // Print orders
        System.out.println("All Orders:");
        restaurant.printAllOrders();

        // Searching order
        System.out.println("Finding Order 001:");
        System.out.println(restaurant.findOrder("001"));

        // Deliting order
        restaurant.removeOrder("001");
        System.out.println("All Orders after removing Order 001:");
        restaurant.printAllOrders();
    }
}