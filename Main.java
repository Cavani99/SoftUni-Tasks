import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text=sc.nextLine();
        StringBuilder digits=new StringBuilder();
        StringBuilder letters=new StringBuilder();
        StringBuilder symbols=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i))){
                digits.append(text.charAt(i));
            }else if(Character.isLetter(text.charAt(i))){
                letters.append(text.charAt(i));
            }else symbols.append(text.charAt(i));
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}