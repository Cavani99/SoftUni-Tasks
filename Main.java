import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void arrayManipulator(){
        Scanner sc = new Scanner(System.in);
        int [] arr= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String []command=sc.nextLine().split(" ");
        while(!command[0].equals("end")){
            switch (command[0]){
                case "exchange":
                    int index= Integer.parseInt(command[1]);
                    changeArray(arr,index);
                    break;
                case "max":
                    String type=command[1];
                    System.out.println(maxOddorEvenIndex(arr,type));
                    break;
                case "min":
                    type=command[1];
                    System.out.println(minOddorEvenIndex(arr,type));
                    break;
                case "first":
                    type=command[2];
                    int count= Integer.parseInt(command[1]);
                    firstEvenOrOdd(arr,type,count);
                    break;
                case "last":
                    type=command[2];
                    count= Integer.parseInt(command[1]);
                    lastEvenOrOdd(arr,type,count);
                    break;


            }
            command=sc.nextLine().split(" ");
        }

         System.out.println(Arrays.toString(arr));

    }

    public static void changeArray(int []arr,int index){
        if(index>=arr.length || index<0)
            System.out.println("Invalid index");
        else{
            int []subArr=new int[index+1];
            for(int i=0;i<=index;i++){
                subArr[i]=arr[i];
            }
            int len=0;
            for(int i=index+1;i<arr.length;i++){
               arr[len]=arr[i];
               len++;
            }

            int subArrIndexCopy=0;
            for(int i=len;i<arr.length;i++){
                arr[i]=subArr[subArrIndexCopy];
                subArrIndexCopy++;
            }

        }

    }
    public static String maxOddorEvenIndex(int []arr,String type) {
        int maxEven = 0;
        int maxOdd = 1;
        int maxIndex =-1;
        for (int i = 0; i < arr.length; i++) {
            if (type.equals("even")) {
                if (arr[i] % 2 == 0 && arr[i] >= maxEven) {
                    maxEven = arr[i];
                    maxIndex = i;
                }
            } else if (type.equals("odd")) {
                if (arr[i] % 2 != 0 && arr[i] >= maxOdd) {
                    maxOdd = arr[i];
                    maxIndex = i;
                }
            }
        }
        if(maxIndex<0)
            return "No matches";
        else
            return String.valueOf(maxIndex);
    }

    public static String minOddorEvenIndex(int []arr,String type) {
        int minEven = Integer.MAX_VALUE;
        int minOdd = Integer.MAX_VALUE;
        int minIndex =-1;
        for (int i = 0; i < arr.length; i++) {
            if (type.equals("even")) {
                if (arr[i] % 2 == 0 && arr[i] <= minEven) {
                    minEven = arr[i];
                    minIndex = i;
                }
            } else if (type.equals("odd")) {
                if (arr[i] % 2 != 0 && arr[i] <= minOdd) {
                    minOdd = arr[i];
                    minIndex = i;
                }
            }
        }
        if(minIndex<0)
            return "No matches";
        else
            return String.valueOf(minIndex);
    }

    public static void firstEvenOrOdd(int []arr,String type,int count) {
        if(count>arr.length || count<1)
            System.out.println( "Invalid count");
        else {
            int numberFound = 0;
            int[] newArr = new int[count];

            for (int i = 0; i < arr.length; i++) {
                if (type.equals("even")) {
                    if (arr[i] % 2 == 0 && numberFound < count) {
                        newArr[numberFound] = arr[i];
                        numberFound++;
                    }
                } else if (type.equals("odd")) {
                    if (arr[i] % 2 != 0 && numberFound < count) {
                        newArr[numberFound] = arr[i];
                        numberFound++;
                    }
                }
                if (numberFound == count)
                    break;
            }

            if (numberFound == 0)
                System.out.println("[]");
            else if (numberFound < count) {
                System.out.print("[");
                for (int i = 0; i < numberFound; i++) {
                    if (i == numberFound - 1)
                        System.out.printf("%d]\n", newArr[i]);
                    else
                        System.out.printf("%d, ", newArr[i]);
                }
            } else {
                String printArray = Arrays.toString(newArr);
                System.out.println(printArray);
            }
        }

    }

    public static void lastEvenOrOdd(int []arr,String type,int count) {
        if(count>arr.length || count<1)
            System.out.println( "Invalid count");
        else {
            int numberFound = 0;
            int arrIndex=count;
            int[] newArr = new int[count];

            Arrays.fill(newArr, -1);

            for (int i = arr.length-1; i >=0; i--) {
                if (type.equals("even")) {
                    if (arr[i] % 2 == 0 && numberFound < count) {
                        newArr[arrIndex-1] = arr[i];
                        arrIndex--;
                        numberFound++;
                    }
                } else if (type.equals("odd")) {
                    if (arr[i] % 2 != 0 && numberFound < count) {
                        newArr[arrIndex-1] = arr[i];
                        arrIndex--;
                        numberFound++;
                    }
                }
                if (numberFound == count)
                    break;
            }

            if (numberFound == 0)
                System.out.println("[]");
            else if (numberFound < count) {
                System.out.print("[");
                for (int i = arrIndex; i < count; i++) {
                    if (i == count -1)
                        System.out.printf("%d]\n", newArr[i]);
                    else
                        System.out.printf("%d, ", newArr[i]);
                }
            } else {
                String printArray = Arrays.toString(newArr);
                System.out.println(printArray);
            }
        }

    }


    public static void main(String[] args) {

        arrayManipulator();



    }
}