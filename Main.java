import java.util.Scanner;

public class Main {
    public static void  RefactorVolumeofPyramid() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Length: ");

        double length = Double.parseDouble(sc.nextLine());

        System.out.print("Width: ");

        double width = Double.parseDouble(sc.nextLine());

        System.out.print("Height: ");

        double height = Double.parseDouble(sc.nextLine());


        System.out.printf("Pyramid Volume: %.2f", (length * width * height) / 3);


    }


    public static void main(String[] args) {
        RefactorVolumeofPyramid();
    }
}