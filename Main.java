import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void ZigZagArrays() {
        Scanner sc = new Scanner(System.in);

        int indexes=Integer.parseInt(sc.nextLine());

        int []arr1=new int[indexes];
        int []arr2=new int[indexes];

        for(int i=0;i<indexes;i++){

            int [] numbers= Arrays
                    .stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if(i % 2==0){
                arr1[i]=numbers[0];
                arr2[i]=numbers[1];
            }else{
                arr1[i]=numbers[1];
                arr2[i]=numbers[0];
            }

        }

        for (int index:arr1){
            System.out.print(index+" ");
        }
        System.out.println();
        for (int index:arr2){
            System.out.print(index+" ");
        }

    }


    public static void main(String[] args) {
        ZigZagArrays();
    }
}