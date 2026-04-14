package Test;
class PrimeRide extends Ride {

    PrimeRide(int rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    double calculateFare() {
        return getBaseFare() + (getDistance() * 15) + 50;
    }
}