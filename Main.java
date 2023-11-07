import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,Integer>languages=new LinkedHashMap<>();
        LinkedHashMap <String,Integer>users=new LinkedHashMap<>();
        String []command=sc.nextLine().split("-");
        while(!command[0].equals("exam finished")){
            String user=command[0];
            if(command[1].equals("banned")){
                users.remove(user);
            }else{
                String language=command[1];
                int points= Integer.parseInt(command[2]);

                //for username
                if(!users.containsKey(user)){
                    users.put(user,points);
                }else if(users.get(user)<points){
                    users.put(user,points);
                }

                //for lang
                if(!languages.containsKey(language)){
                    languages.put(language,1);
                }else{
                    languages.put(language, languages.get(language)+1);
                }

            }

            command=sc.nextLine().split("-");
        }

        //print users
        System.out.println("Results:");
        for (Map.Entry<String,Integer>entry: users.entrySet()) {
            System.out.printf("%s | %d \n",entry.getKey(),entry.getValue());

        }
        //print submissions
        System.out.println("Submissions:");
        for (Map.Entry<String,Integer>entry: languages.entrySet()) {
            System.out.printf("%s - %d \n",entry.getKey(),entry.getValue());

        }
    }
}