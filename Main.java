import java.util.Scanner;

public class Main {



    public static int cartesianSystemDistance(int x,int y) {

       return Math.abs(x+y);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=Integer.parseInt(sc.nextLine());
        int y1=Integer.parseInt(sc.nextLine());
        int x2=Integer.parseInt(sc.nextLine());
        int y2=Integer.parseInt(sc.nextLine());

        if(cartesianSystemDistance(x1,y1)<=cartesianSystemDistance(x2,y2)){
            System.out.printf("(%d, %d)",x1,y1);
        }else
            System.out.printf("(%d, %d)",x2,y2);




    }
}