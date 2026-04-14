package Test;

public class Main {
    public static void main(String[] args) {

        // Create array of Ride (Polymorphism)
        Ride[] rides = new Ride[3];

        // Store different ride objects
        rides[0] = new MiniRide(101, 5, 50);
        rides[1] = new PrimeRide(102, 10, 50);
        rides[2] = new PoolRide(103, 8, 50);

        // Loop and call methods dynamically
        for (Ride r : rides) {
            r.displayRideDetails();
            System.out.println("Total Fare: " + r.calculateFare());
            System.out.println("------------------------");
        }
    }
}