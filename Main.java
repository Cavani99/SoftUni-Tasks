import java.util.Scanner;

public class Main {


    public static void BitAtPosition1(){
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int n=1;
        int bitAtPosition1 = 0;

        String num;
        for(int i=0;i<n;i++){
            bitAtPosition1=number >> 1;
            number=bitAtPosition1;
            num = Integer.toBinaryString(bitAtPosition1);
            bitAtPosition1= Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));


            bitAtPosition1= bitAtPosition1 & 1;
        }



        System.out.println(bitAtPosition1);

    }




    public static void main(String[] args) {

        BitAtPosition1();


    }
}