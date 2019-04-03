package scoring;

import challenges.NumberFive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

public class NumberFiveTest {

    private static final int MAX_SCORE = 28;
    private static int SCORE = 0;
    private static int TEST_COUNT = 0;

    private NumberFive five = new NumberFive();

    @Test
    public void test1() {
        skipIfNotImplemented(() -> {
            String word1 = "anagramm";
            String word2 = "marganaa";
            boolean expected = false;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test2() {
        skipIfNotImplemented(() -> {
            String word1 = "anagram";
            String word2 = "margana";
            boolean expected = true;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test3() {
        skipIfNotImplemented(() -> {
            String word1 = "";
            String word2 = "";
            boolean expected = true;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test4() {
        skipIfNotImplemented(() -> {
            String word1 = "Hello";
            String word2 = "hello";
            boolean expected = true;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test5() {
        skipIfNotImplemented(() -> {
            String word1 = "bbcccxxxyyy";
            String word2 = "yyxxyxccbcb";
            boolean expected = true;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test6() {
        skipIfNotImplemented(() -> {
            String word1 = "madam";
            String word2 = "amadm";
            boolean expected = true;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }


    @Test
    public void test7() {
        skipIfNotImplemented(() -> {
            String word1 = "Abul";
            String word2 = "BulA";
            boolean expected = true;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }


    @Test
    public void test8() {
        skipIfNotImplemented(() -> {
            String word1 = "TestTest";
            String word2 = "testsest";
            boolean expected = false;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test9() {
        skipIfNotImplemented(() -> {
            String word1 = "aaaaa";
            String word2 = "aa";
            boolean expected = false;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test10() {
        skipIfNotImplemented(() -> {
            String word1 = "aaabbb";
            String word2 = "bbaaa";
            boolean expected = false;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test11() {
        skipIfNotImplemented(() -> {
            String word1 = "AAbb";
            String word2 = "AAbba";
            boolean expected = false;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test12() {
        skipIfNotImplemented(() -> {
            String word1 = "ab";
            String word2 = "abXY";
            boolean expected = false;
            boolean actual = five.isAnagram(word1, word2);

            assertEquals(expected, actual);
            SCORE += 3;
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
