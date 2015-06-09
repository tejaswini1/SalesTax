import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SalesTaxApplication {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Double> input = new HashMap<String, Double>();
        TaxableItems taxableItems = new TaxableItems();
        NonTaxableItems nonTaxableItems = new NonTaxableItems();

        int i = 1;
        while (i<4) {
            int flag;
            String tempInput = bufferedReader.readLine();
            if (tempInput.contains("imported")) ;
            flag = 1;
            String[] temp = tempInput.split(" ");

            for (String string : temp) {

                if (taxableItems.contains(string) || nonTaxableItems.contains(string)) {
                    if (flag == 1) {
                        input.put("imported" + string, Double.parseDouble(temp[temp.length - 1]));
                        flag = 0;
                    } else
                        input.put(string, Double.parseDouble(temp[temp.length - 1]));
                }

            }
            i--;
        }
        System.out.println(input);
        ImportedTax importedTax = new ImportedTax();
        SalesTax salesTax = new SalesTax();
        HashMap<String, Double> intermediateResult = importedTax.calculateTaxOfImportedItem(input);

        HashMap<String, Double> result = salesTax.calculate(intermediateResult);

        OutputHander outputHander = new OutputHander();
        outputHander.display(result);
        outputHander.displayTotalAmount(result);


    }
}
