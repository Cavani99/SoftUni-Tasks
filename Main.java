import java.util.*;


public class Main {
     public static void AdvertisementMessage(){
         Scanner sc=new Scanner(System.in);
         Random rand=new Random();

         int messages=Integer.parseInt(sc.nextLine());


         for (int i = 1; i <=messages; i++) {

             int phraseRan = rand.nextInt( 7);
             int eventRan = rand.nextInt( 7);
             int authorRan = rand.nextInt( 9);
             int cityRan = rand.nextInt( 6);

             String phrase = getPhrase(phraseRan);
             String event = getEvent(eventRan);
             String author = getAuthor(authorRan);
             String city = getCity(cityRan);

             System.out.printf("%s %s %s – %s\n", phrase, event, author, city);
         }

     }

     public static String getPhrase(int index){

         switch (index){
             case 1:
                 return "Excellent product.";
             case 2:
                 return "Such a great product.";
             case 3:
                 return "I always use that product.";
             case 4:
                 return "Best product of its category.";
             case 5:
                 return "Exceptional product.";
             case 6:
                 return "I can’t live without this product.";

         }
         return "";
     }

    public static String getEvent(int index){

        switch (index){
            case 1:
                return "Now I feel good.";
            case 2:
                return "I have succeeded with this product.";
            case 3:
                return "Makes miracles. I am happy of the results!";
            case 4:
                return "I cannot believe but now I feel awesome.";
            case 5:
                return "Try it yourself, I am very satisfied.";
            case 6:
                return "I feel great!";

        }
        return "";
    }
    public static String getAuthor(int index){

        switch (index){
            case 1:
                return "Diana";
            case 2:
                return "Petya";
            case 3:
                return "Stella";
            case 4:
                return "Elena";
            case 5:
                return "Katya";
            case 6:
                return "Iva";
            case 7:
                return "Annie";
            case 8:
                return "Eva";

        }
        return "";
    }
    public static String getCity(int index){

        switch (index){
            case 1:
                return "Burgas";
            case 2:
                return "Sofia";
            case 3:
                return "Plovdiv";
            case 4:
                return "Varna";
            case 5:
                return "Ruse";

        }
        return "";
    }

    public static void main(String[] args) {

        AdvertisementMessage();

    }
}