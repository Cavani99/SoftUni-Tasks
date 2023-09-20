import java.util.Scanner;

public class Main {
    public static void  PoundstoDollars() {
        Scanner sc = new Scanner(System.in);

        int pounds= Integer.parseInt(sc.nextLine());

        double dollars= (double) pounds*1.36;

        System.out.printf("%.3f",dollars);
    }

    public static void main(String[] args) {
        PoundstoDollars();
    }
}