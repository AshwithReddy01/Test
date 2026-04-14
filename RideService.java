package Test;

class RideService {
    double calculateTotalRevenue(Ride[] rides) {
        double total = 0;
        for (Ride r : rides) {
            total += r.calculateFare();
        }
        return total;
    }
    Ride findHighestFareRide(Ride[] rides) {
        Ride maxRide = rides[0];

        for (Ride r : rides) {
            if (r.calculateFare() > maxRide.calculateFare()) {
                maxRide = r;
            }
        }

        return maxRide;
    }
}
