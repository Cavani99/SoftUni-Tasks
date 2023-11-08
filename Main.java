import java.util.*;

public class Main {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] text=sc.nextLine().split("\\\\");
        String [] file=text[text.length-1].split("\\.");
        System.out.printf("File name: %s \n",file[0]);
        System.out.printf("File extension: %s ",file[1]);

    }
}