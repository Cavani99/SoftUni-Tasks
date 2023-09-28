import java.util.Scanner;

public class Main {
    public static void CommonElements() {
        Scanner sc = new Scanner(System.in);

        String [] arr1 =sc.nextLine().split(" ");
        String [] arr2 =sc.nextLine().split(" ");


        for(int i=0;i<arr2.length;i++){
            for(int k=0;k<arr1.length;k++){
                if(arr2[i].equals(arr1[k])){
                    System.out.print(arr2[i]+" ");
                }
            }
        }



         
    }


    public static void main(String[] args) {
        CommonElements();
    }
}