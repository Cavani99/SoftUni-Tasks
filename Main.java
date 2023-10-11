import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void ListOperations(){
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());


        String [] command=sc.nextLine().split(" ");
        while(!command[0].equals("end")){
            switch (command[0]){
                case "Add":
                    int number= Integer.parseInt(command[1]);
                    addToList(numbers,number);
                    break;
                case "Remove":
                    number=Integer.parseInt(command[1]);
                    removeFromList(numbers,number);
                    break;
                case "RemoveAt":
                    int index=Integer.parseInt(command[1]);
                    removeAtIndexList(numbers,index);
                    break;
                case "Insert":
                    number=Integer.parseInt(command[1]);
                    index=Integer.parseInt(command[2]);
                    insertAtIndex(numbers,number,index);
                    break;
            }


            command=sc.nextLine().split(" ");
        }




        printElements(numbers, " ");
    }

    public static void addToList(List<Integer> list,int value){

        list.add(value);
    }

    public static void removeFromList(List<Integer> list,int value){

       list.removeAll(Collections.singleton(value));
    }

    public static void removeAtIndexList(List<Integer> list,int index){

        list.remove(index);
    }
    public static void insertAtIndex(List<Integer> list,int number,int index){

        list.add(index,number);
    }

    public static void printElements(List <Integer> items,String delimiter){

        for(Integer item: items)
            System.out.print(item + delimiter);


    }



    public static void main(String[] args) {

        ListOperations();


    }
}