import java.util.Scanner;

public class Main {
    public static void SumDigits() {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        String input= String.valueOf(number);
        int sum=0;

        for(int i=0;i<=input.length()-1;i++){
            int index=Integer.parseInt(String.valueOf(input.charAt(i)));
            sum+=index;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        SumDigits();
    }
}