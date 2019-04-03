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
        printScoreReport(result1, "NumberOne", NumberOneTest.getTestCount(),
                NumberOneTest.getScore(), NumberOneTest.getMaxScore());


        Result result2 = junit.run(NumberTwoTest.class);
        printScoreReport(result2, "NumberTwo", NumberTwoTest.getTestCount(),
                NumberTwoTest.getScore(), NumberTwoTest.getMaxScore());

        Result result3 = junit.run(NumberThreeTest.class);
        printScoreReport(result3, "NumberThree", NumberThreeTest.getTestCount(),
                NumberThreeTest.getScore(), NumberThreeTest.getMaxScore());

        Result result4 = junit.run(NumberFourTest.class);
        printScoreReport(result4, "NumberFour", NumberFourTest.getTestCount(),
                NumberFourTest.getScore(), NumberFourTest.getMaxScore());


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

    private static void printScoreReport(Result result, String challengeName, int testCount, int score, int maxScore){
        System.out.println("Running tests for " + challengeName + ".");
        System.out.println("Total Tests: " + result.getRunCount());
        System.out.println("Failures: " + result.getFailureCount());
        System.out.println("Successes: " + (testCount - result.getFailureCount()));
        System.out.println(challengeName + " Score: " + score);
        System.out.println(challengeName + " Max Score: " + maxScore);
        TOTAL_SCORE += score;
        MAX_SCORE += maxScore;
        System.out.println();

    }
}
