import java.util.ArrayList;

public class TaxableItems {

    ArrayList<String> items = new ArrayList<String>();

    public TaxableItems() {
        items.add("music_CD");
        items.add("perfume");
    }

    public boolean contains(String item) {
        for (String iteratorItem : items) {
            if (iteratorItem.equals(item))
                return true;
        }
        return false;
    }
}
