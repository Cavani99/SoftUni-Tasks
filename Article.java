import java.util.Scanner;

public class Article {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String title;
    private String content;
    private String author;

    public Article(String title,String content,String author){
       this.title=title;
       this.content=content;
       this.author=author;
    }

    public void Edit(String newContent){
        setContent(newContent);
    }

    public void ChangeAuthor(String newAuthor){
        setAuthor(newAuthor);
    }

    public void Rename(String newTitle){
        setTitle(newTitle);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String [] ob=sc.nextLine().split(", ");

        String title=ob[0];
        String content=ob[1];
        String author=ob[2];

        Article article=new Article(title,content,author);

        int commands=Integer.parseInt(sc.nextLine());

        for (int i = 1; i <=commands; i++) {
            String []command=sc.nextLine().split(": ");
            switch (command[0]){
                case "Edit":
                    article.Edit(command[1]);
                    break;
                case "ChangeAuthor":
                    article.ChangeAuthor(command[1]);
                    break;
                case "Rename":
                    article.Rename(command[1]);
                    break;
            }

        }

        System.out.printf("%s - %s: %s",article.getTitle(),article.getContent(),article.getAuthor());


    }



}
