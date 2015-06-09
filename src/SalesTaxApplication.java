import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SalesTaxApplication {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> input = new HashMap<String, String>();
        TaxableItems taxableItems = new TaxableItems();
        NonTaxableItems nonTaxableItems = new NonTaxableItems();

        while(true){
            int flag = 0;
            if(Integer.parseInt(bufferedReader.readLine()) == 0)
                break;

            String tempInput = bufferedReader.readLine();
            if(tempInput.contains("imported"));
                    flag = 1;
            String[] temp =tempInput.split(" ");

            for(String string : temp){
                if(taxableItems.contains(string) || nonTaxableItems.contains(string)) {
                    if(flag == 1)
                    input.put("imported"+string, temp[temp.length - 1]);
                    break;
                }
            }
        }
    }
}
