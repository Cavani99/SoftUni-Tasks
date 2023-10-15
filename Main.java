import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {



    public static void getCarTimes() {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(sc.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int mid=numbers.size()/2+1;
        double leftTime=0;
        for (int i = 0; i < mid-1; i++) {
            if(numbers.get(i)==0){
                leftTime*=0.8;
            }else{
                leftTime+= numbers.get(i);
            }
        }

        double rightTime=0;
        for (int j = numbers.size()-1; j > mid-1; j--) {
            if(numbers.get(j)==0){
                rightTime*=0.8;
            }else{
                rightTime+= numbers.get(j);
            }
        }


        printWinner(leftTime,rightTime);
    }


    public static void printWinner(double carTime1,double carTime2){
        DecimalFormat decimalFormat = new DecimalFormat("#.0");

      if(carTime1<carTime2){
          String formattedNum = decimalFormat.format(carTime1);
          System.out.printf("The winner is left with total time: %s",formattedNum);
      }else{
          String formattedNum = decimalFormat.format(carTime2);
          System.out.printf("The winner is right with total time: %s",formattedNum);
      }
    }



    public static void main(String[] args) {

        getCarTimes();


    }
}