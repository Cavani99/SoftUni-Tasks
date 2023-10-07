import java.util.Scanner;

public class Main {

    public static boolean zeroFound(int n1,int n2,int n3) {

        return n1 == 0 || n2 == 0 || n3 == 0;


    }

    public static boolean isNegative(int n1,int n2,int n3) {
        int negativeCount=0;

        if(n1<0)
            negativeCount++;
        if(n2<0)
            negativeCount++;
        if(n3<0)
            negativeCount++;

        return negativeCount % 2 != 0;

    }

    public static void MultiplicationStatus(int n1,int n2,int n3){
        if(zeroFound(n1,n2,n3))
            System.out.println("zero");
        else if(isNegative(n1,n2,n3))
            System.out.println("negative");
        else
            System.out.println("positive");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        int num3=Integer.parseInt(sc.nextLine());


        MultiplicationStatus(num1,num2,num3);


    }
}