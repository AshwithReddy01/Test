package Test;

abstract class Ride {
    private int rideId;
    private double distance;
    private double baseFare;
    Ride(int rideId, double distance, double baseFare) {
        this.rideId = rideId;
        setDistance(distance);   
        setBaseFare(baseFare);   
    }
    public int getRideId() {
        return rideId;
    }
    public double getDistance() {
        return distance;
    }
    public double getBaseFare() {
        return baseFare;
    }
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
    abstract double calculateFare();
    void displayRideDetails() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Base Fare: " + baseFare);
    }
}
