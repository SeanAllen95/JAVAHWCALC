import org.example.WaterBottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void subtractVolume(){
        assertEquals(90, waterBottle.subtractDrink());
    }

    @Test
    public void emptyVolume(){
        assertEquals(0, waterBottle.emptyDrink());
    }
    @Test
    public void fillVolume(){
        assertEquals(100, waterBottle.fillDrink());
    }
}
