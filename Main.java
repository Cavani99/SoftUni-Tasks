import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void EvenAndOddSubtraction() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumEven=0;
        int sumOdd=0;
        for (int number : numbers) {
            if (number % 2 == 0)
                sumEven += number;
            else
                sumOdd += number;
        }

        System.out.println(sumEven-sumOdd);


    }


    public static void main(String[] args) {
        EvenAndOddSubtraction();
    }
}