import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void EqualSums() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int index;
        boolean indexFound=false;
        for(int i=0;i<numbers.length;i++) {
            int sumLeft=0;
            int sumRight=0;
            for(int j=i-1;j>=0;j--){
                sumLeft+=numbers[j];
            }
            for(int k=i+1;k< numbers.length;k++){
               sumRight+=numbers[k];
            }

            if(sumLeft==sumRight) {
                index=i;
                System.out.println(index);
                indexFound=true;
                break;
            }
        }

        if(!indexFound)
            System.out.println("no");

    }

    public static void main(String[] args) {
        EqualSums();
    }
}