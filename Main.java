import java.util.Scanner;

public class Main {


    public static void setBitAtNTo0(){
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int n=Integer.parseInt(sc.nextLine());


        StringBuilder num= new StringBuilder(Integer.toBinaryString(number));

        int count=0;
        int index=0;
        for(int i=num.length()-1;i>=0;i--){
            if(count==n){
                index=i;
                break;
            }
            count++;
        }

        num.setCharAt(index,'0');

        String value= String.valueOf(num);
        number=Integer.parseInt(value,2);


        System.out.println(number);

    }




    public static void main(String[] args) {

        setBitAtNTo0();


    }
}