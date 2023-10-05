import java.util.Scanner;

public class Main {


    public static void getMatrix(int size) {
        int [][]arr=new int[size][size];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                System.out.print(size+" ");
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());

        getMatrix(number);

    }
}