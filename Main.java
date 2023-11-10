import java.util.*;

public class Main {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<h1>");
        System.out.println("    "+sc.nextLine());
        System.out.println("</h1>");

        System.out.println("<article>");
        System.out.println("    "+sc.nextLine());
        System.out.println("</article>");

        String comment=sc.nextLine();
        while(!comment.equals("end of comments")){
            System.out.println("<div>");
            System.out.println("    "+comment);
            System.out.println("</div>");

            comment=sc.nextLine();
        }






    }
}