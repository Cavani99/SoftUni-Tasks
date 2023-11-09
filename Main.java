import java.util.*;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch1=sc.nextLine().charAt(0);
        int ch2=sc.nextLine().charAt(0);
        String text=sc.nextLine();
        int sum=0;

        for (int i = 0; i < text.length(); i++) {
            int ch=text.charAt(i);
            if(ch1>ch2){
                if(ch>ch2 && ch<ch1)
                    sum+=ch;
            }else if(ch2>ch1){
                if(ch>ch1 && ch<ch2)
                    sum+=ch;
            }

        }
        System.out.println(sum);




    }
}