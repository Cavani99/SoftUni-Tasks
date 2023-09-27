import java.util.Scanner;

public class Main {
    public static void ReverseArrayOfStrings() {
        Scanner sc = new Scanner(System.in);

       String [] characters =sc.nextLine().split(" ");

       for(int i=0;i<characters.length/2;i++){
           String oldElement=characters[i];
           characters[i]=characters[characters.length-1-i];
           characters[characters.length-1-i]=oldElement;

       }
        System.out.println(String.join(" ",characters));




    }


    public static void main(String[] args) {
        ReverseArrayOfStrings();
    }
}