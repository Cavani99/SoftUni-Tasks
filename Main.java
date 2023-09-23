import java.util.Scanner;

public class Main {
    public static void WaterOverflow() {
        Scanner sc = new Scanner(System.in);

        int litersOfWater = Integer.parseInt(sc.nextLine());

        int amountFilled=0;

        for(int i=1;i<=litersOfWater;i++){
            int liters = Integer.parseInt(sc.nextLine());
            amountFilled+=liters;

            if(amountFilled>255) {
                System.out.println("Insufficient capacity!");
                amountFilled-=liters;
            }

        }
        System.out.println(amountFilled);


    }


    public static void main(String[] args) {
        WaterOverflow();
    }
}