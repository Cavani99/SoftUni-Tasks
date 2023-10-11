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
                case "Contains":
                    int number= Integer.parseInt(command[1]);
                    containsValue(numbers,number);
                    break;
                case "Print":
                    String value=command[1];
                    if(value.equals("even"))
                        printEven(numbers);
                    else
                        printOdd(numbers);
                    break;
                case "Get":
                    if(command[1].equals("sum"))
                        getSumOfList(numbers);
                    break;
                case "Filter":
                    String condition=command[1];
                    number=Integer.parseInt(command[2]);
                    filterByCondition(numbers,condition,number);
                    break;
            }


            command=sc.nextLine().split(" ");
        }




    }

    public static void containsValue(List<Integer> list,int value){

       boolean valueExists= list.contains(value);
       if(valueExists)
           System.out.println("Yes");
       else
           System.out.println("No such number");

    }

    public static void printEven(List<Integer> list){

        for (Integer even : list) {
            if (even % 2 == 0)
                System.out.print(even + " ");
        }
        System.out.println();

    }

    public static void printOdd(List<Integer> list){

        for (Integer odd : list) {
            if (odd % 2 != 0)
                System.out.print(odd + " ");
        }
        System.out.println();
    }
    public static void getSumOfList(List<Integer> list){
        int sum=0;
        for(int index:list)
            sum+=index;

        System.out.println(sum);
    }

    public static void filterByCondition(List<Integer> list,String condition,int number){
        switch (condition){
            case "<":
                for (int index: list) {
                    if(index<number)
                        System.out.print(index+" ");
                }
                System.out.println();
                break;
            case ">":
                for (int index: list) {
                    if(index>number)
                        System.out.print(index+" ");
                }
                System.out.println();
                break;
            case ">=":
                for (int index: list) {
                    if(index>=number)
                        System.out.print(index+" ");
                }
                System.out.println();
                break;
            case "<=":
                for (int index: list) {
                    if(index<=number)
                        System.out.print(index+" ");
                }
                System.out.println();
                break;
        }

    }






    public static void main(String[] args) {

        ListOperations();


    }
}