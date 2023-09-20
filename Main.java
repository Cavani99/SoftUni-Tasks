import java.util.Scanner;

public class Main {
    public static void  TownInfo() {
        Scanner sc = new Scanner(System.in);

        String town=  sc.nextLine();
        long population=Long.parseLong(sc.nextLine());
        int area=Integer.parseInt(sc.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",town,population,area);

    }

    public static void main(String[] args) {
        TownInfo();
    }
}