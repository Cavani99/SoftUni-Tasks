import java.util.Scanner;

public class Main {


    public static String getMiddleCharacter(String input) {
        String middleChar="";

        if(input.length() % 2==0){
              int middleIndex=input.length()/2;
              middleChar+=String.valueOf(input.charAt(middleIndex-1));
              middleChar+=String.valueOf(input.charAt(middleIndex));

        }else {
            int middleIndex= (int) Math.ceil(input.length()/2);
            middleChar= String.valueOf(input.charAt(middleIndex));
        }


        return middleChar;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        System.out.println(getMiddleCharacter(input));


    }
}