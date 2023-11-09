import java.util.*;

public class Main {


     public static void printInfo(StringBuilder info){
         StringBuilder material=new StringBuilder();
         StringBuilder coordinates=new StringBuilder();
         for (int i = 0; i < info.length(); i++) {

             if(info.charAt(i)=='&'){
                 i++;
                while(info.charAt(i)!='&'){
                    material.append(info.charAt(i));
                    i++;
                }
             }else if(info.charAt(i)=='<'){
                 i++;
                 while(info.charAt(i)!='>'){
                     coordinates.append(info.charAt(i));
                     i++;
                 }
             }
         }
         System.out.printf("Found %s at %s\n",material,coordinates);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []key= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String text=sc.nextLine();
        while(!text.equals("find")){
            StringBuilder out=new StringBuilder();
            int keyIndex=0;

            for (int i = 0; i < text.length(); i++) {
                char ch=text.charAt(i);
                if (keyIndex >= key.length) {
                    keyIndex = 0;
                }

                ch-=key[keyIndex];
                out.append(ch);
                keyIndex++;
            }

            printInfo(out);

            text=sc.nextLine();
        }



    }
}