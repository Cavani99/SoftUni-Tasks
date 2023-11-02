import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,String>company=new LinkedHashMap<>();
        String []command=sc.nextLine().split(" -> ");
        while(!command[0].equals("End")){
            String name=command[0];
            String id= command[1];

            if(!company.containsKey(name)){
                company.put(name,id);
            }else{
                String []values=company.get(name).split(" ");
                boolean present=false;
                for (int i = 0; i < values.length; i++) {
                    if (values[i].equals(id)){
                        present=true;
                        break;
                    }
                }

                if(!present){
                    company.put(name, company.get(name)+" "+id);
                }
            }


            command=sc.nextLine().split(" -> ");
        }





        for (Map.Entry<String,String>entry: company.entrySet()){
            String [] ids= entry.getValue().split(" ");

            System.out.printf("%s\n",entry.getKey());
            for (int i = 0; i < ids.length; i++) {
                System.out.printf("-- %s\n",ids[i]);
            }

        }

    }
}