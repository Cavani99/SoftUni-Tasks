import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []banList=sc.nextLine().split(", ");
        String text= sc.nextLine();
        for (String word:banList) {

            StringBuilder stars=new StringBuilder();
            stars.append("*".repeat(word.length()));

            while(text.contains(word)){
                text=text.replace(word,stars);
            }
        }
        System.out.println(text);
    }
}