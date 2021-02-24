package dictionariesandhashmaps;

import java.util.HashMap;

public class HashTable {
    // Complete the checkMagazine function below.
    static String checkMagazine(String[] magazine, String[] note) {
        String answer = "Yes";

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length; i++) {
            if (!map.containsKey(magazine[i])) {
                map.put(magazine[i], 1);
            } else {
                int count = map.get(magazine[i]) + 1;
                map.put(magazine[i], count);
            }
        }

        for (int i = 0; i < note.length; i++) {
            if (!map.containsKey(note[i])) {
                answer = "No";
                break;
            } else {
                int count = map.get(note[i]);
                if (count <= 0) {
                    answer = "No";
                    break;
                } else {
                    map.put(note[i], count - 1);
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
