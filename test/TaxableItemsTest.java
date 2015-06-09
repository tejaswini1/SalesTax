import org.junit.Test;

import static org.junit.Assert.*;

public class TaxableItemsTest {

    @Test
    public void shouldReuturnTrueIfItemIsPresent(){

        TaxableItems TaxableItems = new TaxableItems();

        boolean actual = TaxableItems.contains("music CD");

        assertEquals(true, actual);
    }

    @Test
    public void shouldReuturnFalseIfItemIsNotPresent(){

        TaxableItems TaxableItems = new TaxableItems();

        boolean actual = TaxableItems.contains("chocolate");

        assertFalse(actual);
    }

}