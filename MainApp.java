package Test;

public class MainApp {
    public static void main(String[] args) {

        // Create Ride objects
        Ride[] rides = new Ride[3];

        rides[0] = new MiniRide(1, 5, 50);
        rides[1] = new PrimeRide(2, 10, 50);
        rides[2] = new PoolRide(3, 8, 50);

        // Display individual fares
        for (Ride r : rides) {
            System.out.println("Ride ID: " + r.getRideId() +
                               " | Fare: " + r.calculateFare());
        }

        // Use RideService
        RideService service = new RideService();

        // Total revenue
        double total = service.calculateTotalRevenue(rides);
        System.out.println("\nTotal Revenue: " + total);

        // Highest fare ride
        Ride highest = service.findHighestFareRide(rides);
        System.out.println("\nHighest Fare Ride:");
        System.out.println("Ride ID: " + highest.getRideId() +
                           " | Fare: " + highest.calculateFare());
    }
}