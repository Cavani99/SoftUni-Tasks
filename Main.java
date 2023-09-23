import java.util.Scanner;

public class Main {
    public static void SpiceMustFlow() {
        Scanner sc = new Scanner(System.in);

        int startingYield = Integer.parseInt(sc.nextLine());

        int daysOperated=0;
        int spiceExtracted=0;


        while(startingYield>=100){
            spiceExtracted+=startingYield-26;
            startingYield-=10;
            daysOperated++;
        }

        System.out.println(daysOperated);
        System.out.println(Math.max(spiceExtracted - 26, 0));

    }


    public static void main(String[] args) {
        SpiceMustFlow();
    }
}