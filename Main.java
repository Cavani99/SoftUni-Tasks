import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void listOperations(){
        Scanner sc = new Scanner(System.in);

        List<Integer> elements=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        String [] command=sc.nextLine().split(" ");
        while(!command[0].equals("End")){

            if(command[0].equals("Add")){
                int value= Integer.parseInt(command[1]);
                elements.add(value);
            }else if(command[0].equals("Insert")){
                int value= Integer.parseInt(command[1]);
                int index=Integer.parseInt(command[2]);
                if(index>= elements.size() || index<0)
                    System.out.println("Invalid index");
                else
                    insertElement(elements,value,index);
            }else if(command[0].equals("Remove")){
                int index=Integer.parseInt(command[1]);
                if(index>= elements.size() || index<0)
                    System.out.println("Invalid index");
                else
                    elements.remove(index);
            }else if(command[0].equals("Shift")){
                String direction=command[1];
                int count=Integer.parseInt(command[2]);

                shiftNumber(elements,direction,count);
            }


            command=sc.nextLine().split(" ");
        }




        printElements(elements);
    }

    public static void insertElement(List <Integer> elements,int value,int index){

        elements.add(index,value);

    }

    public static void shiftNumber(List <Integer> elements,String direction,int count){

        if(direction.equals("left")) {
            Collections.rotate(elements,-count);

        }
        else if(direction.equals("right")) {
            Collections.rotate(elements,count);
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