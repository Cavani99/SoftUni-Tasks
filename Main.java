import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void listOperations(){
        Scanner sc = new Scanner(System.in);

        List<Integer> hand1=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> hand2=
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        cardFight(hand1,hand2);

        if(hand1.isEmpty())
            System.out.printf("Second player wins! Sum: %d",getSum(hand2));
        else
            System.out.printf("First player wins! Sum: %d",getSum(hand1));

    }

    public static void cardFight(List <Integer> hand1,List <Integer> hand2){

        while(true) {
            int i = 0;

            int card1 = hand1.get(i);
            int card2 = hand2.get(i);

            if (card1 > card2) {
                hand2.remove(i);
                hand1.remove(i);
                hand1.add(card1);
                hand1.add(card2);
            } else if (card2 > card1) {
                hand1.remove(i);
                hand2.remove(i);
                hand2.add(card2);
                hand2.add(card1);
            } else {
                hand1.remove(i);
                hand2.remove(i);
            }


            if (hand2.isEmpty()){
                break;
            }

            else if (hand1.isEmpty()){
                break;
            }
        }

    }

    public static int getSum(List <Integer> elements){

        int sum=0;
        for (int i=0;i< elements.size();i++) {
            sum+=elements.get(i);
        }

        return sum;
    }




    public static void main(String[] args) {

        listOperations();


    }
}