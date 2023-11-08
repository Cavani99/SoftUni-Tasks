import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] text=sc.nextLine().split(", ");
        for (String word: text) {
            if(word.length()>=3 && word.length()<=16){
                boolean isValid=true;
                for (int i = 0; i < word.length(); i++) {
                    char ch=word.charAt(i);
                    if(Character.isLetter(ch) || Character.isDigit(ch) || ch=='-' || ch=='_') ;
                    else {
                        isValid=false;
                        break;
                    }
                }
                if(isValid)
                    System.out.println(word);
            }

        }

    }
}