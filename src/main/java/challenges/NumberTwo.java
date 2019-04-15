package challenges;

import java.util.Arrays;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c)
    {
        int[] order = new int[3];
        order[0] = a;
        order[1] = b;
        order[2] = c;
        Arrays.sort(order);
        if(a==b && b==c)
        {
            return true;
        }
        if(order[0]-order[1]==order[1]-order[2])
        {
            return true;
        }
        return false;
    }
}
