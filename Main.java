import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void getCommands() {
        Scanner sc = new Scanner(System.in);

        List<String> arr =
                Arrays.stream(sc.nextLine().split(" "))
                        .collect(Collectors.toList());

        String [] command=sc.nextLine().split(" ");
        while(!command[0].equals("3:1")){
            if(command[0].equals("merge")){
                int startIndex= Integer.parseInt(command[1]);
                int endIndex= Integer.parseInt(command[2]);
                merge(arr,startIndex,endIndex);

            }else if(command[0].equals("divide")){
                int index= Integer.parseInt(command[1]);
                int parts= Integer.parseInt(command[2]);
                divide(arr,index,parts);
            }

            command=sc.nextLine().split(" ");
        }

        printElements(arr);
    }

    public static void merge(List <String> list,int startIndex,int endIndex){

       if(endIndex>=list.size()){
            endIndex= list.size()-1;
        }

       if(startIndex<0)
             startIndex=0;

        if(startIndex<endIndex){
            String value="";
            for(int i=startIndex;i<=endIndex;i++){
                value+=list.get(i);
            }

            list.subList(startIndex, endIndex + 1).clear();
            list.add(startIndex,value);
        }
    }

    public static void divide(List <String> list,int index,int parts) {
         String chars=list.get(index);
         int size=chars.length();

         if(size % parts ==0){
             String []sub=new String[parts];
             int ind=index;
             int badge=0;
             list.remove(index);

             for (int i=0;i<sub.length;i++){
                 String value="";
                 for (int j = badge; j < size/parts+badge;j++) {

                     value+=chars.charAt(j) ;
                 }
                 badge+=size/parts;
                 list.add(ind,value);
                 ind++;
             }
         }else{
             String []sub=new String[parts];
             int badge=0;
             int ind=index;
             list.remove(index);
             String value="";

             for (int i=0;i<sub.length-1;i++){
                 for (int j = badge; j < size/parts+badge;j++) {

                     value+=chars.charAt(j) ;
                 }
                 badge+=size/parts;
                 list.add(ind,value);
                 ind++;
                 value="";
             }

             for (int i = badge; i < chars.length(); i++) {
                 value+=chars.charAt(i);
             }
             list.add(ind,value);
         }



    }

        public static void printElements(List <String> items){


        for (String item:items) {
            System.out.print(item + " ");
        }


    }


    public static void main(String[] args) {

        getCommands();


    }
}