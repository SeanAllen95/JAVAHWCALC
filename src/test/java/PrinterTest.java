import org.example.Printer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }
}
