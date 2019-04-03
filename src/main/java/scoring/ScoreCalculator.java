package scoring;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.ArrayList;
import java.util.List;

public class ScoreCalculator {

    private static int TOTAL_SCORE = 0;
    private static int MAX_SCORE = 0;

    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result1 = junit.run(NumberOneTest.class);

        System.out.println("Running tests for NumberOne.");
        System.out.println("Total Tests: " + result1.getRunCount());
        System.out.println("Failures: " + result1.getFailureCount());
        System.out.println("Successes: " + (NumberOneTest.getTestCount() - result1.getFailureCount()));
        System.out.println("NumberOne Score: " + NumberOneTest.getScore());
        System.out.println("NumberOne Max Score: " + NumberOneTest.getMaxScore());
        TOTAL_SCORE += NumberOneTest.getScore();
        MAX_SCORE += NumberOneTest.getMaxScore();
        System.out.println();


        Result result2 = junit.run(NumberTwoTest.class);
        System.out.println("Running tests for NumberTwo.");
        System.out.println("Total Tests: " + result2.getRunCount());
        System.out.println("Failures: " + result2.getFailureCount());
        System.out.println("Successes: " + (NumberTwoTest.getTestCount() - result2.getFailureCount()));
        System.out.println("NumberTwo Score: " + NumberTwoTest.getScore());
        System.out.println("NumberTwo Max Score: " + NumberTwoTest.getMaxScore());
        TOTAL_SCORE += NumberTwoTest.getScore();
        MAX_SCORE += NumberThreeTest.getMaxScore();
        System.out.println();

        Result result3 = junit.run(NumberThreeTest.class);
        System.out.println("Running tests for NumberThree.");
        System.out.println("Total Tests: " + result3.getRunCount());
        System.out.println("Failures: " + result3.getFailureCount());
        System.out.println("Successes: " + (NumberThreeTest.getTestCount() - result3.getFailureCount()));
        System.out.println("NumberThree Score: " + NumberThreeTest.getScore());
        System.out.println("NumberThree Max Score: " + NumberThreeTest.getMaxScore());
        TOTAL_SCORE += NumberThreeTest.getScore();
        MAX_SCORE += NumberThreeTest.getMaxScore();
        System.out.println();


        System.out.println("Total Possible Points: " + MAX_SCORE);
        System.out.println("Your Total Score: " + TOTAL_SCORE);

        if(TOTAL_SCORE == MAX_SCORE) {
            System.out.println("Congrats! You crushed it!");
        }
        else if(TOTAL_SCORE > (MAX_SCORE * .75)) {
            System.out.println("Congrats! You're crushing it! Keep it up!");
        }
        else {
            System.out.println("You got this! Keep it up!");
        }
    }

}
