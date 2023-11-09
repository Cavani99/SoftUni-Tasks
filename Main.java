import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bigNumber=sc.nextLine().replaceFirst("^0+(?!$)", "");
        int smallNumber=Integer.parseInt(sc.nextLine());
        StringBuilder output=new StringBuilder();
        int remains=0;
        if(smallNumber==0){
            System.out.println(0);
        }else if(smallNumber==1){
            System.out.println(bigNumber);
        }else {
            for (int i = bigNumber.length() - 1; i >= 0; i--) {
                int result;
                int digit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
                if (remains == 0) {
                    result = smallNumber * digit;

                    if (result >=10) {
                        String[] split = String.valueOf(result).split("");
                        remains = Integer.parseInt(split[0]);
                        output.append(split[1]);
                    } else output.append(result);
                } else {
                    result = smallNumber * digit + remains;
                    remains = 0;

                    if (result >= 10) {
                        String[] split = String.valueOf(result).split("");
                        remains = Integer.parseInt(split[0]);
                        output.append(split[1]);
                    } else output.append(result);
                }
            }
            if (remains > 0)
                output.append(remains);

            System.out.println(output.reverse());
        }

    }
}