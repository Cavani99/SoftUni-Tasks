import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void LadyBugs() {
        Scanner sc = new Scanner(System.in);

        int fields=Integer.parseInt(sc.nextLine());
        int [] initialBugs= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input;
        int []arr=new int[fields];

        for (int index : initialBugs) {
            if(index<arr.length && index>=0)
                arr[index] = 1;
        }

        while(!(input=sc.nextLine()).equals("end")){
            String [] inputArr=input.split(" ");
            int index= Integer.parseInt(inputArr[0]);
            int flyLength=Integer.parseInt(inputArr[2]);

            if(index<0 || index>=arr.length || arr[index]==0){
                continue;
            }
            arr[index]=0;
            if(inputArr[1].equals("right")){
                int direction=index+flyLength;

                while(direction<arr.length && direction>=0){
                    if(arr[direction]==0){
                        arr[direction]=1;
                        break;
                    }else{
                        direction+=flyLength;
                    }

                }

            }
            else if(inputArr[1].equals("left")){
                int direction=index-flyLength;

                while(direction<arr.length && direction>=0){
                    if(arr[direction]==0){
                        arr[direction]=1;
                        break;
                    }else{
                        direction-=flyLength;
                    }

                }


            }

        }

        for (int index:arr) {
            System.out.print(index+" ");
        }



    }



    public static void main(String[] args) {
        LadyBugs();
    }
}