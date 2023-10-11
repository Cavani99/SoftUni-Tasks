import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void SumEqualNumbersInList(){
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int loops = numbers.size() / 2 ;


        for(int i=0;i<loops;i++){

               numbers.set(i, numbers.get(i)+ numbers.get(numbers.size()-1));
               numbers.remove(numbers.size()-1);

        }



        printElements(numbers, " ");
    }

    public static void printElements(List <Integer> items,String delimiter){

        for(Integer item: items)
            System.out.print(item + delimiter);


    }



    public static void main(String[] args) {

        SumEqualNumbersInList();


    }
}