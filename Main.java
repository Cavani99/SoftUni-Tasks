import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void sortSeveralArrays() {
        Scanner sc = new Scanner(System.in);

        List<String> arr =
                Arrays.stream(sc.nextLine().split("\\|"))
                        .collect(Collectors.toList());




        for (int i = arr.size() - 1; i >= 0; i--) {
            String []splitArray=arr.get(i).split("\\s+");

            for(int j=0;j<splitArray.length;j++){
                String value=splitArray[j];
                if(!value.equals(""))
                    System.out.print(value.trim()+" ");
            }

        }
    }







    public static void main(String[] args) {

        sortSeveralArrays();


    }
}