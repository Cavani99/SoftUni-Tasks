import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static double calculate(int num1,char operation,int num2){


        switch (operation){
            case'/':
                return num1/num2;
            case'*':
                return num1*num2;
            case'+':
                return num1+num2;
            case'-':
                return num1-num2;


        }

        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1=Integer.parseInt(sc.nextLine());
        char operator=sc.nextLine().charAt(0);
        int number2=Integer.parseInt(sc.nextLine());


        System.out.println(new DecimalFormat("0.##").format(calculate(number1,operator,number2)));

    }
}