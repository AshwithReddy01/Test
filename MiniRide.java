package Test;
class MiniRide extends Ride {

    MiniRide(int rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    double calculateFare() {
        return getBaseFare() + (getDistance() * 10);
    }
}