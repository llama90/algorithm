package warmup;

public class JumpingClouds {
    static int minimumJumping = Integer.MAX_VALUE;

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        jump(c, 0, 0);
        return minimumJumping;
    }

    static void jump(int[] c, int countJump, int index) {
        if (index == c.length - 1) {
            if (countJump < minimumJumping) {
                minimumJumping = countJump;
            }
            return;
        }

        if (index + 1 < c.length && c[index + 1] != 1) {
            jump(c, countJump + 1, index + 1);
        }
        if (index + 2 < c.length && c[index + 2] != 1) {
            jump(c, countJump + 1, index + 2);
        }
    }
}
