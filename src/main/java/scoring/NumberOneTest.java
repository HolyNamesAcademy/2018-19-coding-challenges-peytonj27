package scoring;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assume.assumeNoException;

import challenges.NumberOne;

public class NumberOneTest {

    private static int SCORE = 0;
    private static int TEST_COUNT = 0;

    private NumberOne one = new NumberOne();

    @Test
    public void test(){
        skipIfNotImplemented(() -> {
            int[] numbers = {2, 7, 11, 15};
            int target = 9;

            int[] expected = {0, 1};
            int[] actual = one.findTwoValuesThatSumToTarget(numbers, target);

            assertArrayEquals(expected, actual);
            SCORE++;
        });
    }

    @Test
    public void test2(){
        skipIfNotImplemented(() -> {
            int[] numbers = {2, 7, 11, 15};
            int target = 18;

            int[] expected = {1, 2};
            int[] actual = one.findTwoValuesThatSumToTarget(numbers, target);

            assertArrayEquals(expected, actual);
            SCORE++;
        });
    }

    @Test
    public void test3(){
        skipIfNotImplemented(() -> {
            int[] numbers = {2, 7, 11, 15};
            int target = 26;

            int[] expected = {2, 3};
            int[] actual = one.findTwoValuesThatSumToTarget(numbers, target);

            assertArrayEquals(expected, actual);
            SCORE++;
        });
    }

    private void skipIfNotImplemented(Runnable test) {
        try {
            test.run();
            TEST_COUNT++;
        } catch (UnsupportedOperationException e) {
            assumeNoException(e);
        }
    }

    public static int getScore(){
        return SCORE;
    }

    public static int getTestCount(){
        return TEST_COUNT;
    }
}
