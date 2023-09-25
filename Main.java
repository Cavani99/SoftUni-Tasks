import java.util.Scanner;

public class Main {
    public static void BalancedBrackets() {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        String input;
        boolean isUnbalanced=false;
        int openBrackets=0;
        int closeBrackets=0;
        for(int i=1;i<=lines;i++){
            input= sc.nextLine();

            if(input.equals("(")){
                 openBrackets++;
            }
            else if (input.equals(")")) {
                closeBrackets++;
                if(closeBrackets>openBrackets)
                 isUnbalanced=true;
            }
        }

        if(!isUnbalanced && openBrackets==closeBrackets)
            System.out.println("BALANCED");
        else
            System.out.println("UNBALANCED");


    }


    public static void main(String[] args) {
        BalancedBrackets();
    }
}