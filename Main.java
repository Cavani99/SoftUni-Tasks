import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();
        while(!input.equals("end")){
            StringBuilder output= new StringBuilder();
            for (int i = input.length()-1; i >=0; i--) {
                output.append(input.charAt(i));
            }
            System.out.printf("%s = %s\n",input,output);

            input=sc.nextLine();
        }

    }
}