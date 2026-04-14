package Test;

abstract class Ride {

    // 🔒 Private fields (Encapsulation)
    private int rideId;
    private double distance;
    private double baseFare;

    // ✅ Constructor
    Ride(int rideId, double distance, double baseFare) {
        this.rideId = rideId;
        setDistance(distance);   // validation
        setBaseFare(baseFare);   // validation
    }

    // 🔹 Getters
    public int getRideId() {
        return rideId;
    }

    public double getDistance() {
        return distance;
    }

    public double getBaseFare() {
        return baseFare;
    }

    // 🔹 Setters with Validation
    public void setDistance(double distance) {
        if (distance > 0) {
            this.distance = distance;
        } else {
            System.out.println("Distance must be greater than 0");
        }
    }

    public void setBaseFare(double baseFare) {
        if (baseFare >= 0) {
            this.baseFare = baseFare;
        } else {
            System.out.println("Base fare must be >= 0");
        }
    }

    // 🔸 Abstract Method
    abstract double calculateFare();

    // 🔸 Common Method
    void displayRideDetails() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Base Fare: " + baseFare);
    }
}