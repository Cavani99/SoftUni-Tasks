import java.util.*;

public class Main {


    public static void ListOperations(){
        Scanner sc = new Scanner(System.in);

        int amount=Integer.parseInt(sc.nextLine());
        List<String> products=new ArrayList<>();

        for(int i=0;i<amount;i++){
            String newProduct=sc.nextLine();
            products.add(newProduct);
        }

        Collections.sort(products);


        printElements(products);

    }



    public static void printElements(List <String> items){
        int index=1;
        for(String item: items){
            System.out.printf("%d.%s\n",index,item);
            index++;
        }


    }




    public static void main(String[] args) {

        ListOperations();


    }
}