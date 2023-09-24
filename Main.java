import java.util.Scanner;

public class Main {
    public static void DataTypeFinder() {
        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();
        while(!input.equals("END")) {


            if(input.matches("-?\\d+")){
                System.out.printf("%s is integer type\n", input);
            }else if(input.matches("-?\\d+[.]\\d+")){
                System.out.printf("%s is floating point type\n", input);
            }else if(input.length()==1){
                System.out.printf("%s is character type\n", input);
            }else if(input.equalsIgnoreCase("true")|| input.equalsIgnoreCase("false")){
                System.out.printf("%s is boolean type\n", input);
            }else
                System.out.printf("%s is string type\n", input);



            input = sc.nextLine();
        }




    }


    public static void main(String[] args) {
        DataTypeFinder();
    }
}