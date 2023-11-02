import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String,Double>students=new LinkedHashMap<>();
        int number=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=number ; i++) {
            String name=sc.nextLine();
            double grade=Double.parseDouble(sc.nextLine());

            if(!students.containsKey(name)){
                students.put(name,grade);
            }else{
                students.put(name, (students.get(name)+grade)/2);
            }


        }


        for (Map.Entry<String,Double>entry: students.entrySet()){

            if(entry.getValue()>=4.50)
                System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue());

        }

    }
}