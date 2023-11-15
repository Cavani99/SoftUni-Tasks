import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String>matched=new ArrayList<>();
        String input=sc.nextLine();
        String regex="\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            matched.add(matcher.group());
        }

        System.out.println(String.join(", ",matched));

    }
}