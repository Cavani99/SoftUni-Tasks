import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static double mathPower(double number,int power) {
        double sum = 1;

        for(int i=0;i<power;i++){
         sum*=number;
        }

        return sum;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number=Double.parseDouble(sc.nextLine());
        int power=Integer.parseInt(sc.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number,power)));

    }
}