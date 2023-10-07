import java.util.Scanner;

public class Main {

    public static long getTribonacci(long n1,long n2,long n3) {

        return n1+n2+n3;

    }

    public static void printTribonacciSequence(long n){
        long number1=1;
        long number2=1;
        long number3=2;


        for(int i=1;i<=n;i++){
            if(i>=4) {
                long number4 = getTribonacci(number1, number2, number3);
                System.out.print(number4 + " ");
                number1 = number2;
                number2 = number3;
                number3 = number4;
            }else if(i==1)
                System.out.print(number1+" ");
            else if(i==2)
                System.out.print(number2+" ");
            else if(i==3){
                System.out.print(number3+" ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());

        printTribonacciSequence(number);

    }
}