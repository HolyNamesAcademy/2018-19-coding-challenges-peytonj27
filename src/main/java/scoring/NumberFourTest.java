package scoring;

import challenges.NumberFour;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assume.assumeNoException;

public class NumberFourTest {

    private static final int MAX_SCORE = 13;
    private static int SCORE = 0;
    private static int TEST_COUNT = 0;

    private NumberFour four = new NumberFour();

    @Test
    public void test1() {
        skipIfNotImplemented(() -> {
            int[] input = {1, 2, 3, 4, 5};
            int[] expected = {5, 1, 2, 3, 4};
            int[] actual = four.leftRotation(input, 4);

            assertArrayEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test2() {
        skipIfNotImplemented(() -> {
            int[] input = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
            int[] expected = {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};
            int[] actual = four.leftRotation(input, 10);

            assertArrayEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test3() {
        skipIfNotImplemented(() -> {
            int[] input = {98, 67, 35, 1, 74, 79, 7, 26, 54, 63, 24, 17, 32, 81};
            int[] expected = {26, 54, 63, 24, 17, 32, 81, 98, 67, 35, 1, 74, 79, 7};
            int[] actual = four.leftRotation(input, 7);

            assertArrayEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test4() {
        skipIfNotImplemented(() -> {
            int[] input = {431, 397, 149, 275, 556, 362, 852, 789, 601, 357, 516, 575, 670, 507, 127, 888, 284,
                    405, 806, 27, 495, 879, 976, 467, 342, 356, 908, 750, 769, 947, 425, 643, 754, 396, 653,
                    595, 108, 75, 347, 394, 935, 252, 683, 966, 553, 724, 629, 567, 93, 494, 693, 965, 328, 187,
                    728, 389, 70, 288, 509, 252, 449};
            int[] expected = {93, 494, 693, 965, 328, 187, 728, 389, 70, 288, 509, 252, 449, 431, 397, 149, 275,
                    556, 362, 852, 789, 601, 357, 516, 575, 670, 507, 127, 888, 284, 405, 806, 27, 495, 879, 976,
                    467, 342, 356, 908, 750, 769, 947, 425, 643, 754, 396, 653, 595, 108, 75, 347, 394, 935, 252,
                    683, 966, 553, 724, 629, 567};
            int[] actual = four.leftRotation(input, 48);

            assertArrayEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test5() {
        skipIfNotImplemented(() -> {
            int[] input = {1, 2, 3, 4, 5};
            int[] expected = {5, 1, 2, 3, 4};
            int[] actual = four.leftRotation(input, 9);

            assertArrayEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test6() {
        skipIfNotImplemented(() -> {
            int[] input = {344, 210, 102};
            int[] expected = {102, 344, 210};
            int[] actual = four.leftRotation(input, 2);

            assertArrayEquals(expected, actual);
            SCORE += 2;
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

    public static int getMaxScore(){
        return MAX_SCORE;
    }

    public static int getTestCount(){
        return TEST_COUNT;
    }
}
