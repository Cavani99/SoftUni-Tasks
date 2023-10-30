import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //make teams
        int number=Integer.parseInt(sc.nextLine());
        List <Team> teams=new ArrayList<>();
        List <String> people=new ArrayList<>();
        for (int i = 1; i <= number ; i++) {
            String []info=sc.nextLine().split("-");

            boolean Exists=false;
            for (Team team:teams) {
                if(team.getName().equals(info[1])){
                    System.out.printf("Team %s was already created!\n",info[1]);
                    Exists=true;
                    break;
                }else if(team.getCreator().equals(info[0])){
                    System.out.printf("%s cannot create another team!\n",info[0]);
                    Exists=true;
                    break;
                }
            }

            if(Exists)
                continue;

            Team team=new Team(info[0],info[1]);
            System.out.printf("Team %s has been created by %s!\n",team.getName(),team.getCreator());

            people.add(team.getCreator());
            teams.add(team);
        }

        //add members
        String []command=sc.nextLine().split("->");
        while(!command[0].equals("end of assignment")){

            boolean teamExists=false;
            boolean personExists=false;
            int index=0;
            for (Team team:teams) {
                if (team.getName().equals(command[1])) {
                    teamExists = true;
                    index= teams.indexOf(team);
                    break;
                }
            }

            for (String person:people) {
                 if(person.equals(command[0])){
                     personExists=true;
                     break;
                 }
            }


            if(teamExists && !personExists){
                teams.get(index).addMember(command[0]);
                people.add(command[0]);
            }else{
                if(!teamExists){
                    System.out.printf("Team %s does not exist!\n",command[1]);
                }else {
                    System.out.printf("Member %s cannot join team %s!\n",command[0],command[1]);
                }
            }

            command=sc.nextLine().split("->");
        }

        //print teams
        teams.sort(Comparator.comparing(Team::getSize).reversed().thenComparing(Team::getName));
        List <String> removed=new ArrayList<>();
        for (Team team:teams) {
            if(team.getSize()<1){
                removed.add(team.getName());
            }
        }

        teams.removeIf(team -> team.getSize() < 1);
        for (Team team:teams) {
            System.out.printf("%s\n",team.getName());
            System.out.printf("- %s\n",team.getCreator());

            Collections.sort(team.getMembers());
            for (String person:team.getMembers()) {
                System.out.printf("-- %s\n",person);
            }
        }

        System.out.println("Teams to disband:");
        Collections.sort(removed);
        for (String team:removed) {
            System.out.println(team);
        }

    }
}