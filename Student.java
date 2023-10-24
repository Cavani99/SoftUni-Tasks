import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Student> students=new ArrayList<>();

        String [] operation=sc.nextLine().split(" ");

        while (!operation[0].equals("end")){
            Student student=new Student();

            student.setFirstName(operation[0]);
            student.setLastName(operation[1]);
            student.setAge(Integer.parseInt(operation[2]));
            student.setHomeTown(operation[3]);

            students.add(student);

            operation=sc.nextLine().split(" ");
        }

        String town=sc.nextLine();

        for (Student student:students) {
            if(student.getHomeTown().equals(town)){
                System.out.printf("%s %s is %d years old\n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }

    }

}
