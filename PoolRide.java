package Test;

class PoolRide extends Ride {

    PoolRide(int rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare); // ✅ FIX
    }

    @Override
    double calculateFare() {
        double fare = getBaseFare() + (getDistance() * 8);
        return fare - (fare * 0.20);
    }
}