import java.util.Scanner;

public class Main {
    public static void  ReversedChars() {
        Scanner sc = new Scanner(System.in);


        char first= sc.nextLine().charAt(0);
        char second= sc.nextLine().charAt(0);
        char third= sc.nextLine().charAt(0);


        System.out.printf("%c %c %c",third,second,first);

    }

    public static void main(String[] args) {
        ReversedChars();
    }
}