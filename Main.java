import java.util.Scanner;

public class Main {
    public static void PokeMon() {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distanceBetweenTargets = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());

        int pokes=0;
        int pokeOriginal=pokePower;

        while(pokePower>=distanceBetweenTargets) {
            int subtract = pokePower-distanceBetweenTargets;
            if(subtract>=0)
                pokes++;
            else
                break;
            pokePower-=distanceBetweenTargets;

            if(pokeOriginal/2 == pokePower){

                if( exhaustionFactor != 0){
                    pokePower/=exhaustionFactor;
                }

            }

        }

        System.out.println(pokePower);
        System.out.println(pokes);




    }


    public static void main(String[] args) {
        PokeMon();
    }
}