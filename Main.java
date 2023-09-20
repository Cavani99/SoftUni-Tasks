import java.util.Scanner;

public class Main {
    public static void  ConcatNames() {
        Scanner sc = new Scanner(System.in);

        String firstName= sc.nextLine();
        String lastName= sc.nextLine();
        String delimiter= sc.nextLine();

        System.out.println(firstName+delimiter+lastName);
    }

    public static void main(String[] args) {
        ConcatNames();
    }
}