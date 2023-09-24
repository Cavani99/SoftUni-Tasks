import java.util.Scanner;

public class Main {
    public static void Snowballs() {
        Scanner sc = new Scanner(System.in);

        int snowBalls = Integer.parseInt(sc.nextLine());

        double bestSnowValue=0;
        int bestSnowballSnow=0;
        int bestSnowballTime=0;
        int bestSnowballQuality=0;
        for(int i=1;i<=snowBalls;i++){
            int snowballSnoW =Integer.parseInt(sc.nextLine());
            int snowballTime =Integer.parseInt(sc.nextLine());
            int snowballQuality =Integer.parseInt(sc.nextLine());

            double snowValue=Math.pow(snowballSnoW/snowballTime,snowballQuality);


            if(snowValue>bestSnowValue){
                bestSnowballSnow=snowballSnoW;
                bestSnowballTime=snowballTime;
                bestSnowballQuality=snowballQuality;
                bestSnowValue=snowValue;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",bestSnowballSnow,bestSnowballTime,bestSnowValue,bestSnowballQuality);


    }


    public static void main(String[] args) {
        Snowballs();
    }
}