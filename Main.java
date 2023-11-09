import java.util.*;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < people; i++) {
            String info = sc.nextLine();
            StringBuilder name=new StringBuilder();
            StringBuilder age=new StringBuilder();

            for (int j = 0; j < info.length(); j++) {
                if(info.charAt(j)=='@'){
                    j++;
                    while (info.charAt(j)!='|'){
                        name.append(info.charAt(j));
                        j++;
                    }
                }else if(info.charAt(j)=='#'){
                    j++;
                    while (info.charAt(j)!='*'){
                        age.append(info.charAt(j));
                        j++;
                    }
                }
            }
            System.out.printf("%s is %s years old.\n",name,age);

        }

    }
}