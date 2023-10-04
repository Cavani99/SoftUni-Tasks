import java.util.Scanner;

public class Main {

    public static int getSumOfEvens(int n){
        int sum=0;

        String number=String.valueOf(n);
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)=='-')
                i++;
            int numberToCompare=Integer.parseInt(String.valueOf(number.charAt(i)));
            if(numberToCompare % 2==0 )
                sum+=numberToCompare;

        }

        return sum;
    }
    public static int getSumOfOdds(int n){
        int sum=0;

        String number=String.valueOf(n);
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)=='-')
                i++;
            int numberToCompare=Integer.parseInt(String.valueOf(number.charAt(i)));
            if(numberToCompare % 2!=0 )
                sum+=numberToCompare;

        }

        return sum;
    }

    public static int getMultipleOfEvensAndOdds(int number) {



       return getSumOfEvens(number)*getSumOfOdds(number);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(number));

    }
}