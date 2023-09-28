import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void ArrayModifier() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String [] input =sc.nextLine().split(" ");
        while(!input[0].equals("end")){
            if(input[0].equals("swap")){
                int index1= Integer.parseInt(input[1]);
                int index2= Integer.parseInt(input[2]);
                int oldValue= numbers[index1];
                numbers[index1]=numbers[index2];
                numbers[index2]=oldValue;

            }
            else if(input[0].equals("multiply")){
                int index1= Integer.parseInt(input[1]);
                int index2= Integer.parseInt(input[2]);
                int mulipliedValue=numbers[index1]*numbers[index2];
                numbers[index1]=mulipliedValue;
            }else if(input[0].equals("decrease")){
                for(int i=0;i<numbers.length;i++){
                    numbers[i]-=1;
                }
            }


            input =sc.nextLine().split(" ");
        }

        String []arr= new String[]{Arrays.toString(numbers)
                .replace("[", "")
                .replace("]", "")};

        System.out.println(String.join(", ", arr));



    }

    public static void main(String[] args) {
        ArrayModifier();
    }
}