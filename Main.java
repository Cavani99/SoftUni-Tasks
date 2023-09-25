import java.util.Scanner;

public class Main {
    public static void FloatingEquality() {
        Scanner sc = new Scanner(System.in);

        double number1=Double.parseDouble(sc.nextLine());
        double number2=Double.parseDouble(sc.nextLine());

        double eps=0.000001;
        double diff= Math.abs(number1-number2);
        if(eps>diff){
            System.out.println("True");
        }else
            System.out.println("False");


    }


    public static void main(String[] args) {
        FloatingEquality();
    }
}