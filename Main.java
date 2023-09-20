import java.util.Scanner;

public class Main {
    public static void  CharsToString() {
        Scanner sc = new Scanner(System.in);

        String input = "";
        char first= sc.nextLine().charAt(0);
        input+=first;
        char second= sc.nextLine().charAt(0);
        input+=second;
        char third= sc.nextLine().charAt(0);
        input+=third;



        System.out.println(input);

    }

    public static void main(String[] args) {
        CharsToString();
    }
}