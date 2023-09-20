import java.util.Scanner;

public class Main {
    public static void  LowerOrUpper() {
        Scanner sc = new Scanner(System.in);

        char character= sc.nextLine().charAt(0);

       if((int) character>=65 && (int)character<=90){
           System.out.println("upper-case");
       }else
           System.out.println("lower-case");

    }


    public static void main(String[] args) {
        LowerOrUpper();
    }
}