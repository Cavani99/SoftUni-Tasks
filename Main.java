import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] tickets=sc.nextLine().split(", +");
        for (int i = 0; i < tickets.length; i++) {
            String ticket=tickets[i].replaceAll(" ","");

            String regex = ".{20,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ticket);
            String size="";
            if(matcher.find()){
               size=matcher.group();
            }
            matcher = pattern.matcher(ticket);
            if (matcher.find() && size.length()==20){
                String symbols1="";
                String symbols2=".";

                String subString1=ticket.substring(0,10);
                String subString2=ticket.substring(subString1.length());

                regex = "(\\${6,10}|@{6,10}|#{6,10}|\\^{6,10})";
                pattern = Pattern.compile(regex);
                matcher = pattern.matcher(subString1);
                while (matcher.find()){
                    symbols1= matcher.group();

                }
                matcher = pattern.matcher(subString2);
                while (matcher.find()){
                    symbols2= matcher.group();
                }

                if(symbols1.equals(symbols2)){
                    char ch=symbols1.charAt(0);
                    if(symbols1.length()>=6 && symbols1.length()<=9){
                        System.out.printf("ticket \"%s\" - %d%c\n",ticket,symbols1.length(),ch);
                    }else if(symbols1.length()==10)
                        System.out.printf("ticket \"%s\" - %d%c Jackpot!\n",ticket,symbols1.length(),ch);

                } else if (symbols1.length()<symbols2.length() && !symbols1.equals("") && symbols1.charAt(0)==symbols2.charAt(0)) {
                    char ch=symbols1.charAt(0);
                    System.out.printf("ticket \"%s\" - %d%c\n",ticket,symbols1.length(),ch);

                }else if (symbols2.length()<symbols1.length() && !symbols2.equals(".") && symbols1.charAt(0)==symbols2.charAt(0)) {
                    char ch=symbols2.charAt(0);
                    System.out.printf("ticket \"%s\" - %d%c\n",ticket,symbols2.length(),ch);

                }
                else System.out.printf("ticket \"%s\" - no match\n",ticket);

            }
           else{
                System.out.println("invalid ticket");
           }
        }
    }
}