import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OutputHanderTest {

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayItemsAndTheirCostOutput(){
        SalesTax salesTax = mock(SalesTax.class);
        HashMap<String, Double> actual = new HashMap<String, Double>();
        HashMap<String, Double> items = new HashMap<String, Double>();

        items.put("chocolate", 10.0);
        items.put("book", 10.0);
        items.put("music_CD", 60.0);

        HashMap<String, Double> expected= new HashMap<String, Double>();
        expected.put("chocolate", 10.0);
        expected.put("book", 10.0);
        expected.put("music_CD", 66.0);

        when(salesTax.calculate(items))
                .thenReturn(expected);
        OutputHander outputHander = new OutputHander();
        outputHander.display(expected);

        assertEquals("{chocolate=10.0, book=10.0, music_CD=66.0}",outContent.toString());
    }

    @Test
    public void shouldDisplayTotalAmountOutput(){
        SalesTax salesTax = mock(SalesTax.class);
        HashMap<String, Double> actual = new HashMap<String, Double>();
        HashMap<String, Double> items = new HashMap<String, Double>();

        items.put("chocolate", 10.0);
        items.put("book", 10.0);
        items.put("music_CD", 60.0);

        HashMap<String, Double> expected= new HashMap<String, Double>();
        expected.put("chocolate", 10.0);
        expected.put("book", 10.0);
        expected.put("music_CD", 66.0);

        when(salesTax.calculate(items))
                .thenReturn(expected);
        OutputHander outputHander = new OutputHander();
        outputHander.displayTotalAmount(expected);

        assertEquals("Total Amount 86.0\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}

