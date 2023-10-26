import java.util.*;

public class Student {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public Student(String name,String id,int age){
        this.firstName=name;
        this.id=id;
        this.age=age;

    }

    private String firstName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String id;

    private int age;




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Student> students=new ArrayList<>();

        String [] input=sc.nextLine().split(" ");



        while (!input[0].equals("End")){
            Student student=new Student(input[0],input[1],Integer.parseInt(input[2]));

            students.add(student);

            input=sc.nextLine().split(" ");
        }

        students.sort(Comparator.comparing(Student::getAge));

        for (Student student:students) {
            System.out.printf("%s with ID: %s is %d years old.\n",student.getFirstName(),student.getId(),student.getAge());
        }


    }

}
