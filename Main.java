import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex="(>>)(?<furniture>\\w+)(<<)(?<price>\\d+[.]?\\d+)!(?<quantity>\\d+)\\b";

        Pattern pattern= Pattern.compile(regex);

        double sum=0;
        String input=sc.nextLine();

        System.out.println("Bought furniture:");
        while(!input.equals("Purchase")){
            Matcher matcher=pattern.matcher(input);
            if(matcher.find()){
                System.out.printf("%s\n",matcher.group("furniture"));
                sum+=Double.parseDouble(matcher.group("price"))*Integer.parseInt(matcher.group("quantity"));
            }

            input=sc.nextLine();
        }
        System.out.printf("Total money spend: %.2f",sum);

    }
}