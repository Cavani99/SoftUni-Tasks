import java.util.*;

public class Main {

    public static void putContest( LinkedHashMap<String, ArrayList<String>> players,String player,String role,int points,
    LinkedHashMap<String, Integer> scores){

        String result=points+"+"+role;
        int diff;

      if(!players.containsKey(player)){
          players.computeIfAbsent(player,k ->  new ArrayList<>()).add(result);

          if(!scores.containsKey(player))
              scores.put(player,points);
          else{
              scores.put(player,scores.get(player)+points);
              }
      }else{
          List <String> list=players.get(player);
          boolean userExists = false;
          for (int i = 0; i < list.size(); i++) {
              String []info=list.get(i).split("\\+");
              if(info[1].equals(role)){
                  if (Integer.parseInt(info[0]) < points) {
                      diff=points-Integer.parseInt(info[0]);
                      info[0] = String.valueOf(points);
                      String output = points + "+" + role;
                      list.set(i, output);
                      scores.put(player,scores.get(player)+diff);

                      userExists = true;
                      break;
                  }
                  userExists = true;
              }
          }

          if(!userExists){
              players.computeIfAbsent(player ,k -> new ArrayList<>()).add(result);

              if(!scores.containsKey(player))
                  scores.put(player,points);
              else{
                  scores.put(player,scores.get(player)+points);
              }

          }
      }

    }
    public static void duel(LinkedHashMap<String, ArrayList<String>> players
            , LinkedHashMap<String, Integer> scores,String player1,String player2){

        if(players.containsKey(player1) && players.containsKey(player2)){
            List <String> list1= players.get(player1);
            List <String> list2= players.get(player2);

            for (String s : list1) {
                String[] info = s.split("\\+");
                for (String value : list2) {
                    String[] info2 = value.split("\\+");

                    if (info[1].equals(info2[1])) {
                        int player1Score = scores.get(player1);
                        int player2Score = scores.get(player2);

                        if (player1Score > player2Score) {
                            scores.remove(player2);
                            players.remove(player2);
                        } else if (player2Score > player1Score) {
                            scores.remove(player1);
                            players.remove(player1);
                        }
                    }
                }
            }

        }

    }

    public static void printContestants(LinkedHashMap<String, ArrayList<String>> players,
                                        LinkedHashMap<String, Integer> scores){


                Map<String, Integer> map = new TreeMap<>(scores);

                map.entrySet().stream().sorted((e2, e1) -> {
                    int sort = Integer.compare(e1.getValue(), e2.getValue());
                    if (sort == 0) {
                        sort = e2.getKey().compareTo(e1.getKey());
                    }
                    return sort;

                }).forEach(element ->{
                    System.out.printf("%s: %d skill\n",element.getKey(),element.getValue());

                    for (Map.Entry<String, ArrayList<String>> entry : players.entrySet()) {

                        if(element.getKey().equals(entry.getKey())){
                            Map<String, Integer> mapRoles = new TreeMap<>();
                            ArrayList <String> arrayList=entry.getValue();

                            for (String s:arrayList) {
                                String[] info = s.split("\\+");
                                mapRoles.put(info[1], Integer.valueOf(info[0]));
                            }

                            mapRoles.entrySet().stream().sorted((e2,e1)->{
                                int sort = Integer.compare(e1.getValue(), e2.getValue());
                                if (sort == 0) {
                                    sort = e2.getKey().compareTo(e1.getKey());
                                }
                                return sort;
                            }).forEach(role -> System.out.printf("- %s <::> %d\n",role.getKey(),role.getValue()));
                        }


                    }

                });

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> players = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        String[] command = sc.nextLine().split(" -> ");
        while (!command[0].equals("Season end")) {

            if(command.length>2) {
                int points = Integer.parseInt(command[2]);
                putContest(players, command[0], command[1], points, scores);
            }else{
                 String [] versus=command[0].split(" vs ");
                 duel(players,scores,versus[0],versus[1]);
            }

            command = sc.nextLine().split(" -> ");
        }

        printContestants(players,scores);


    }
}