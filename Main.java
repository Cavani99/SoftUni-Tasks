import java.util.*;

public class Main {


    public static void RandomizeWords() {
        Scanner sc = new Scanner(System.in);

        String [] input=sc.nextLine().split(" ");
        Random random=new Random();

        for (int i = 0; i < input.length; i++) {
            int index= random.nextInt(input.length);
            String value=input[i];
            input[i]=input[index];
            input[index]=value;
        }

        System.out.println(String.join(System.lineSeparator(),input));


    }


    public static void main(String[] args) {

        RandomizeWords();


    }
}