import java.util.Scanner;

public class Main {
    public static void order(String product,int quantity) {
       switch (product){
           case "coffee":
               System.out.printf("%.2f",quantity*1.50);
               break;
           case "water":
               System.out.printf("%.2f",quantity*1.00);
               break;
           case "coke":
               System.out.printf("%.2f",quantity*1.40);
               break;
           case "snacks":
               System.out.printf("%.2f",quantity*2.00);
               break;
       }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product=sc.nextLine();
        int quantity=Integer.parseInt(sc.nextLine());

        order(product,quantity);



    }
}