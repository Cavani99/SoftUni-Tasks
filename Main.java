import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            String  input=sc.nextLine();
            String regex = "_\\.+[A-Z]+[A-Za-z0-9]{4,}[A-Z]+_\\.+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            StringBuilder string=new StringBuilder();

            while(matcher.find()){
                string.append(matcher.group());
            }
            if(string.toString().equals("")){
                System.out.println("Invalid pass!");
            }else {
                regex = "[0-9]+";
                pattern = Pattern.compile(regex);
                matcher = pattern.matcher(input);
                StringBuilder num = new StringBuilder();

                while (matcher.find()) {
                    num.append(matcher.group());
                }
                if(num.toString().equals("")){
                    System.out.println("Group: default");
                }else{
                    System.out.println("Group: "+num);
                }
            }



        }



    }
}