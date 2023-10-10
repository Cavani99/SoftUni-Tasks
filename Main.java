import java.util.Scanner;

public class Main {


    public static void BitAtPositionN(){
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int n=Integer.parseInt(sc.nextLine());
        int bitAtPositionN = 0;

        String num;
        for(int i=0;i<n;i++){
            bitAtPositionN=number >> 1;
            number=bitAtPositionN;
            num = Integer.toBinaryString(bitAtPositionN);
            bitAtPositionN= Integer.parseInt(String.valueOf(num.charAt(num.length()-1)));


            bitAtPositionN= bitAtPositionN & 1;
        }



        System.out.println(bitAtPositionN);

    }




    public static void main(String[] args) {

        BitAtPositionN();


    }
}