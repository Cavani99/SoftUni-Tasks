import java.util.Scanner;

public class Main {


    public static void readNumberLoop() {
        Scanner sc = new Scanner(System.in);
        String input= sc.nextLine();
        int num1;

        while(!input.equals("END")){
            num1=Integer.parseInt(input);

            if(isPalindrome(num1))
                System.out.println("true");
            else
                System.out.println("false");

            input= sc.nextLine();
        }


    }

    public static boolean isPalindrome(int num1) {
         String value=String.valueOf(num1);
         String rearValue="";
         for(int i=value.length()-1;i>=0;i--){
             rearValue+=value.charAt(i);
         }

        return value.equals(rearValue);
    }



    public static void main(String[] args) {
        readNumberLoop();


    }
}