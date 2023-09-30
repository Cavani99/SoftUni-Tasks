import java.util.Scanner;

public class Main {
    public static void PascalTriangle() {
        Scanner sc = new Scanner(System.in);

        int rows=Integer.parseInt(sc.nextLine());

        int []arrValue=new int[rows];
        for(int i=1;i<=rows;i++){
            int []arr=new int[i];
            for(int j=0;j<arr.length;j++){
                if(j==0)
                    arr[j]=1;
                else
                    arr[j]=arrValue[j]+arrValue[j-1];
            }
            for (int index:arr) {
                System.out.print(index+" ");
            }
            System.out.println();

            System.arraycopy(arr, 0, arrValue, 0, arr.length);
        }


    }

    public static void main(String[] args) {
        PascalTriangle();
    }
}