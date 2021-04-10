function twoSum(nums: number[], target: number): number[] {
    let answer: number[];
    for (let i = 0; i < nums.length; i++) {
        for (let j = 0; j < nums.length; j++) {
            if ((nums[i] + nums[j]) === target) {
                answer = [i, j];
                break;
            }
        }
    }
    // @ts-ignore
    return answer;
};

twoSum([2, 7, 11, 15], 9);