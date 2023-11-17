import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  input=sc.nextLine();
        String regex = "(?<user>[0-9A-Za-z]+([.\\-_]?[0-9A-Za-z])+)@(?<host>(([A-Za-z]+(-]?[0-9A-Za-z])*)+(\\.{1}[A-Za-z]+(-]?[0-9A-Za-z])*)*))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.printf("%s@%s\n",matcher.group("user"),matcher.group("host"));
        }


    }
}