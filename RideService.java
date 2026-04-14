package Test;

class RideService {

    // 🔹 Calculate total revenue
    double calculateTotalRevenue(Ride[] rides) {
        double total = 0;

        for (Ride r : rides) {
            total += r.calculateFare();
        }

        return total;
    }

    // 🔹 Find ride with highest fare
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