package dictionariesandhashmaps;

import java.util.HashSet;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        String answer = "NO";
        HashSet<Character> s1Set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            s1Set.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s1Set.contains(s2.charAt(i))) {
                answer = "YES";
                break;
            }
        }
        return answer;
    }

}
