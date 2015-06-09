import java.util.ArrayList;

public class NonTaxableItems {

    ArrayList<String> items = new ArrayList<String>();

    public NonTaxableItems() {
        items.add("book");
        items.add("chocolate");
        items.add("headache pills");
    }

    public boolean contains(String item) {
        for (String iteratorItem : items) {
            if (iteratorItem.equals(item))
                return true;
        }
        return false;
    }
}
