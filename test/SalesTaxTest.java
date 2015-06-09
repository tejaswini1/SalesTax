import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class SalesTaxTest {

    @Test
    public void shouldReturnItemsWithImportedTaxAddedToIt() {
        SalesTax tax = new SalesTax();
        HashMap<String, Double> actual = new HashMap<String, Double>();
        HashMap<String, Double> items = new HashMap<String, Double>();

        items.put("chocolate", 10.0);
        items.put("book", 10.0);
        items.put("music CD", 60.0);

        actual = tax.calculate(items);

        HashMap<String, Double> expected = new HashMap<String, Double>();
        expected.put("chocolate", 10.0);
        expected.put("book", 10.0);
        expected.put("music CD", 66.0);

        assertEquals(expected, actual);

    }

}