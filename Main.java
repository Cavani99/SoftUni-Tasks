import java.util.Scanner;

public class Main {
    public static void FromLefttoTheRight() {
        Scanner sc = new Scanner(System.in);

        int linesOfInput=Integer.parseInt(sc.nextLine());



        for(int i=1;i<=linesOfInput;i++){

            String input=sc.nextLine();
            boolean firstNumberFinished=false;
            String firstNumber="";
            String secondNumber="";

            for(int k=0;k<=input.length()-1;k++) {
                char ch = input.charAt(k);
                if (ch == ' ')
                    firstNumberFinished = true;
                else{
                    if(!firstNumberFinished)
                        firstNumber+=ch;
                    else
                        secondNumber+=ch;
                }
            }

            long number1=  Long.parseLong(firstNumber);
            long number2= Long.parseLong(secondNumber);
            int sum=0;
            if(number1>=number2){

               while(number1!=0){
                   sum+=number1 % 10;
                   number1/=10;
               }

            } else {

                while(number2!=0){
                    sum+=number2 % 10;
                    number2/=10;
                }

            }

            System.out.println(Math.abs(sum));
        }

    }


    public static void main(String[] args) {
        FromLefttoTheRight();
    }
}