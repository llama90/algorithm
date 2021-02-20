package dfsbfs;

public class TargetNumber {
    private int answer = 0;

    public int solution(int[] numbers, int target) {
        findTargetNumber(numbers, 0, target, 0);
        return answer;
    }

    public void findTargetNumber(int[] numbers, int index, int target, int currSum) {
        if (index == numbers.length) {
            if (currSum == target) {
                answer++;
            }
            return;
        }
        findTargetNumber(numbers, index + 1, target, currSum + numbers[index]);
        findTargetNumber(numbers, index + 1, target, currSum - numbers[index]);
    }
}
