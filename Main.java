import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void MagicSum() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicNumber=Integer.parseInt(sc.nextLine());

        for (int i=0;i<numbers.length;i++){
            for(int k=i+1;k<numbers.length;k++){
                if(numbers[i]+numbers[k]==magicNumber && k!=i)
                    System.out.println(numbers[i]+" "+numbers[k]);
            }
        }




    }

    public static void main(String[] args) {
        MagicSum();
    }
}