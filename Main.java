import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text=sc.nextLine();
        StringBuilder rage=new StringBuilder();
        String unique="";
        int uniqueSymbols=0;

        String regex = "(?<symbols>\\D+)(?<num>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


        while(matcher.find()){

            String result= matcher.group("symbols");
            int amount= Integer.parseInt(matcher.group("num"));

            rage.append(result.toUpperCase().repeat(Math.max(0, amount)));
            if(amount>0){
                for (int i = 0; i < result.length(); i++) {
                    String ch=String.valueOf(result.charAt(i)).toUpperCase();
                    if(!unique.contains(ch)){
                        uniqueSymbols++;
                        unique+=ch;
                    }

                }
            }
        }


        System.out.printf("Unique symbols used: %d\n",uniqueSymbols);
        System.out.println(rage);


    }
}