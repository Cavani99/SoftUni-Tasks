import java.util.Scanner;

public class Main {


    public static double divideNumbers(int num1,int num2) {

    return getFactorial(num1)/getFactorial(num2);
    }

    public static double getFactorial(int num){
        double result=1;

        for(int i=1;i<=num;i++){
            result*=i;
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=Integer.parseInt(sc.nextLine());
        int number2=Integer.parseInt(sc.nextLine());

        System.out.printf("%.2f",divideNumbers(number1,number2));

    }
}