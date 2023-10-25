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



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     public Student(String name,int age){
        this.firstName=name;
        this.age=age;

     }

    private String firstName;

    private int age;




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Student> students=new ArrayList<>();

        int amount=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= amount; i++) {
            String [] info=sc.nextLine().split(" ");

            Student student=new Student(info[0],Integer.parseInt(info[1]));

            students.add(student);

        }

        for (Student student:students) {
            if(student.getAge()>30)
                System.out.printf("%s - %d\n",student.getFirstName(),student.getAge());
        }


    }

}
