import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NonTaxableItemsTest {
    @Test
    public void shouldReuturnTrueIfItemIsPresent(){

        NonTaxableItems nonTaxableItems = new NonTaxableItems();

        boolean actual = nonTaxableItems.contains("chocolate");

        assertEquals(true, actual);
    }

    @Test
    public void shouldReuturnFalseIfItemIsNotPresent(){

        NonTaxableItems nonTaxableItems = new NonTaxableItems();

        boolean actual = nonTaxableItems.contains("movie ticket");

        assertFalse(actual);
    }

}