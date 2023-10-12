import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void trainCommands(){
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        int capacity=Integer.parseInt(sc.nextLine());
        String [] command=sc.nextLine().split(" ");
        while(!command[0].equals("end")){

            if(command[0].equals("Add")){
                int passengers= Integer.parseInt(command[1]);
                wagons.add(passengers);
            }else{
                int passengers= Integer.parseInt(command[0]);
                addToWagon(wagons,capacity,passengers);
            }


            command=sc.nextLine().split(" ");
        }




        printElements(wagons);
    }

    public static void addToWagon(List <Integer> wagons,int capacity,int passengers){

        for(int i=0;i< wagons.size();i++){
            if(wagons.get(i)+passengers<=capacity){
                wagons.set(i, wagons.get(i)+passengers);
                break;
            }
        }

    }


    public static void printElements(List <Integer> items){


            for (Integer item:items) {
                System.out.print(item + " ");
            }


    }




    public static void main(String[] args) {

        trainCommands();


    }
}