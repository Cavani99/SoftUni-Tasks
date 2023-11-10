import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void putContest( LinkedHashMap<String, ArrayList<String>> contests,String company,String person,int points,
    LinkedHashMap<String, Integer> people){

        String result=points+"+"+person;
        int diff;

      if(!contests.containsKey(company)){
          contests.computeIfAbsent(company,k ->  new ArrayList<>()).add(result);

          if(!people.containsKey(person))
              people.put(person,points);
          else{
              people.put(person,people.get(person)+points);
              }
      }else{
          List <String> list=contests.get(company);
          boolean userExists = false;
          for (int i = 0; i < list.size(); i++) {
              String []info=list.get(i).split("\\+");
              if(info[1].equals(person)){
                  if (Integer.parseInt(info[0]) < points) {
                      diff=points-Integer.parseInt(info[0]);
                      info[0] = String.valueOf(points);
                      String output = points + "+" + person;
                      list.set(i, output);
                      people.put(person,people.get(person)+diff);

                      userExists = true;
                      break;
                  }
                  userExists = true;
              }
          }

          if(!userExists){
              contests.computeIfAbsent(company ,k -> new ArrayList<>()).add(result);

              if(!people.containsKey(person))
                  people.put(person,points);
              else{
                  people.put(person,people.get(person)+points);
              }

          }
      }



    }


    public static void printContestants(LinkedHashMap<String, ArrayList<String>> contests,
                                        LinkedHashMap<String, Integer> people){

        AtomicInteger num = new AtomicInteger(1);

            for (Map.Entry<String, ArrayList<String>> entry : contests.entrySet()) {
                System.out.printf("%s: %d participants\n", entry.getKey(), entry.getValue().size());

                Map<String, Integer> map = new TreeMap<>();
                ArrayList<String> arrayList = entry.getValue();

                for (String s : arrayList) {
                    String[] info = s.split("\\+");
                    map.put(info[1], Integer.valueOf(info[0]));
                }

                num.set(1);
                map.entrySet().stream().sorted((e2, e1) -> {
                    int sort = Integer.compare(e1.getValue(), e2.getValue());
                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;

                }).forEach(element -> System.out.printf("%d. %s <::> %d\n", num.getAndIncrement(), element.getKey(), element.getValue()));

            }

        num.set(1);
        System.out.println("Individual standings: ");
        people.entrySet().stream().sorted((e2, e1) -> {
            int sort = Integer.compare(e1.getValue(), e2.getValue());
            if (sort == 0) {
                sort = e2.getKey().compareTo(e1.getKey());
            }
            return sort;

        }).forEach(element -> System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), element.getKey(), element.getValue()));


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> contests = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        String[] command = sc.nextLine().split(" -> ");
        while (!command[0].equals("no more time")) {
            int points = Integer.parseInt(command[2]);

            putContest(contests,command[1],command[0],points,people);


            command = sc.nextLine().split(" -> ");
        }

        printContestants(contests,people);


    }
}