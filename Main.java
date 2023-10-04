import java.util.Scanner;

public class Main {
    public static double rectangleArea(double width,double length) {

        return width*length;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width=Double.parseDouble(sc.nextLine());
        double length=Double.parseDouble(sc.nextLine());

        System.out.printf("%.0f",rectangleArea(width,length));



    }
}