public class BonusMilesService {
    public int calculate(int cost) {

        int rubMiles = 20;
        int miles = cost / rubMiles;
        return miles;
    }
}
