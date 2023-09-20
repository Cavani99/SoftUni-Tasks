import java.util.Scanner;

public class Main {
    public static void  SpecialNumbers() {
        Scanner sc = new Scanner(System.in);

        int numbers=Integer.parseInt(sc.nextLine());

        for(int i=1;i<=numbers;i++){
            int sum=0;
            int digits=i;
            while(digits>0){
                sum+=digits%10;
                digits=digits/10;
            }

            if(sum==5 || sum==7 || sum==11){
                System.out.printf("%d -> True\n",i);
            }else{
                System.out.printf("%d -> False\n",i);
            }

        }


    }


    public static void main(String[] args) {
        SpecialNumbers();
    }
}