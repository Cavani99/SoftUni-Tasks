import java.util.Scanner;

public class Main {
    public static int GetFibonacci(long n) {
            if(n==1 || n==2)
                return 1;
            else{
                return GetFibonacci(n-1)+GetFibonacci(n-2);
            }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=Integer.parseInt(sc.nextLine());

        System.out.println(GetFibonacci(n));
    }
}