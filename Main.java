import java.util.Scanner;

public class Main {
    public static void IntegerOperations() {
        Scanner sc = new Scanner(System.in);

        int number1 = Integer.parseInt(sc.nextLine());
        int number2 = Integer.parseInt(sc.nextLine());
        int number3 = Integer.parseInt(sc.nextLine());
        int number4 = Integer.parseInt(sc.nextLine());

        int sum=number1 + number2;
        sum/=number3;
        sum*=number4;

        System.out.println(sum);

    }


    public static void main(String[] args) {
        IntegerOperations();
    }
}