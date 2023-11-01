import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,Integer>counts=new LinkedHashMap<>();
        String resource;
        int quantity;
        String command=sc.nextLine();
        while(!command.equals("stop")){
            resource=command;
            quantity=Integer.parseInt(sc.nextLine());

            if(!counts.containsKey(resource))
                counts.put(resource,quantity);
            else
                counts.put(resource,counts.get(resource)+quantity);


            command=sc.nextLine();
        }

        for (Map.Entry<String,Integer>entry: counts.entrySet()){
            System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue());
        }



    }
}