import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,String>registered=new LinkedHashMap<>();
        int cars=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=cars; i++) {
            String []command=sc.nextLine().split(" ");

            if(command[0].equals("register")) {
                if (!registered.containsKey(command[1])) {
                    registered.put(command[1], command[2]);
                    System.out.printf("%s registered %s successfully\n", command[1], command[2]);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s\n",registered.get(command[1]));
                }
            }else{
                if (!registered.containsKey(command[1])) {
                    System.out.printf("ERROR: user %s not found\n",command[1]);
                }else {
                    registered.remove(command[1]);
                    System.out.printf("%s unregistered successfully\n",command[1]);
                }
            }

        }



        for (Map.Entry<String,String>entry: registered.entrySet()){

            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());

        }

    }
}