import java.util.*;

public class Main {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text=sc.nextLine();
        StringBuilder shifter=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch= (char) (text.charAt(i)+3);
            shifter.append(ch);
        }
        System.out.println(shifter);


    }
}