import java.util.*;

public class Main {

    public static int sumOfString(String text1,String text2,int sum){
        for (int i = 0; i < text2.length(); i++) {

            sum+=text1.charAt(i)*text2.charAt(i);
        }
        for (int i = text2.length(); i < text1.length(); i++) {
            sum+=text1.charAt(i);
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] text=sc.nextLine().split(" ");
        int sum=0;
        if(text[0].length()>=text[1].length())
            System.out.println(sumOfString(text[0],text[1],sum));
        else System.out.println(sumOfString(text[1],text[0],sum));


    }
}