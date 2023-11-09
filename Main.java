import java.util.*;

public class Main {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []code=sc.nextLine().split(" ");
        StringBuilder out=new StringBuilder();
        for (int i = 0; i < code.length; i++) {
            if(code[i].equals("|"))
                out.append(" ");
            else{
                switch (code[i]){
                    case ".-":
                        out.append("A");
                        break;
                    case "-...":
                        out.append("B");
                        break;
                    case "-.-.":
                        out.append("C");
                        break;
                    case "-..":
                        out.append("D");
                        break;
                    case ".":
                        out.append("E");
                        break;
                    case "..-.":
                        out.append("F");
                        break;
                    case "--.":
                        out.append("G");
                        break;
                    case "....":
                        out.append("H");
                        break;
                    case "..":
                        out.append("I");
                        break;
                    case ".---":
                        out.append("J");
                        break;
                    case "-.-":
                        out.append("K");
                        break;
                    case ".-..":
                        out.append("L");
                        break;
                    case "--":
                        out.append("M");
                        break;
                    case "-.":
                        out.append("N");
                        break;
                    case "---":
                        out.append("O");
                        break;
                    case ".--.":
                        out.append("P");
                        break;
                    case "--.-":
                        out.append("Q");
                        break;
                    case ".-.":
                        out.append("R");
                        break;
                    case "...":
                        out.append("S");
                        break;
                    case "-":
                        out.append("T");
                        break;
                    case "..-":
                        out.append("U");
                        break;
                    case "...-":
                        out.append("V");
                        break;
                    case ".--":
                        out.append("W");
                        break;
                    case "-..-":
                        out.append("X");
                        break;
                    case "-.--":
                        out.append("Y");
                        break;
                    case "--..":
                        out.append("Z");
                        break;
                }
            }
        }

        System.out.println(out);


    }
}