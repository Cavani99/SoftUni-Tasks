import java.util.Scanner;

public class Main {
    public static void  ConvertMetersToKilometers() {
        Scanner sc = new Scanner(System.in);

        int meters= Integer.parseInt(sc.nextLine());

        double kMeters= (double) meters/1000;

        System.out.printf("%.2f",kMeters);
    }

    public static void main(String[] args) {
        ConvertMetersToKilometers();
    }
}