import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void SumEqualNumbersInList(){
        Scanner sc = new Scanner(System.in);

        List<Double> numbers=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Double::parseDouble).collect(Collectors.toList());

        for(int i=0;i<numbers.size();i++){
            if(i!= numbers.size()-1){
                if(numbers.get(i).equals(numbers.get(i+1))){
                    numbers.set(i,(numbers.get(i)+numbers.get(i+1)));
                    numbers.remove(i+1);
                    i=-1;
                }
            }
        }

        String output= joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    public static String joinElementsByDelimiter(List <Double> items,String delimiter){

        String output="";
        for(Double item: items)
            output+=(new DecimalFormat("0.#").format(item)+delimiter);

        return output;
    }



    public static void main(String[] args) {

        SumEqualNumbersInList();


    }
}