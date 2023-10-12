import java.util.*;

public class Main {


    public static void commandsOperations(){
        Scanner sc = new Scanner(System.in);

        int amountOfCommands=Integer.parseInt(sc.nextLine());
        List <String> partyList=new ArrayList<>();


        for(int i=0;i<amountOfCommands;i++){
            String [] partyOperation=sc.nextLine().split(" ");

            if(partyOperation[2].equals("going!")){
                String name=partyOperation[0];
                if(ifExists(partyList,name))
                    System.out.printf("%s is already in the list!\n",name);
                else
                    partyList.add(name);
            }else{
                String name=partyOperation[0];
                if(ifExists(partyList,name)){
                    deleteElement(partyList,name);
                }else{

                    System.out.printf("%s is not in the list!\n",name);
                }

            }

        }

        printElements(partyList);
    }

    public static boolean ifExists(List <String> elements,String value){

        for (String element : elements) {
            if (element.equals(value))
                return true;
        }

       return false;
    }

    public static void deleteElement(List <String> elements,String value){

        for(int i=0;i< elements.size();i++){
            if(elements.get(i).equals(value)){
                elements.remove(i);
                break;
            }
        }

    }


    public static void printElements(List <String> items){

            for (String item:items) {
                System.out.println(item);
            }


    }




    public static void main(String[] args) {

        commandsOperations();


    }
}