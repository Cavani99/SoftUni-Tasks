import java.util.Scanner;

public class Main {
    public static void DecryptingMessage() {
        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());
        int lines = Integer.parseInt(sc.nextLine());

        String message="";
        for(int i=1;i<=lines;i++){
            char ch=sc.nextLine().charAt(0);
            ch+=key;
            message+=ch;
        }
        System.out.println(message);



    }


    public static void main(String[] args) {
        DecryptingMessage();
    }
}