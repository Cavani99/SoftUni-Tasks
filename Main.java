import java.util.*;

public class Main {

    public static void putPeople( LinkedHashMap<String, String> contests,LinkedHashMap<String, ArrayList<String>> results, String contest ,String pass,
    String user ,int points, List<String> people ){
        if (contests.containsKey(contest) && contests.get(contest).equals(pass)) {
            String result = user + "-" + points;
            if (!people.contains(user))
                people.add(user);
            if (!results.containsKey(contest)) {
                results.computeIfAbsent(contest, k -> new ArrayList<>()).add(result);
            } else {
                List<String> list = results.get(contest);
                boolean userExists = false;
                for (int i = 0; i < list.size(); i++) {
                    String[] info = list.get(i).split("-");
                    if (info[0].equals(user)) {
                        if (Integer.parseInt(info[1]) < points) {
                            info[1] = String.valueOf(points);
                            String output = user + "-" + points;
                            list.set(i, output);
                        }
                        userExists = true;
                    }
                }
                if (!userExists) {
                    list.add(result);
                }
            }
        }
    }

    public static void countPoints(LinkedHashMap<String, ArrayList<String>> results,List<String> people){
        int total = 0;
        int bestPoints = 0;
        String bestUser = "";
        Collections.sort(people);
        //finding the candidate with most points
        for (String person : people) {
            for (Map.Entry<String, ArrayList<String>> entry : results.entrySet()) {
                List<String> arrayList = entry.getValue();
                for (String s : arrayList) {
                    String[] info = s.split("-");
                    if (info[0].equals(person)) {
                        total += Integer.parseInt(info[1]);
                        break;
                    }
                }
            }
            if (total > bestPoints) {
                bestPoints = total;
                bestUser = person;
            }
            total = 0;
        }

        System.out.printf("Best candidate is %s with total %d points.\n", bestUser, bestPoints);
    }

    public static void printContestants(LinkedHashMap<String, ArrayList<String>> results,List<String> people){
        System.out.println("Ranking: ");
        for (String person : people) {
            TreeMap<Integer, String> techs = new TreeMap<>();
            for (Map.Entry<String, ArrayList<String>> entry : results.entrySet()) {
                List<String> arrayList = entry.getValue();
                for (String s : arrayList) {
                    String[] info = s.split("-");
                    if (info[0].equals(person)) {
                        techs.put(Integer.valueOf(info[1]), entry.getKey());
                        break;
                    }
                }
            }
            System.out.printf("%s\n",person);
            Map <Integer,String> map=techs.descendingMap();
            for (Map.Entry<Integer, String> entry : map.entrySet()) {

                System.out.printf("#  %s -> %d\n",entry.getValue(),entry.getKey());
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, String> contests = new LinkedHashMap<>();
        LinkedHashMap<String, ArrayList<String>> results = new LinkedHashMap<>();
        List<String> people = new ArrayList<>();

        String[] command = sc.nextLine().split(":");
        while (!command[0].equals("end of contests")) {
            contests.put(command[0], command[1]);

            command = sc.nextLine().split(":");
        }
        command = sc.nextLine().split("=>");
        while (!command[0].equals("end of submissions")) {
            int points = Integer.parseInt(command[3]);

            putPeople(contests,results,command[0],command[1],command[2],points,people);

            command = sc.nextLine().split("=>");
        }

        //find the contestant with most points
         countPoints(results,people);
        //printing every candidate info separate
        printContestants(results,people);
    }
}