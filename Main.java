import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex="%(?<name>[A-Z][a-z]+)%[^|$.%]*<(?<product>\\w+)>[^|$.%]*\\|(?<count>\\d+)\\|[^|$.%]*?(?<price>\\d+[.]?\\d+)\\$";

        Pattern pattern= Pattern.compile(regex);

        double sum=0;
        String input=sc.nextLine();
        while(!input.equals("end of shift")){
            Matcher matcher=pattern.matcher(input);
            if(matcher.find()){
                System.out.printf("%s: %s - %.2f\n",matcher.group("name"),matcher.group("product"),
                        Integer.parseInt(matcher.group("count"))*Double.parseDouble(matcher.group("price")));
                sum+=Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("count"));
            }

            input=sc.nextLine();
        }
        System.out.printf("Total income: %.2f",sum);

    }
}