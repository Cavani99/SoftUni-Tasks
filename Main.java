import java.util.Scanner;

public class Main {


    public static void dataTypeOperation(int num) {

        System.out.println( num*2);
    }

    public static void dataTypeOperation(double num) {

        System.out.printf("%.2f",num*1.5);

    }

    public static void dataTypeOperation(String input) {

        System.out.println("$"+input+"$");
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataType=sc.nextLine();

        switch (dataType){
            case "int":
                int num=Integer.parseInt(sc.nextLine());
                dataTypeOperation(num);
                break;
            case "real":
                double floatNumber=Double.parseDouble(sc.nextLine());
                dataTypeOperation(floatNumber);
                break;
            case "string":
                String input= sc.nextLine();
                dataTypeOperation(input);
                break;
        }



    }
}