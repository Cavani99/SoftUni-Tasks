import java.util.*;

public class Main {

    public static void putContest( LinkedHashMap<String, ArrayList<String>> dragons,String color,String name,
                                   String damage, String health, String armor){

        int dmg;
        int hp;
        int arm;

        if(damage.equals("null"))
            dmg=45;
        else dmg=Integer.parseInt(damage);

        if(health.equals("null"))
            hp=250;
        else hp=Integer.parseInt(health);

        if(armor.equals("null"))
            arm=10;
        else arm=Integer.parseInt(armor);

        String result=name+"|"+dmg+"|"+hp+"|"+arm;

        if(!dragons.containsKey(color)){
            dragons.computeIfAbsent(color,k ->  new ArrayList<>()).add(result);
        }else{
            List <String> list=dragons.get(color);
            boolean userExists = false;
            for (int i = 0; i < list.size(); i++) {
                String []info=list.get(i).split("\\|");
                if(info[0].equals(name)){
                    String output =name+"|"+dmg+"|"+hp+"|"+arm;
                    list.set(i, output);
                    userExists = true;
                    break;
                }
            }

            if(!userExists){
                dragons.computeIfAbsent(color ,k -> new ArrayList<>()).add(result);

            }
        }

    }


    public static void printContestants(LinkedHashMap<String, ArrayList<String>> dragons){


        for (Map.Entry<String, ArrayList<String>> entry : dragons.entrySet()){
            double avgDmg=0;
            double avgHp=0;
            double avgArm=0;
            int size=entry.getValue().size();
            ArrayList<String>list=entry.getValue();
            for (String string:list) {
                String [] getInfo=string.split("\\|");
                avgDmg+=Integer.parseInt(getInfo[1]);
                avgHp+=Integer.parseInt(getInfo[2]);
                avgArm+=Integer.parseInt(getInfo[3]);
            }

            System.out.printf("%s::(%.2f/%.2f/%.2f)\n",entry.getKey()
                    ,avgDmg/size,avgHp/size,avgArm/size);
            list.stream().sorted((e1,e2)->{
                String [] getInfo1=e1.split("\\|");
                String [] getInfo2=e2.split("\\|");

                return getInfo1[0].compareTo(getInfo2[0]);
            }).forEach(element ->{
                String [] info=element.split("\\|");

                System.out.printf("-%s -> damage: %s, health: %s, armor: %s\n"
                        ,info[0],info[1],info[2],info[3]);

            });


        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> dragons = new LinkedHashMap<>();

        int number=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            String[] command = sc.nextLine().split(" ");

            putContest(dragons,command[0],command[1],command[2],command[3],command[4]);

        }

        printContestants(dragons);

    }
}