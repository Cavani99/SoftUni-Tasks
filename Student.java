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

    private static boolean IsStudentExisting(List <Student> students,String firstName,String lastName){

        for(Student student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List <Student> students,String firstName,String lastName){
        Student existingStudent=null;

        for(Student student : students){
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
               existingStudent=student;
            }
        }

        return existingStudent;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Student> students=new ArrayList<>();

        String [] operation=sc.nextLine().split(" ");

        while (!operation[0].equals("end")){

            String firstName=operation[0];
            String lastName=operation[1];
            int age= Integer.parseInt(operation[2]);
            String homeTown=operation[3];

            if(IsStudentExisting(students,firstName,lastName)){
                Student student=getStudent(students,firstName,lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);

            }else {
                Student student=new Student();

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);

                students.add(student);
            }

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
