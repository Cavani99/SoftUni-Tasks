import java.util.Scanner;

public class Main {
    public static void TriplesofLatinLetters() {
        Scanner sc = new Scanner(System.in);

        int letters = Integer.parseInt(sc.nextLine());

        for(int i=0;i<letters;i++){
            for(int j=0;j<letters;j++){
                for(int k=0;k<letters;k++){
                     char firstChar= (char) ('a'+ i);
                     char secondChar= (char) ('a'+ j);
                     char thirdChar= (char) ('a'+ k);
                    System.out.printf("%c%c%c\n",firstChar,secondChar,thirdChar);
                }
            }
        }



    }


    public static void main(String[] args) {
        TriplesofLatinLetters();
    }
}