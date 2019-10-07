import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

   private WaterBottle waterbottle;

   @Before
    public void before(){
       waterbottle = new WaterBottle(100);
   }

   @Test
    public void checkVolume(){
       assertEquals(100, waterbottle.startVolume());
   }

   @Test
    public void reducesBy10(){
       waterbottle.reduceBy10();
       assertEquals(80, waterbottle.reduceBy10());
   }

   @Test
    public void emptyBottle(){
       waterbottle.reduceBy10();
       assertEquals(0, waterbottle.empty());
   }

   @Test
    public void fillBottle(){
       assertEquals(90, waterbottle.reduceBy10());
       assertEquals(80, waterbottle.reduceBy10());
       assertEquals(100, waterbottle.fill());
   }





}
