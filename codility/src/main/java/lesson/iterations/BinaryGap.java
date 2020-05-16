package lesson.iterations;

public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8
        String binaryNumber = Integer.toBinaryString(N);
        int maximumBinaryGap = 0;
        int gap = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                if (gap != 0 && gap > maximumBinaryGap) {
                    maximumBinaryGap = gap;
                    gap = 0;
                } else {
                    gap = 0;
                }
            } else if (binaryNumber.charAt(i) == '0') {
                gap++;
            }

        }

        return maximumBinaryGap;
    }
}
