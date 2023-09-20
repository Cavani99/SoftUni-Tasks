import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void  ExactSumofRealNumbers() {
        Scanner sc = new Scanner(System.in);

        int numbers= Integer.parseInt(sc.nextLine());
        BigDecimal sum = BigDecimal.valueOf(0);

         for(int i=1;i<=numbers;i++){
             BigDecimal decimal= new BigDecimal(sc.nextLine());
             sum=sum.add(decimal);
         }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        ExactSumofRealNumbers();
    }
}