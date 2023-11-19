import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] text=sc.nextLine().split("\\|");

        //part 1
        String regex = "([#$%*&])(?<first>[A-Z]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text[0]);
        String firstPart="";


        while(matcher.find()){
            firstPart=matcher.group("first");
        }

        //part 2
        LinkedHashMap<Character,Integer>secondPart=new LinkedHashMap<>();
        regex="(?<char>\\d{2}):(?<length>\\d{2})";
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(text[1]);
        while (matcher.find()){
            int ch= Integer.parseInt(String.valueOf(matcher.group("char")));
            char carh= (char) ch;
            int len= Integer.parseInt(matcher.group("length"));

            if(firstPart.contains(String.valueOf(carh)))
                secondPart.put(carh,len+1);
        }

        //part 3
        String []info = new String[0];
        regex="(?<third>[\\w\\d\\S ]+)";
        pattern=Pattern.compile(regex);
        matcher=pattern.matcher(text[2]);
        while (matcher.find()){
            info=matcher.group("third").split(" +");
        }

        for (int j = 0; j < firstPart.length(); j++) {
            char symbol=firstPart.charAt(j);
            for (String s : info) {
                if (s.startsWith(String.valueOf(symbol)) && s.length() == secondPart.get(symbol)) {
                    System.out.println(s);
                    break;
                }
            }
        }
     

    }
}