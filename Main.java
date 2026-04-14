package Test;

public class Main {
    public static void main(String[] args) {
        Ride[] rides = new Ride[3];
        rides[0] = new MiniRide(101, 5, 50);
        rides[1] = new PrimeRide(102, 10, 50);
        rides[2] = new PoolRide(103, 8, 50);
        for (Ride r : rides) {
            r.displayRideDetails();
            System.out.println("Total Fare: " + r.calculateFare());
            System.out.println("------------------------");
        }
    }
}
