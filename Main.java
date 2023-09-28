import java.util.Scanner;

public class Main {
    public static void CondenseArrayToNumber() {
        Scanner sc = new Scanner(System.in);

        int wagons=Integer.parseInt(sc.nextLine());
        int [] arr=new int[wagons];

        int sum=0;
        for(int i=0;i<arr.length;i++){
            int peopleInWagon=Integer.parseInt(sc.nextLine());
            arr[i]=peopleInWagon;
            sum+=peopleInWagon;
        }
        for (int index : arr) {
            System.out.print(index + " ");
        }

        System.out.println("\n"+sum);
         
    }


    public static void main(String[] args) {
        CondenseArrayToNumber();
    }
}