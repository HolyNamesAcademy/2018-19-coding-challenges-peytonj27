package scoring;

import challenges.NumberSix;
import challenges.model.LinkedListNode;
import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

public class NumberSixTest {

    private static final int MAX_SCORE = 16;
    private static int SCORE = 0;
    private static int TEST_COUNT = 0;

    private NumberSix six = new NumberSix();

    @Test
    public void test7() {
        skipIfNotImplemented(() -> {
            int[] values = {1, 2, 3, 5, 7, 9, 5, 10, 32};
            LinkedListNode head = linkedListBuilder(values);
            String expected = "1 2 3 5 7 9 5 10 32";
            String actual = six.printLinkedList(head).trim();

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }


    @Test
    public void test8() {
        skipIfNotImplemented(() -> {
            int[] values = {1, 2, 3, 5, 7, 9};
            LinkedListNode head = linkedListBuilder(values);
            String expected = "1 2 3 5 7 9";
            String actual = six.printLinkedList(head).trim();

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test9() {
        skipIfNotImplemented(() -> {
            int[] values = {1, 2, 3};
            LinkedListNode head = linkedListBuilder(values);
            String expected = "1 2 3";
            String actual = six.printLinkedList(head).trim();

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test10() {
        skipIfNotImplemented(() -> {
            int[] values = {1, 2, 3};
            LinkedListNode head = linkedListBuilder(values);
            String expected = "1 2 3";
            String actual = six.printLinkedList(head);

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test11() {
        skipIfNotImplemented(() -> {
            int[] values = {1};
            LinkedListNode head = linkedListBuilder(values);
            String expected = "1";
            String actual = six.printLinkedList(head).trim();

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    @Test
    public void test12() {
        skipIfNotImplemented(() -> {
            int[] values = {1};
            LinkedListNode head = linkedListBuilder(values);
            String expected = "1";
            String actual = six.printLinkedList(head);

            assertEquals(expected, actual);
            SCORE += 4;
        });
    }

    private LinkedListNode linkedListBuilder(int[] values){
        LinkedListNode head = new LinkedListNode(values[values.length - 1]);
        for(int i = values.length - 2; i >= 0; i--){
            LinkedListNode node = new LinkedListNode(values[i], head);
            head = node;
        }
        return head;
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
