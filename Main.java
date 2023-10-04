import java.util.Scanner;

public class Main {
    public static String repeatString(String string,int amount) {
        String newString="";

        for(int i=1;i<=amount;i++){
            newString+=string;
        }

        return newString;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int repetitions=Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(input,repetitions));

    }
}