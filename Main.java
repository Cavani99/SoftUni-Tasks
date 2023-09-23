import java.util.Scanner;

public class Main {
    public static void BeerKegs() {
        Scanner sc = new Scanner(System.in);

        int beerKegs = Integer.parseInt(sc.nextLine());

        String bestModel="";
        double bestVolume=0;
        for(int i=1;i<=beerKegs;i++){
            String model=sc.nextLine();
            double radius=Double.parseDouble(sc.nextLine());
            int height=Integer.parseInt(sc.nextLine());

            double volume= Math.PI* radius*radius *height;
            if(volume>bestVolume){
                bestModel=model;
                bestVolume=volume;
            }



        }
        System.out.println(bestModel);

    }


    public static void main(String[] args) {
        BeerKegs();
    }
}