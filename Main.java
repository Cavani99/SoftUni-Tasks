import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void SumEqualNumbersInList(){
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers1=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> numbers2=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());


        int loops = numbers1.size()+numbers2.size();
        List <Integer> mergeList = new ArrayList<>(loops);

        while(mergeList.size()<loops)
            mergeList.add(0);

        boolean positive=false;
        int index=0;
        for(int i=0;i<mergeList.size();i++){

            if(index<numbers1.size() && !positive){
                mergeList.set(i, numbers1.get(index));
                positive=true;
            }
            else if(index<numbers2.size() && positive) {
                mergeList.set(i, numbers2.get(index));
                positive=false;
                index++;
            }
            else if(index>= numbers1.size()){
                mergeList.set(i, numbers2.get(index));
                index++;
            }
            else{
                index++;
                mergeList.set(i, numbers1.get(index));
            }
        }




        printElements(mergeList, " ");
    }

    public static void printElements(List <Integer> items,String delimiter){

        for(Integer item: items)
            System.out.print(item + delimiter);


    }



    public static void main(String[] args) {

        SumEqualNumbersInList();


    }
}