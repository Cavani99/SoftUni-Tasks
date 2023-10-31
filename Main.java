import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        LinkedHashMap<String,ArrayList<String>> words=new LinkedHashMap<>();
        for(int i=0;i<number;i++){
            String word=sc.nextLine();
            String synonym=sc.nextLine();

            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);
        }

        for(Map.Entry<String,ArrayList<String>>entry:words.entrySet()){

            System.out.printf("%s - %s\n",entry.getKey(), Arrays.toString(entry.getValue().toArray())
                    .replace("[","").replace("]",""));
        }

    }
}