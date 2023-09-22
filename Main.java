import java.util.Scanner;

public class Main {
    public static void PrintPartOfASCIITable() {
        Scanner sc = new Scanner(System.in);

        int indexStart = Integer.parseInt(sc.nextLine());
        int indexEnd = Integer.parseInt(sc.nextLine());


        for(int i=indexStart;i<=indexEnd;i++){
            char ch=(char)i;
            System.out.print(ch + " ");
        }


    }


    public static void main(String[] args) {
        PrintPartOfASCIITable();
    }
}