import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void ArrayRotation() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int  rotations=Integer.parseInt(sc.nextLine());


        for(int i=1;i<=rotations;i++){
            int [] rotationArr=new int[numbers.length];

            for(int k=0;k<rotationArr.length;k++){

                if(k==rotationArr.length-1){
                    rotationArr[k]=numbers[0];
                }else
                    rotationArr[k]=numbers[k+1];
            }
            numbers=rotationArr;
        }

        for (int j: numbers) {
            System.out.print(j+ " ");
        }

    }


    public static void main(String[] args) {
        ArrayRotation();
    }
}