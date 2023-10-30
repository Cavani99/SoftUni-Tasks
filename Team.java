import java.util.ArrayList;
import java.util.List;

public class Team {

    public Team(String creator, String name) {
        this.creator = creator;
        this.name = name;

    }

    public String getCreator() {
        return creator;
    }

    public String getName() {
        return name;
    }


    private String creator;
    private String name;
    private int size=0;

    public List<String> getMembers() {
        return members;
    }

    private List<String> members=new ArrayList<>();

    public void addMember(String name){

        members.add(name);
        size++;

    }

    public int getSize(){

        return size;
    }


}
