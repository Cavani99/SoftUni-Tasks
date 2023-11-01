import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,String>courses=new LinkedHashMap<>();
        String []command=sc.nextLine().split(" : ");
        while(!command[0].equals("end")) {
            if(!courses.containsKey(command[0])){
                courses.put(command[0],command[1]);
            }else{
                courses.put(command[0], courses.get(command[0])+"|"+command[1]);
            }

            command=sc.nextLine().split(" : ");
        }


        for (Map.Entry<String,String>entry: courses.entrySet()){
            String [] students=entry.getValue().split("\\|");
            int number=students.length;

            System.out.printf("%s: %d\n",entry.getKey(),number);
            for (String stud:students) {
                System.out.printf("-- %s\n",stud);
            }

        }

    }
}