import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> busStops = new ArrayList<int[]>();
        busStops.add(new int[] {10,0});// first stop
        busStops.add(new int[] {3,5});
        busStops.add(new int[] {2,5}); // last stop
        System.out.println(countPassengers(busStops));
    }

    private static int countPassengers(ArrayList<int[]> stops){
        // time complexity O(n)... single loop with size n
        int numberOfPeople = 0;
        for (int[] stop : stops) {
            numberOfPeople += stop[0] - stop[1];
        }

        return numberOfPeople;
    }
}
