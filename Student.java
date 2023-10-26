import java.util.*;

public class Student {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


     public Student(String name,String lastName,double grade){
        this.firstName=name;
        this.lastName=lastName;
        this.grade=grade;

     }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    private String firstName;

    private String lastName;


    private double grade;




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Student> students=new ArrayList<>();

        int amount=Integer.parseInt(sc.nextLine());

        for (int i = 1; i <=amount; i++) {
            String [] info=sc.nextLine().split(" ");
            Student student=new Student(info[0],info[1],Double.parseDouble(info[2]));

            students.add(student);
        }

         students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student:students) {
            System.out.printf("%s %s: %.2f\n",student.getFirstName(),student.getLastName(),student.getGrade());
        }


    }

}
