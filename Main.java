import java.util.Scanner;

public class Main {

    public static void passwordValidity(String password){

        if(!validLength(password))
            System.out.println("Password must be between 6 and 10 characters");
        if(!onlyDigitsAndLetters(password))
            System.out.println("Password must consist only of letters and digits");
        if(!digitsMoreThanOne(password))
            System.out.println("Password must have at least 2 digits");

        if(validLength(password) && onlyDigitsAndLetters(password) && digitsMoreThanOne(password))
            System.out.println("Password is valid");
    }
    public static boolean validLength(String password){

        return password.length() >= 6 && password.length() <= 10;

    }
    public static boolean onlyDigitsAndLetters(String password){

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if((int) ch <=57 && (int) ch >=48 ||
                    (int) ch >=65 && (int) ch <=90 ||
            (int) ch >=97 && (int) ch <=122);
            else return false;
        }
        return true;

    }

    public static boolean digitsMoreThanOne(String password){
        int count=0;

        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if((int) ch <=57 && (int) ch >=48)
                count++;
            if(count>=2)
                return true;

        }
        return false;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        passwordValidity(input);


    }
}