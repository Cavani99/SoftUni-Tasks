import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static double budget;
    public static void sortLists() {
        Scanner sc = new Scanner(System.in);


        budget=Double.parseDouble(sc.nextLine());

        List<Integer> drums =
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        List<Integer> copy = new ArrayList<>(drums);

        String input=sc.nextLine();

        while(!input.equals("Hit it again, Gabsy!")){
            int hitPower=Integer.parseInt(input);
            hitDrums(drums,copy,hitPower);

            input=sc.nextLine();
        }

        printElements(copy,budget);

    }


    public static void hitDrums(List <Integer> initial,List<Integer> drums, int hitPower){

        for (int i = 0; i < drums.size(); i++) {
            drums.set(i, drums.get(i)-hitPower);

            if(drums.get(i)<=0 && drums.get(i)!=-1000-hitPower){
                double newBudget=budget;
                newBudget-=initial.get(i)*3;

                if(newBudget>=0){
                    budget=newBudget;
                    drums.set(i,initial.get(i));
                }else{
                    drums.set(i,-1000);
                    i-=1;
                }

            }
        }


    }

    public static void printElements(List <Integer> items,double budget) {

        for (Integer item : items) {
            if(item>0)
                System.out.print(item + " ");
        }
        System.out.printf("\nGabsy has %.2flv.",budget);

    }


    public static void main(String[] args) {

        sortLists();


    }
}