import java.util.Scanner;

public class Main {

    public static String getCharactersRange(char ch1,char ch2){
         String charactersInBetween="";

         if(ch2>ch1) {
             for (int i = (int) ch1 + 1; i < (int) ch2; i++) {
                 charactersInBetween += (char) i + " ";
             }
         }else{
             for (int i = (int) ch2 + 1; i < (int) ch1; i++) {
                 charactersInBetween += (char) i + " ";
             }
         }

        return charactersInBetween;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input1=sc.nextLine().charAt(0);
        char input2=sc.nextLine().charAt(0);

        System.out.println(getCharactersRange(input1,input2));


    }
}