import java.util.Scanner;

public class Main {
    public static void Elevator() {
        Scanner sc = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(sc.nextLine());
        int capacity= Integer.parseInt(sc.nextLine());


        if(capacity>=numberOfPeople){
            System.out.println(1);
        }else if(numberOfPeople % capacity == 0){
            int fullCourses= numberOfPeople/capacity;
            System.out.println(fullCourses);
        }else{
            int fullCourses= numberOfPeople/capacity;
            System.out.println(fullCourses+1);
        }


    }


    public static void main(String[] args) {
        Elevator();
    }
}