import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void removeNegative(){
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());


        for(int i=0;i< numbers.size();i++){
            if(numbers.get(i)<0){
                numbers.remove(i);
                i-=1;
            }
        }


        printElementsReverse(numbers);
    }



    public static void printElementsReverse(List <Integer> items){
        if(items.isEmpty()){
            System.out.println("empty");
        }else {
            for (int i=items.size()-1;i>=0;i--) {
                System.out.print(items.get(i) + " ");
            }
        }

    }




    public static void main(String[] args) {

        removeNegative();


    }
}