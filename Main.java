import java.util.*;

public class Main {

    public static void putContest( LinkedHashMap<String, ArrayList<String>> players,String name,String hat,int points,
                                   LinkedHashMap<String, Integer> scores){

        String result=points+"+"+name;
        int diff;

        if(!players.containsKey(hat)){
            players.computeIfAbsent(hat,k ->  new ArrayList<>()).add(result);

            if(!scores.containsKey(name+":"+hat))
                scores.put(name+":"+hat,points);
            else if(points> scores.get(name+":"+hat)){
                scores.put(name+":"+hat,scores.get(name+":"+hat)+points);
            }
        }else{
            List <String> list=players.get(hat);
            boolean userExists = false;
            for (int i = 0; i < list.size(); i++) {
                String []info=list.get(i).split("\\+");
                if(info[1].equals(name)){
                    if (Integer.parseInt(info[0]) < points) {
                        diff=points-Integer.parseInt(info[0]);
                        info[0] = String.valueOf(points);
                        String output = points + "+" + name;
                        list.set(i, output);
                        scores.put(name+":"+hat,scores.get(name+":"+hat)+diff);

                        userExists = true;
                        break;
                    }
                    userExists = true;
                }
            }

            if(!userExists){
                players.computeIfAbsent(hat ,k -> new ArrayList<>()).add(result);

                if(!scores.containsKey(name+":"+hat))
                    scores.put(name+":"+hat,points);
                else if(points> scores.get(name+":"+hat)){
                    scores.put(name+":"+hat,points);
                }

            }
        }

    }


    public static void printContestants(LinkedHashMap<String, ArrayList<String>> players,
                                        LinkedHashMap<String, Integer> scores,  List <String> score){


        Map<String, Integer> map = new TreeMap<>(scores);
        LinkedHashMap <String,Integer> colorCount=new LinkedHashMap<>();
        for (Map.Entry<String, ArrayList<String>> entry : players.entrySet()){
            String colors=entry.getKey();
            int count=entry.getValue().size();
            if(!colorCount.containsKey(colors)){
                colorCount.put(colors,count);
            }
        }

        map.entrySet().stream().sorted((e1, e2) -> {

            int sort = -Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                String [] info1=e1.getKey().split(":");
                String [] info2=e2.getKey().split(":");
                int color1size=0;
                int color2size=0;

                if(colorCount.containsKey(info1[1]))
                    color1size=colorCount.get(info1[1]);
                if(colorCount.containsKey(info2[1]))
                    color2size=colorCount.get(info2[1]);


                sort=-Integer.compare(color1size,color2size);
                if(sort==0){

                    int ind1=score.indexOf(e1.getKey());
                    int ind2=score.indexOf(e2.getKey());sort=Integer.compare(ind1,ind2);

                }



            }

            return sort;

        }).forEach(element ->{


            String []info=element.getKey().split(":");
            System.out.printf("(%s) %s <-> %d\n",info[1],info[0],element.getValue());


        });

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> dwarves = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();
        List <String> score=new ArrayList<>();

        String[] command = sc.nextLine().split(" <:> ");
        while (!command[0].equals("Once upon a time")) {

            int points = Integer.parseInt(command[2]);
            putContest(dwarves, command[0], command[1], points, scores);

            if(!score.contains(command[0]+":"+command[1])){
                score.add(command[0]+":"+command[1]);
            }


            command = sc.nextLine().split(" <:> ");
        }

        printContestants(dwarves,scores,score);


    }
}