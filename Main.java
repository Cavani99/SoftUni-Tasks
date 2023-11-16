import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input=sc.nextLine().split(", *");
        for (int i = 0; i < input.length; i++) {
            int health = 0;
            double damage = 0;

            StringBuilder hp = new StringBuilder();


            String regex = "([^0-9+\\-*/.\\s,])";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input[i]);

            while (matcher.find()) {
                hp.append(matcher.group());
            }

            for (int j = 0; j < hp.length(); j++) {
                int ch = hp.charAt(j);
                health += ch;
            }

            regex = "([+-]?\\d+[.]?\\d+)|[+-]?[0-9]";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(input[i]);
            String dmg;
            while (matcher.find()) {
                dmg = matcher.group();
                damage += Double.parseDouble(dmg);
            }
            regex = "[*/]";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(input[i]);
            while (matcher.find()) {
                dmg = matcher.group();
                if(dmg.equals("*"))
                    damage*=2;
                else
                    damage/=2;
            }

            System.out.printf("%s - %d health, %.2f damage\n", input[i].replaceAll(" ",""), health, damage);

        }

    }
}