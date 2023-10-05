import java.util.Scanner;

public class Main {

    public static int getSmallest(int num1,int num2,int num3){

        int min=Math.min(num1,num2);


        return Math.min(min,num3);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=Integer.parseInt(sc.nextLine());
        int number2=Integer.parseInt(sc.nextLine());
        int number3=Integer.parseInt(sc.nextLine());

        System.out.println(getSmallest(number1,number2,number3));



    }
}