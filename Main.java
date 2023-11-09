import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static int findNumber(String text){
        StringBuilder num=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(Character.isDigit(text.charAt(i)))
                num.append(text.charAt(i));
        }

        return Integer.parseInt(String.valueOf(num));
    }

    public static BigDecimal sum(String text, int number, BigDecimal sum){

        boolean beforeNumber=true;
        for (int i = 0; i < text.length(); i++) {
            char ch=text.charAt(i);
            int letterPos;
            if(Character.isLetter(ch)){
                if(beforeNumber ){
                    if(Character.isUpperCase(ch)){
                        letterPos=ch-64;
                        sum=sum.add(BigDecimal.valueOf((double)number/letterPos));
                    }
                    else{
                        letterPos=ch-96;
                        sum=sum.add(BigDecimal.valueOf((double)number*letterPos));
                    }
                }else{
                    if(Character.isUpperCase(ch)){
                        letterPos=ch-64;
                        sum=sum.subtract(BigDecimal.valueOf(letterPos));
                    }
                    else{
                        letterPos=ch-96;
                        sum=sum.add(BigDecimal.valueOf(letterPos));
                    }
                }
            }else
                beforeNumber=false;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []info=sc.nextLine().split("\\s+");
        int number1;
        BigDecimal sum = BigDecimal.valueOf(0);
        for (int i = 0; i < info.length; i++) {
            number1=findNumber(info[i]);
            sum=sum(info[i], number1,sum);
        }
        System.out.printf("%.2f",sum);
    }
}