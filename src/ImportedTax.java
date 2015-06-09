import java.util.HashMap;

public class ImportedTax {

    private double importTax = 0.05;
    HashMap<String, Double> filteredItems = new HashMap<String, Double>();

    public ImportedTax() {

    }


    public HashMap<String, Double> calculateTaxOfImportedItem(HashMap<String, Double> items) {
        for (String item : items.keySet()) {
            double price = items.get(item);

            if (item.contains("imported")) {
                price += price * importTax;
                item = item.substring(8);
                filteredItems.put(item, price);
            } else
                filteredItems.put(item, price);
        }
        return filteredItems;

    }


}

