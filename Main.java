import java.util.Scanner;

public class Main {

    public static int getVowelsCount(String input){
        int sum=0;

       for(int i=0;i<input.length();i++){
           char ch=input.charAt(i);

           switch (ch){
               case 'a':
               case 'e':
               case 'i':
               case 'o':
               case 'u':
               case 'y':
               case 'A':
               case 'E':
               case 'I':
               case 'O':
               case 'U':
               case 'Y':
                   sum++;
                   break;
           }

       }


        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        System.out.println(getVowelsCount(input));


    }
}