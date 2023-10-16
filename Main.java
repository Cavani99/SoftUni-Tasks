import java.util.*;
import java.util.stream.Collectors;

public class Main {



    public static void sortLists() {
        Scanner sc = new Scanner(System.in);


        List<Integer> numbers1 =
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> numbers2 =
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> mixedList=new ArrayList<>();


        int index1=0;
        int index2=numbers2.size()-1;
        while(index1< numbers1.size() && index2>=0){
            mixedList.add(numbers1.get(index1));
            mixedList.add(numbers2.get(index2));

           numbers1.remove(index1);
           numbers2.remove(index2);
           index2--;
        }

        if(!numbers1.isEmpty()){
            printInRange(mixedList,numbers1);
        }else{
            printInRange(mixedList,numbers2);
        }

    }


    public static void printInRange(List<Integer> mixed, List<Integer> constraints){
        List <Integer> range=new ArrayList<>();
        Collections.sort(constraints);

        for (int i = 0; i < mixed.size(); i++) {
            if(mixed.get(i)>constraints.get(0) && mixed.get(i)<constraints.get(1)){
                range.add(mixed.get(i));
            }
        }

        Collections.sort(range);
        printElements(range);
    }

    public static void printElements(List <Integer> items) {

        for (Integer item : items) {
            System.out.print(item + " ");
        }
    }


    public static void main(String[] args) {

        sortLists();


    }
}