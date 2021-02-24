package sorting;

import java.util.Comparator;

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score > b.score) {
            return -1;
        } else if (a.score < b.score) {
            return 1;
        }

        if (a.name.compareTo(b.name) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
