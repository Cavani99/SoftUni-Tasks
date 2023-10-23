import java.util.*;
import java.math.BigInteger;

public class Main {


    public static void SumBigNumbers() {
        Scanner sc = new Scanner(System.in);

        BigInteger num1=new BigInteger(sc.nextLine());
        BigInteger num2=new BigInteger(sc.nextLine());


        System.out.println(num1.add(num2));

    }


    public static void main(String[] args) {

        SumBigNumbers();


    }
}