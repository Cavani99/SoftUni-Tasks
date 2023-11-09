import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text=sc.nextLine();
        int explosionPower;
        StringBuilder out=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {

            if(text.charAt(i)=='>'){
                out.append(text.charAt(i));
                i++;
                explosionPower=Integer.parseInt(String.valueOf(text.charAt(i)));
                while(explosionPower>0 && i<text.length()) {
                    if(text.charAt(i)=='>'){
                        out.append(text.charAt(i));
                        i++;
                        explosionPower+=Integer.parseInt(String.valueOf(text.charAt(i)));
                    }else {
                        i++;
                        explosionPower--;
                    }
                }
                i--;
            }else {
                out.append(text.charAt(i));
            }


        }

        System.out.println(out);


    }
}