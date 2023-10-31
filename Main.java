import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words= Arrays.stream(sc.nextLine().split(" "))
                .filter(w ->w.length() % 2 == 0)
                .toArray(String[]::new);
        for (String el:words) {
            System.out.println(el);
        }


    }
}