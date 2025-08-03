import java.util.Scanner;
class libraray{
    String[] books;
    int no_of_books;
    libraray(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addbooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"   "+"Has been Added");
    }
    void  showavailablebooks(){
        System.out.println("AVAILABLE BOOKS ARE:");
        for(String book:this.books){
            if (book==null){
                continue;
            }
            System.out.println("*"    +book);
        }
    }
    void issuedbook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i] .equals(book)){
                System.out.println(book   +"   "+"Book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book has been exixt");
    }
    void returnbook(String book){
        addbooks(book);
    }

}






public class librarymangement {
    public static void main(String[] args) {
        libraray mylibraray=new libraray();
        mylibraray.addbooks("java");
        mylibraray.addbooks("c++");
        mylibraray.addbooks("python");
        mylibraray.showavailablebooks();
        mylibraray.issuedbook("c++");
        mylibraray.showavailablebooks();
        mylibraray.returnbook("c++");
        mylibraray.showavailablebooks();
    }
}
