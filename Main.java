import java.util.Scanner;

public class Main {
    public static void SumOfChars() {
        Scanner sc = new Scanner(System.in);

        int characters = Integer.parseInt(sc.nextLine());

        int sum=0;
        for(int i=1;i<=characters;i++){
            char ch=sc.nextLine().charAt(0);
            sum+=ch;

        }
        System.out.printf("The sum equals: %d",sum);

    }


    public static void main(String[] args) {
        SumOfChars();
    }
}