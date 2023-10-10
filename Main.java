import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void ElementOccuringOddTimesUsingXOR(){
        Scanner sc = new Scanner(System.in);
        int [] arr= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result ^ arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]==arr[i])
                    result=result ^ arr[j];
            }
            if(result!=0){
                System.out.println(arr[i]);
                break;
            }
            result=0;

        }




    }




    public static void main(String[] args) {

        ElementOccuringOddTimesUsingXOR();


    }
}