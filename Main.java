import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static int sum=0;

    public static void getCommands() {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr =
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        while(!arr.isEmpty()){
            //Pokemon to catch
            int index=Integer.parseInt(sc.nextLine());

            changeArray(arr,index);

        }

        System.out.println(sum);
    }

    public static void changeArray(List <Integer> arr,int index){

        if(index> arr.size()-1){
            int value=arr.get(arr.size()-1);
            sum+=value;
            arr.set(arr.size()-1, arr.get(0));

            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)<=value){
                    arr.set(i,value+arr.get(i));
                }else if(arr.get(i)>value){
                    arr.set(i,arr.get(i)-value);
                }
            }

        }else if(index<0){
            int value=arr.get(0);
            sum+=value;
            arr.set(0, arr.get(arr.size()-1));
            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)<=value){
                    arr.set(i,value+arr.get(i));
                }else if(arr.get(i)>value){
                    arr.set(i,arr.get(i)-value);
                }
            }

        }else{
            int value=arr.get(index);
            sum+=value;
            arr.remove(index);

            for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i)<=value){
                    arr.set(i,value+arr.get(i));
                }else if(arr.get(i)>value){
                    arr.set(i,arr.get(i)-value);
                }
            }

        }


    }



    public static void main(String[] args) {

        getCommands();


    }
}