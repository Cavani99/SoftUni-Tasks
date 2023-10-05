import java.util.Scanner;

public class Main {

    public static int sumTwoNumbers(int num1,int num2) {

        return num1+num2;
    }
    public static int subtractTwoNumbers(int num1,int num2,int num3) {
        int sum=sumTwoNumbers(num1,num2);

        return sum-num3;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        int num3=Integer.parseInt(sc.nextLine());

        System.out.println(subtractTwoNumbers(num1,num2,num3));

    }
}