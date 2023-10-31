import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words=sc.nextLine().split(" ");

        LinkedHashMap<String,Integer>counts=new LinkedHashMap<>();

        for(String element:words){

            if(!counts.containsKey(element.toLowerCase()))
                counts.put(element.toLowerCase(),1);
            else
                counts.put(element.toLowerCase(),counts.get(element.toLowerCase())+1);

        }

        ArrayList <String> print=new ArrayList<>();
        for(Map.Entry<String,Integer>entry: counts.entrySet()){
            if(entry.getValue() %2!=0)
                print.add(entry.getKey());
        }

        System.out.println(print.toString() .replace("[","").replace("]",""));


    }
}