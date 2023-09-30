import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void TheLift() {
        Scanner sc = new Scanner(System.in);

        int people=Integer.parseInt(sc.nextLine());
        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index=0;
         while(true){

             while(numbers[index]==4 && index<numbers.length-1){
                 index++;
             }

             if(numbers[numbers.length-1]==4 && index==numbers.length-1 && people>0){
                 System.out.printf("There isn't enough space! %d people " +
                         "in a queue!\n",people);
                 for (int j:numbers) {
                     System.out.print(j + " ");
                 }
                 break;
             }

             else if(people>0 && numbers[index]<4){
                    numbers[index]++;
                    people--;
             }else if(people==0 && index==numbers.length-1 && numbers[numbers.length-1]==4){
                 for (int j:numbers) {
                     System.out.print(j + " ");
                 }
                 break;
             }else {
                 System.out.println("The lift has empty spots!");
                 for (int j:numbers) {
                     System.out.print(j + " ");
                 }
                 break;
             }

         }



    }

    public static void main(String[] args) {
        TheLift();
    }
}