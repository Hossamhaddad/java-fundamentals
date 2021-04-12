package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
@Test public void testRestaurant(){
    Restaurant hashem=new Restaurant("hashem",5,"$$$");
    hashem.tostring();
    hashem.addReview();
    System.out.println(hashem.stars);
}
}