import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key=Integer.parseInt(sc.nextLine());
        String text=sc.nextLine();
        while (!text.equals("end")){
            StringBuilder decoded=new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch= (char) (text.charAt(i)-key);
                decoded.append(ch);
            }

            String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behaviour>[NG])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decoded);
            while (matcher.find()){
                String name= matcher.group("name");
                String ch=matcher.group("behaviour");
                if(ch.equals("G"))
                    System.out.println(name);
            }

            text=sc.nextLine();
        }


    }
}