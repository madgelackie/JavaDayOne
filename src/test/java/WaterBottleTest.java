import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle myWaterBottle;

    @Before
    public void setUp() {myWaterBottle = new WaterBottle(100);}

    @Test
    public void hasVolume(){
        assertEquals(100, myWaterBottle.getVolume());
    }

    @Test
    public void reduceVolume(){
        assertEquals(90, myWaterBottle.takeDrink());
    }

    @Test
    public void checkReducedVolume(){
        WaterBottle hadDrink = new WaterBottle(100);
        hadDrink.takeDrink();
        assertEquals(90, hadDrink.getVolume());
    }
}
