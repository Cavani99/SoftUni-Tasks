import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void TopIntegers() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentNumber;

        for(int i=0;i<numbers.length;i++) {
            boolean isNotBiggerThanAll=false;
            currentNumber = numbers[i];

            for (int k = i+1; k < numbers.length; k++) {
                if (currentNumber <= numbers[k]) {
                    isNotBiggerThanAll = true;
                    break;
                }

            }
            if(!isNotBiggerThanAll)
                System.out.print(currentNumber+ " ");
        }

    }

    public static void main(String[] args) {
        TopIntegers();
    }
}