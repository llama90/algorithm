package lesson;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        for (int i = 0; i < K; i++) {
            if(A.length != 0) {
                int lastNumber = A[A.length - 1];
                for (int j = A.length - 1; j >= 1; j--) {
                    A[j] = A[j - 1];
                }
                A[0] = lastNumber;
            }
        }
        return A;
    }
}
