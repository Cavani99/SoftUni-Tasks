import java.util.*;
import java.math.BigInteger;

public class Main {


    public static void BigFactorial() {
        Scanner sc = new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());

        BigInteger sum= BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            if(i==1)
                sum=sum.multiply(BigInteger.valueOf(1));
            else
                sum=sum.multiply(BigInteger.valueOf(i));

        }

        System.out.println(sum);


    }


    public static void main(String[] args) {

        BigFactorial();


    }
}