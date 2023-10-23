import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    private String type;
    private String name;

    private String time;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int amount=Integer.parseInt(sc.nextLine());

        List <Song> songs=new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            String [] insertSongs=sc.nextLine().split("_");

            String type=insertSongs[0];
            String name=insertSongs[1];
            String time=insertSongs[2];

            Song song=new Song();

            song.setType(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }

        String typeFilter=sc.nextLine();

        if(typeFilter.equals("all")){
            for (Song song:songs) {
                System.out.println(song.getName());
            }
        }else{
            for (Song song:songs) {
                if(song.getType().equals(typeFilter))
                    System.out.println(song.getName());
            }
        }
        
    }
}
