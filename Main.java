import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input=sc.nextLine().split(" ");
        StringBuilder output=new StringBuilder();
        for (String result:input) {
            output.append(result.repeat(result.length()));
        }
        System.out.println(output);
    }
}