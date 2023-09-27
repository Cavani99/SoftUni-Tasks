import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void CondenseArrayToNumber() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        while(numbers.length>1){
            int []condensed=new int[numbers.length-1];
            for (int i=0;i<condensed.length;i++){
                condensed[i]=numbers[i]+numbers[i+1];
            }
            numbers=condensed;
        }
        System.out.println(numbers[0]);
    }


    public static void main(String[] args) {
        CondenseArrayToNumber();
    }
}