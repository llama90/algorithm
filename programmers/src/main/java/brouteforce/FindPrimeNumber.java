package brouteforce;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindPrimeNumber {
    private int countPrimeNumber = 0;
    private HashSet<Integer> duplication = new HashSet<>();
    private List<Character> element = new ArrayList<>();

    public int solution(String numbers) {
        int size = numbers.length();
        boolean[] visited = new boolean[size];
        for (int i = 1; i <= size; i++) {
            findPrimeNumber(numbers, visited, size, i, 0);
        }
        return countPrimeNumber;
    }

    void findPrimeNumber(String numbers, boolean[] visited, int n, int r, int depth) {
        if (element.size() == r) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < element.size(); i++) {
                sb.append(element.get(i));
            }

            boolean isPrime = true;
            int value = Integer.parseInt(sb.toString());
            if (value != 0 && value != 1) {
                for (int i = 2; i < value; i++) {
                    if (value % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                if (!duplication.contains(value)) {
                    duplication.add(value);
                    countPrimeNumber++;
                }

            }

            return;
        }

        for (int i = depth; i < n; i++) {
            if (!visited[i]) {
                element.add(numbers.charAt(i));
                visited[i] = true;
                findPrimeNumber(numbers, visited, n, r, depth);
                visited[i] = false;
                element.remove(element.size() - 1);
            }
        }
    }
}