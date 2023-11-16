import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int number=Integer.parseInt(sc.nextLine());
        ArrayList <String> attacked=new ArrayList<>();
        ArrayList <String> destroyed=new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String input=sc.nextLine();

            String regex="[star]*[STAR]*";
            Pattern pattern= Pattern.compile(regex);
            Matcher matcher=pattern.matcher(input);
            String len="";
            while(matcher.find()) {
                len+= matcher.group();
            }
            int size=len.length();

            StringBuilder decrypted= new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char ch=input.charAt(j);
                ch-=size;
                decrypted.append(ch);
            }
            regex="[^@\\-!:>]*@(?<planet>[A-Z][a-z]*)[^@\\-!:>]*:(?<population>\\d*)[^@\\-!:>]*!(?<event>[ADad]{1})![^@\\-!:>]*->(?<soldiers>\\d+)[^@\\-!:>]*";
            pattern= Pattern.compile(regex);
            matcher=pattern.matcher(decrypted);
            if(matcher.find()){
                if(matcher.group("event").equals("A")){
                    attacked.add(matcher.group("planet"));
                }else
                    destroyed.add(matcher.group("planet"));
            }
        }
        Collections.sort(attacked);
        Collections.sort(destroyed);
        System.out.printf("Attacked planets: %d\n",attacked.size());
        for (String planet:attacked) {
            System.out.printf("-> %s\n",planet);
        }
        System.out.printf("Destroyed planets: %d\n",destroyed.size());
        for (String planet:destroyed) {
            System.out.printf("-> %s\n",planet);
        }


    }
}