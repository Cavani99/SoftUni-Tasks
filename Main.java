import java.util.Scanner;

public class Main {


    public static void BinaryDigitsCount(){
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int bit=Integer.parseInt(sc.nextLine());

        String binary=Integer.toBinaryString(number);
        int count=0;
        for(int i=0;i<binary.length();i++){
            char ch=binary.charAt(i);
            int value=Integer.parseInt(String.valueOf(ch));

            if(value == bit)
                count++;
        }

        System.out.println(count);

    }




    public static void main(String[] args) {

        BinaryDigitsCount();


    }
}