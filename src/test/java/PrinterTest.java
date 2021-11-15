import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() {printer = new Printer(200, 1000);}

    @Test
    public void checkPaper(){
        assertEquals(200, printer.getSheetsOfPaper());
    }

    @Test
    public void printDocument(){
        assertEquals(185, printer.print(5, 3));
    }

    @Test
    public void cantPrintDocument(){
        assertEquals(200, printer.print(100, 3));
    }

    @Test
    public void checkTonerReduces(){
        assertEquals(970, printer.reduceTonerLevel(10, 3));
    }

}