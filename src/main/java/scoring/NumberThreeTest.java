package scoring;

import challenges.NumberThree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

public class NumberThreeTest {

    private static int SCORE = 0;
    private static int TEST_COUNT = 0;

    private NumberThree three = new NumberThree();

    @Test
    public void test1() {
        skipIfNotImplemented(() -> {
            String expected = "19:05:45";
            String actual = three.timeConversion("07:05:45PM");

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test2() {
        skipIfNotImplemented(() -> {
            String expected = "00:40:22";
            String actual = three.timeConversion("12:40:22AM");

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test3() {
        skipIfNotImplemented(() -> {
            String expected = "06:40:03";
            String actual = three.timeConversion("06:40:03AM");

            assertEquals(expected, actual);
            SCORE += 1;
        });
    }

    @Test
    public void test4() {
        skipIfNotImplemented(() -> {
            String expected = "00:05:39";
            String actual = three.timeConversion("12:05:39AM");

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test5() {
        skipIfNotImplemented(() -> {
            String expected = "12:45:54";
            String actual = three.timeConversion("12:45:54PM");

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test6() {
        skipIfNotImplemented(() -> {
            String expected = "04:59:59";
            String actual = three.timeConversion("04:59:59AM");

            assertEquals(expected, actual);
            SCORE += 1;
        });
    }

    @Test
    public void test7() {
        skipIfNotImplemented(() -> {
            String expected = "14:34:50";
            String actual = three.timeConversion("02:34:50PM");

            assertEquals(expected, actual);
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

    public static int getTestCount(){
        return TEST_COUNT;
    }
}
