// Program 2: Travel computation using arithmetic operators

public class TravelCalculator {

    public static void main(String[] args) {

        // Variables
        String name = "Eric";
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        double distance1 = 156.6;
        double distance2 = 211.8;

        int time1 = 4 * 60 + 4;
        int time2 = 4 * 60 + 25;

        // Calculations
        double totalDistance = distance1 + distance2;
        int totalTime = time1 + time2;

        // Output
        System.out.println("Total Distance Travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km");

        System.out.println("Total Time Taken: " + totalTime + " minutes");
    }
}