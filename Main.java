import java.util.*;

public class Main {



    public static void sortLists() {
        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();

        List<Integer> numbers =new ArrayList<>();
        List<Character> chars =new ArrayList<>();

        //make numbers and non-numbers lists;
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if((int)ch>=48 && (int)ch<=57){
                numbers.add(Integer.parseInt(String.valueOf(ch)));
            }else{
                chars.add(ch);
            }
        }

        //make take and skip lists from numbers;
        List<Integer> takeList =new ArrayList<>();
        List<Integer> skipList =new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
             if(i % 2==0){
                 takeList.add(numbers.get(i));
             }else{
                 skipList.add(numbers.get(i));
             }
        }


        System.out.println(findString(takeList,skipList,chars));

    }


    public static String findString(List<Integer> take, List<Integer> skip,  List<Character> chars){
        String result="";
        int index=0;


        for (int i=0;i< take.size();i++){
            int takeNum=take.get(i);
            int skipNum= skip.get(i);

            if(takeNum>0){
                for (int j = index; j < index+takeNum; j++) {
                    if(j< chars.size())
                     result+=chars.get(j);
                }
               index+=takeNum;
            }if(skipNum>0){
               index+=skipNum;
            }
        }


        return result;
    }



    public static void main(String[] args) {

        sortLists();


    }
}