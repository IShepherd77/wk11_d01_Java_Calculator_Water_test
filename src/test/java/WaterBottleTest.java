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
    public void drinkReducesBy10(){
       waterbottle.drink();
       waterbottle.drink();
       assertEquals(70, waterbottle.drink());
   }

   @Test
    public void emptyBottle(){
       waterbottle.drink();
       assertEquals(0, waterbottle.empty());
   }

   @Test
    public void fillBottle(){
       assertEquals(90, waterbottle.drink());
       assertEquals(80, waterbottle.drink());
       assertEquals(100, waterbottle.fill());
   }





}
