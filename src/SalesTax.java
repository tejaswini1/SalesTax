import java.util.HashMap;

public class SalesTax {
    private double tax = 0.1;
    private NonTaxableItems nonTaxableItems;
    private TaxableItems taxableItems;
    private HashMap<String, Double> resultList = new HashMap<String, Double>();

    SalesTax(){
        nonTaxableItems = new NonTaxableItems();
        taxableItems = new TaxableItems();
    }

    public HashMap<String, Double> calculate(HashMap<String, Double> items) {
        for(String item : items.keySet()) {
            double price = items.get(item);

            if(taxableItems.contains(item)){
                price += price * tax;
                resultList.put(item, price);
            }

            else
                resultList.put(item, price);

        }
        return resultList;

    }
}
