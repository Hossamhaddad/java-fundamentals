/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
   @Test public void testRoll(){
        Library classUnderTest = new Library();

       int [] testArray= new int [6];
       assertEquals("The Array length is 6",6,testArray.length);

    }
    @Test public void testanalyzingWeather(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        Library.analyzingWeather(weeklyMonthTemperatures);
        System.out.println(Library.analyzingWeather(weeklyMonthTemperatures));
    }
    @Test public void tally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        Library.tally(votes);
       System.out.println(Library.tally(votes));
    }
}