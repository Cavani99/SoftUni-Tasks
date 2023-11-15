import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();
        String regex="\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);

        while(matcher.find()){
            System.out.print(matcher.group()+" ");
        }


    }
}