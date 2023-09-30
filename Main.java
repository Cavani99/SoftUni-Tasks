import java.util.Scanner;

public class Main {
    public static void EncryptSortAndPrintArray() {
        Scanner sc = new Scanner(System.in);

        int numberOfString=Integer.parseInt(sc.nextLine());
        int [] arr=new int[numberOfString];

        int index=0;
        for(int i=0;i<numberOfString;i++){
            String input=sc.nextLine();
            char ch;
            int sum=0;
            for(int j=0;j<input.length();j++){
                ch=input.charAt(j);
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> sum += (int) ch * input.length();
                    default -> sum += (int) ch / input.length();
                }
            }

            arr[index]=sum;
            index++;

        }

        for(int sort=0;sort<arr.length;sort++){

            for(int compare=sort+1;compare<arr.length;compare++){

                if (arr[sort] > arr[compare]) {
                    int oldValue=arr[compare];
                    arr[compare]=arr[sort];
                    arr[sort]=oldValue;

                }
            }
        }

        for(int strings:arr){
            System.out.println(strings);
        }


    }

    public static void main(String[] args) {
        EncryptSortAndPrintArray();
    }
}