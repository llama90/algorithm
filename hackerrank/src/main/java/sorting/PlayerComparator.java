package sorting;

import java.util.Arrays;

public class PlayerComparator {

    // Complete the maximumToys function below.
    static String sortPlayer(Player[] players) {
        Checker checker = new Checker();
        Arrays.sort(players, checker);
        return Arrays.toString(players);
    }
}
