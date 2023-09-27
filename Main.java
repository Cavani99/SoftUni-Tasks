import java.util.Scanner;

public class Main {
    public static void PrintNumbersInReverseOrder() {
        Scanner sc = new Scanner(System.in);

        int numbers=Integer.parseInt(sc.nextLine());

        int [] numberArr=new int[numbers];

        for(int i=0;i<numbers;i++){
            int indexNumber=Integer.parseInt(sc.nextLine());
            numberArr[i]=indexNumber;
        }

        for(int i=numberArr.length-1;i>=0;i--){
            System.out.print(numberArr[i] + " ");
        }


    }


    public static void main(String[] args) {
        PrintNumbersInReverseOrder();
    }
}