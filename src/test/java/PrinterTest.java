import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    public class BearTest {

       private Printer printer;

       @Before
        public void before(){
           printer = new Printer(1);
       }

       @Test
        public void sheetsRemaining(){
           assertEquals(1, printer.getNoOfSheets());
       }


    }


}
