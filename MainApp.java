package Test;

public class MainApp {
    public static void main(String[] args) {
        Ride[] rides = new Ride[3];
        rides[0] = new MiniRide(1, 5, 50);
        rides[1] = new PrimeRide(2, 10, 50);
        rides[2] = new PoolRide(3, 8, 50);
        for (Ride r : rides) {
            System.out.println("Ride ID: " + r.getRideId() +
                               " | Fare: " + r.calculateFare());
        }
        RideService service = new RideService();
        double total = service.calculateTotalRevenue(rides);
        System.out.println("\nTotal Revenue: " + total);
        Ride highest = service.findHighestFareRide(rides);
        System.out.println("\nHighest Fare Ride:");
        System.out.println("Ride ID: " + highest.getRideId() +
                           " | Fare: " + highest.calculateFare());
    }
}
