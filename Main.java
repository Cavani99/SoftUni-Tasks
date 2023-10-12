import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void listOperations(){
        Scanner sc = new Scanner(System.in);

        List<Integer> elements=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> bomb=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());
      
        int bombValue=bomb.get(0);
        int bombRadius=bomb.get(1);


        detonation(elements,bombValue,bombRadius);


        System.out.println(getSum(elements));
    }

    public static void detonation(List <Integer> elements,int bomb,int radius){
        int bombIndex;

        for (int i=0;i< elements.size();i++) {
            if(elements.get(i)==bomb) {
                bombIndex=i;
                int indexToRemove=bombIndex-radius;
                int amount=bombIndex-radius;

                if(indexToRemove<0){
                    indexToRemove=0;
                    amount=0;
                }

                while(amount<radius+bombIndex+1 ){
                    if(amount>0 || amount<elements.size()){
                        if(elements.size()==indexToRemove || indexToRemove<0)
                            break;
                    elements.remove(indexToRemove);
                    }
                    amount++;
                }
                i=-1;
            }

        }

    }

    public static int getSum(List <Integer> elements){
        int sum=0;
        for (int i=0;i< elements.size();i++) {
            sum+=elements.get(i);
        }

        return sum;
    }




    public static void main(String[] args) {

        listOperations();


    }
}