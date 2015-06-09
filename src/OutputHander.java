import java.util.HashMap;

public class OutputHander {


    public void display(HashMap<String, Double> result){

        System.out.print(result.toString());

    }

    public void displayTotalAmount(HashMap<String, Double> result){
        double total = 0.0;
        for(String string: result.keySet())
        {
            total +=result.get(string);
        }
        System.out.println("Total Amount "+total);
    }

}
