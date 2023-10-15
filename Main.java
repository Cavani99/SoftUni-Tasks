import java.util.*;
import java.util.stream.Collectors;

public class Main {



    public static void getText() {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

       List <String> text= Arrays.stream(sc.nextLine().split(""))
               .collect(Collectors.toList());

        String output="";

        for (int i = 0; i < numbers.size(); i++) {
            int sum=sumOfDigits(numbers.get(i));

            if(sum<text.size()){
                output+=text.get(sum);
                text.remove(sum);
            }else{
                int diff=sum-text.size();
                while(diff>=text.size()){
                    diff-=sum-text.size();
                }
                output+=text.get(diff);
                text.remove(diff);

            }

        }


        System.out.println(output);
    }


    public static int sumOfDigits(int number){
        String value=String.valueOf(number);
        int sum=0;

        for (int i = 0; i < value.length(); i++) {
            sum+= Integer.parseInt(String.valueOf(value.charAt(i)));
        }

        return sum;
    }



    public static void main(String[] args) {

        getText();


    }
}