import java.util.Scanner;

public class Main {
    public static void add(int num1,int num2) {
        System.out.println(num1+num2);

    }
    public static void multiply(int num1,int num2) {
        System.out.println(num1*num2);

    }
    public static void subtract(int num1,int num2) {
        System.out.println(num1-num2);

    }
    public static void divide(int num1,int num2) {
        System.out.println(num1/num2);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operation=sc.nextLine();
        int number1=Integer.parseInt(sc.nextLine());
        int number2=Integer.parseInt(sc.nextLine());

        switch (operation) {
            case "add" -> add(number1, number2);
            case "multiply" -> multiply(number1, number2);
            case "subtract" -> subtract(number1, number2);
            case "divide" -> divide(number1, number2);
        }

    }
}