import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void EqualArrays() {
        Scanner sc = new Scanner(System.in);

        int [] numberArray1= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int [] numberArray2= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum=0;
        boolean areDifferent=false;
        for (int i=0;i<numberArray1.length;i++){
            sum+=numberArray1[i];
            if(numberArray1[i]!=numberArray2[i]){
                System.out.printf("Arrays are not identical." +
                        " Found difference at %d index.",i);
                areDifferent=true;
                break;
            }
        }
        if(!areDifferent){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }


    public static void main(String[] args) {
        EqualArrays();
    }
}