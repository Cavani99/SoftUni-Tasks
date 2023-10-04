import java.util.Scanner;

public class Main {
    public static void printingTriangle(int size) {

    //print the upper and middle part of the triangle
       for(int i=1;i<=size;i++){
          for(int k=1;k<=i;k++){
              System.out.print(k+" ");
          }
          System.out.println();
       }

    //print the bottom part of the triangle
        for(int i=size-1;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());

        printingTriangle(size);
    }
}