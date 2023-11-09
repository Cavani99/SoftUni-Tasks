import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text=sc.nextLine();
        StringBuilder out=new StringBuilder();
        char compare=' ';
        for (int i = 0; i < text.length(); i++) {
            if(i==0)
                compare=text.charAt(i);
            else if(text.charAt(i)!=compare){
                out.append(compare);
                compare=text.charAt(i);
            }
        }

        out.append(compare);
        System.out.println(out);



    }
}