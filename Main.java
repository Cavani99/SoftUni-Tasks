import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void listOperations(){
        Scanner sc = new Scanner(System.in);

        List<Integer> elements=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        String [] command=sc.nextLine().split(" ");
        while(!command[0].equals("end")){

            if(command[0].equals("Delete")){
                int value= Integer.parseInt(command[1]);
                deleteElement(elements,value);
            }else if(command[0].equals("Insert")){
                int value= Integer.parseInt(command[1]);
                int index=Integer.parseInt(command[2]);
                insertElement(elements,value,index);
            }


            command=sc.nextLine().split(" ");
        }




        printElements(elements);
    }

    public static void insertElement(List <Integer> elements,int value,int index){

         elements.add(index,value);

    }

    public static void deleteElement(List <Integer> elements,int value){

        for(int i=0;i< elements.size();i++){
            if(elements.get(i)==value){
                elements.remove(i);
                i-=1;
            }
        }

    }


    public static void printElements(List <Integer> items){


            for (Integer item:items) {
                System.out.print(item + " ");
            }


    }




    public static void main(String[] args) {

        listOperations();


    }
}