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
       int [] testArray= Library.roll(6);

       assertEquals("The Array length is 6",6,testArray.length);
    }
    @Test public void testContainsDub(){
        int [] dublicFalse={4,5,6};
        int[] dublictrue={4,4,6,9};
        assertEquals("The result should be  false ",false,Library.containsDuplicates(dublicFalse));
        assertEquals("The result should be  true ",true,Library.containsDuplicates(dublictrue));
    }
 @Test public void testCalculatingAvg(){
      int [] avg={4,5,6,1};
      assertEquals("The avarge shoul be 4",4,Library.calculatingAverages(avg));
 }
 @Test public  void testLowestAvg(){
     int [][] avg={{1,2,3},{2,2,2},{1,1,1}};
     assertEquals("The avarge shoul be index 2 ",avg[2],Library.lowestAverage(avg));
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
