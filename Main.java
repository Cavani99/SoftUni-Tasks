import java.util.Scanner;

public class Main {



    public static int cartesianSystemDistance(int x,int y) {

        return (int) Math.sqrt(Math.pow((-x),2)+Math.pow((-y),2));
    }

    public static double distanceBetween2Points(int x1,int y1,int x2,int y2){

        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=Integer.parseInt(sc.nextLine());
        int y1=Integer.parseInt(sc.nextLine());
        int x2=Integer.parseInt(sc.nextLine());
        int y2=Integer.parseInt(sc.nextLine());

        int x3=Integer.parseInt(sc.nextLine());
        int y3=Integer.parseInt(sc.nextLine());
        int x4=Integer.parseInt(sc.nextLine());
        int y4=Integer.parseInt(sc.nextLine());

        double plane1= distanceBetween2Points(x1,y1,x2,y2);
        double plane2= distanceBetween2Points(x3,y3,x4,y4);


        if(plane1>=plane2){
            if(cartesianSystemDistance(x1,y1)<=cartesianSystemDistance(x2,y2)){
                System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);
            }else
                System.out.printf("(%d, %d)(%d, %d)",x2,y2,x1,y1);

        }else{
            if(cartesianSystemDistance(x3,y3)<=cartesianSystemDistance(x4,y4)){
                System.out.printf("(%d, %d)(%d, %d)",x3,y3,x4,y4);
            }else
                System.out.printf("(%d, %d)(%d, %d)",x4,y4,x3,y3);

        }


    }
}