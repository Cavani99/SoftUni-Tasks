import java.util.Scanner;

public class Main {


    public static void readNumberLoop(int num) {

        for (int i=1;i<=num;i++){
            int digitSum=sumOfDigits(i);
            if(digitSum % 8==0 && oddDigitPresent(i))
                System.out.println(i);
        }

    }

    public static int sumOfDigits(int num) {
        String value=String.valueOf(num);
        int sum=0;

        for(int i=0;i<value.length();i++){
             int digit=Integer.parseInt(String.valueOf((value.charAt(i))));
             sum+=digit;
        }

        return sum;
    }
    public static boolean oddDigitPresent(int num) {
        String value=String.valueOf(num);

        for(int i=0;i<value.length();i++){
            int digit=Integer.parseInt(String.valueOf((value.charAt(i))));

            if(digit % 2!=0)
                return true;
        }

        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= Integer.parseInt(sc.nextLine());

        readNumberLoop(number);


    }
}