import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ImportedTaxTest {

    @Test
    public void shouldReturnItemsWithImportedTaxAddedToIt() {
        ImportedTax tax = new ImportedTax();
        HashMap<String, Double> actual = new HashMap<String, Double>();
        HashMap<String, Double> items = new HashMap<String, Double>();

        items.put("importedchocolate", 10.0);
        items.put("book", 10.0);

        actual = tax.calculateTaxOfImportedItem(items);

        HashMap<String, Double> expected = new HashMap<String, Double>();
        expected.put("chocolate", 10.5);
        expected.put("book", 10.0);

        assertEquals(expected, actual);

    }
}