import java.util.Scanner;

public class Main {
    public static int getMax(int num1,int num2) {
        return Math.max(num1, num2);

    }
    public static char getMax(char char1,char char2) {
        if(char1>=char2)
            return char1;
        else return char2;

    }
    public static String getMax(String input1,String input2) {
        if(input1.compareTo(input2)>=0)
            return input1;
        else return input2;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type=sc.nextLine();
        if(type.equals("int")){
            int num1=Integer.parseInt(sc.nextLine());
            int num2=Integer.parseInt(sc.nextLine());
            System.out.println(getMax(num1,num2));
        }else if(type.equals("char")){
            char char1=sc.nextLine().charAt(0);
            char char2=sc.nextLine().charAt(0);
            System.out.println(getMax(char1,char2));
        }else if(type.equals("string")){
            String input1=sc.nextLine();
            String input2=sc.nextLine();
            System.out.println(getMax(input1,input2));
        }


    }
}