import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,String>force=new LinkedHashMap<>();
        String ac=sc.nextLine();

        List <String> users=new ArrayList<>();
        while(!ac.equals("Lumpawaroo")){

            if(ac.contains("|")){
                String []command=ac.split(" \\| ");
                String side=command[0];
                String user=command[1];


                if(!users.contains(user) && !force.containsKey(side)){
                    force.put(side,user);
                    users.add(user);
                }else if(!users.contains(user)){
                    if(force.get(side).equals(""))
                        force.put(side,user);
                    else
                        force.put(side, force.get(side)+"|"+user);

                    users.add(user);
                }

            } else if (ac.contains("->")) {
                String []command=ac.split(" -> ");
                String side=command[1];
                String user=command[0];


                if(!users.contains(user)) {
                    if(!force.containsKey(side))
                        force.put(side,user);
                    else{
                        if(force.get(side).equals(""))
                            force.put(side,user);
                        else
                            force.put(side, force.get(side)+"|"+user);
                    }

                    users.add(user);
                }else{
                    for (Map.Entry<String,String>entry: force.entrySet()){
                        if(entry.getValue().contains(user)){
                            String newVal= Arrays.toString(entry.getValue().split("\\|?"+user))
                                    .replace("[","")
                                    .replace("]","");

                            entry.setValue(newVal);
                            break;
                        }
                    }

                    if(!force.containsKey(side)){
                        force.put(side,user);
                    }else{
                        if(force.get(side).equals(""))
                            force.put(side,user);
                        else
                            force.put(side, force.get(side)+"|"+user);
                    }
                }


                System.out.printf("%s joins the %s side!\n",user,side);

            }


            ac=sc.nextLine();
        }



        for (Map.Entry<String,String>entry: force.entrySet()) {
            if(entry.getValue().equals(""))
                entry.setValue("|");

            String[] forceUsers = entry.getValue().split("\\|+");


            if (forceUsers.length >= 1) {
                System.out.printf("Side: %s, Members: %d\n", entry.getKey(), forceUsers.length);

                for (String user : forceUsers) {
                    System.out.printf("! %s\n", user);
                }
            }

        }
    }
}