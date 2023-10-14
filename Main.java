import java.util.*;
import java.util.stream.Collectors;

public class Main {



    public static void getCommands() {
        Scanner sc = new Scanner(System.in);

        List<String> arr =
                Arrays.stream(sc.nextLine().split(", "))
                        .collect(Collectors.toList());

        String []command=sc.nextLine().split(":");
        while(!command[0].equals("course start")){
          switch (command[0]){
              case "Add":
                  String lesson=command[1];
                  addLesson(arr,lesson);
                  break;
              case "Insert":
                  lesson=command[1];
                  int index= Integer.parseInt(command[2]);
                  insertLesson(arr,lesson,index);
                  break;
              case "Remove":
                  lesson=command[1];
                  removeLesson(arr,lesson);
                  break;
              case "Swap":
                  lesson=command[1];
                  String lesson2=command[2];
                  swapLessons(arr,lesson,lesson2);
                  break;
              case "Exercise":
                  lesson=command[1];
                  addExercise(arr,lesson);
                  break;
          }

            command=sc.nextLine().split(":");
        }

        printElements(arr);
    }

    public static void addLesson(List <String> arr,String lesson){
        if(!arr.contains(lesson)){
            arr.add(lesson);
        }

    }

    public static void insertLesson(List <String> arr,String lesson,int index){
        if(!arr.contains(lesson)){
           arr.add(index,lesson);
        }

    }
    public static void removeLesson(List <String> arr,String lesson){
        arr.remove(lesson);
        arr.remove(lesson+"-Exercise");

    }

    public static void swapLessons(List <String> arr,String lesson1,String lesson2){
      if(arr.contains(lesson1) && arr.contains(lesson2)) {
          Collections.swap(arr, arr.indexOf(lesson1), arr.indexOf(lesson2));

          if (arr.contains(lesson1 + "-Exercise")) {
              int index = arr.indexOf(lesson1 + "-Exercise");
              arr.add(arr.indexOf(lesson1) + 1, lesson1 + "-Exercise");

              if (index < arr.indexOf(lesson1))
                  arr.remove(index);
              else
                  arr.remove(index + 1);
          }
          if (arr.contains(lesson2 + "-Exercise")) {
              int index = arr.indexOf(lesson2 + "-Exercise");
              arr.add(arr.indexOf(lesson2) + 1, lesson2 + "-Exercise");

              if (index < arr.indexOf(lesson2))
                  arr.remove(index);
              else
                  arr.remove(index + 1);
          }
      }

    }
    public static void addExercise(List <String> arr,String lesson){
        if(arr.contains(lesson) && !arr.contains(lesson+"-Exercise")){
            arr.add(arr.indexOf(lesson)+1,lesson+"-Exercise");
        }else if(!arr.contains(lesson)){
            arr.add(lesson);
            arr.add(lesson+"-Exercise");
        }
    }

    public static void printElements(List <String> items) {

        for (String item : items) {
            System.out.println(items.indexOf(item)+1 +"."+item);
        }
    }


    public static void main(String[] args) {

        getCommands();


    }
}