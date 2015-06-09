public class SalesTax {
    private double tax = 0.1;
    private NonTaxableItems nonTaxableItems;
    private TaxableItems taxableItems;

    SalesTax(){
        nonTaxableItems = new NonTaxableItems();
        taxableItems = new TaxableItems();
    }
}
