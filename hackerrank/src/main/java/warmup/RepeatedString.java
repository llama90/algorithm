package warmup;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long divided = n / s.length();
        long remaining = n % s.length();


        long count = 0;
        if (divided > 0) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
            count = count * divided;
        }

        for (int i = 0; i < remaining; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }
}
