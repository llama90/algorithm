package array;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        if (a.length < d) {
            d = d % a.length;
        }

        int index = 0;
        int[] rotatedA = new int[a.length];
        for (int i = d; i < a.length; i++) {
            rotatedA[index++] = a[i];
        }

        for (int i = 0; i < d; i++) {
            rotatedA[index++] = a[i];
        }

        return rotatedA;
    }

}
