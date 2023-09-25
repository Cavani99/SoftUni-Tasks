import java.util.Scanner;

public class Main {
    public static void PrimeChecker() {
        Scanner sc = new Scanner(System.in);

        int range = Integer.parseInt(sc.nextLine());
        for (int number = 2; number <= range; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", number, isPrime);
        }


    }


    public static void main(String[] args) {
        PrimeChecker();
    }
}