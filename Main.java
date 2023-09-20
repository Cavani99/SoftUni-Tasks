import java.util.Scanner;

public class Main {
    public static void  RefactorSpecialNumbers() {
        Scanner sc = new Scanner(System.in);

        int numbers = Integer.parseInt(sc.nextLine());

        for (int index = 1; index <= numbers; index++) {

            int sum = 0;
            int digit = index;

            while (index > 0) {
                sum += index % 10;
                index = index / 10;
            }

            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if(isSpecialNum)
                System.out.printf("%d -> True\n", digit);
            else
                System.out.printf("%d -> False\n", digit);

            index=digit;
        }


    }


    public static void main(String[] args) {
        RefactorSpecialNumbers();
    }
}