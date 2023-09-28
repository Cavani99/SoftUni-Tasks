import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void MaxSequenceOfEqualElements() {
        Scanner sc = new Scanner(System.in);

        int [] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startIndex=0;
        int indexValue=0;
        int longestCount=0;
        int longestIndex=0;
        int count=0;
        for(int i=0;i< numbers.length;i++){
            if(i==0){
                indexValue=numbers[i];
                count++;
            }
            else if(numbers[i]==indexValue){
                count++;
            }else {
                if(count>longestCount){
                    longestCount=count;
                    longestIndex=startIndex;
                }
                startIndex=i;
                indexValue=numbers[i];
                count=1;
            }

        }

        if(count>longestCount){
            longestCount=count;
            longestIndex=startIndex;
        }

        for(int j=longestIndex;j<longestCount+longestIndex;j++){
            System.out.print(numbers[j]+" ");
        }


    }

    public static void main(String[] args) {
        MaxSequenceOfEqualElements();
    }
}