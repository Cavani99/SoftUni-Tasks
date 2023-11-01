import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <Character,Integer>counts=new LinkedHashMap<>();
        String text=sc.nextLine().replace(" ","");
        for (int i = 0; i < text.length(); i++) {
            char ch=text.charAt(i);

            if(!counts.containsKey(ch))
                counts.put(ch,1);
            else
                counts.put(ch,counts.get(ch)+1);

        }

        for (Map.Entry<Character,Integer>entry:counts.entrySet()){
            System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue());
        }


    }
}