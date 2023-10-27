import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Employee {

    private String name;

    private double salary;
    private String position;
    private String department;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Employee(String name,double salary,String position,String department){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int number=Integer.parseInt(sc.nextLine());
        List<Employee> workers=new ArrayList<>();

        //add employees
        for (int i = 1; i <= number; i++) {
            String [] worker=sc.nextLine().split(" ");
            Employee employee=new Employee(worker[0],Double.parseDouble(worker[1]),worker[2],worker[3]);

            employee.setEmail("n/a");
            employee.setAge(-1);
            for (int j = 4; j < worker.length; j++) {
                if(worker[j].length()<4){
                    employee.setAge(Integer.parseInt(worker[j]));
                }else{
                    employee.setEmail(worker[j]);
                }
            }
            workers.add(employee);
        }

        //look for the best Salary
        String bestDepart="";
        double bestAverageSalary=0;
        List <String> pastDep=new ArrayList<>();
        for (int i = 0; i < workers.size(); i++) {
            String department= workers.get(i).department;

            if(pastDep.contains(department)){
               continue;
            }else
                pastDep.add(department);

            double totalSalary=workers.get(i).salary;
            int people=1;
            for (int j = i+1; j < workers.size(); j++) {
                if(workers.get(j).department.equals(department)){
                    totalSalary+=workers.get(j).salary;
                    people++;
                }
            }
            if(totalSalary/people>bestAverageSalary && !bestDepart.equals(department)){
                bestAverageSalary=totalSalary/people;
                bestDepart=department;
            }
        }

        //print workers from best Department
        workers.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s\n",bestDepart);
        for (Employee employee:workers) {
            if(employee.getDepartment().equals(bestDepart)){
                System.out.printf("%s %.2f %s %d\n"
                        ,employee.getName(),employee.getSalary(),employee.getEmail(),employee.getAge());
            }
        }

    }

}
