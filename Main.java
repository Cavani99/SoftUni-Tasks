import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,Double>counts=new LinkedHashMap<>();
        LinkedHashMap <String,Integer> amount=new LinkedHashMap<>();

        String [] command=sc.nextLine().split(" ");
        while (!command[0].equals("buy")){
            String product=command[0];
            double price= Double.parseDouble(command[1]);
            int quantity=Integer.parseInt(command[2]);

            if(!counts.containsKey(product)){
                counts.put(product,price);
                amount.put(product,quantity);
            }else {
                counts.replace(product,price);
                amount.put(product,amount.get(product)+quantity);
            }



            command=sc.nextLine().split(" ");
        }




        for (Map.Entry<String,Double>entry: counts.entrySet()){

            for (Map.Entry<String,Integer>amm: amount.entrySet()) {
                if(amm.getKey().equals(entry.getKey())) {
                    double total = entry.getValue() * amm.getValue();
                    System.out.printf("%s -> %.2f\n",entry.getKey(),total);
                    break;
                }

            }
        }

    }
}