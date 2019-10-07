import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

       private Printer printer;

       @Before
        public void before(){
           printer = new Printer(20);
       }

       @Test
        public void sheetsRemaining(){
           assertEquals(20, printer.getNoOfSheets());
       }

        @Test
        public void canPrint(){
            assertEquals(6, printer.print(2, 3));
    }


    }
