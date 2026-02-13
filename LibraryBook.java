public class LibraryBook {
    String title;
    int price;

    LibraryBook(){
        this.title = "Unknown";
        this.price = 0;
    }

    LibraryBook(String Ptitle){
        this.title = Ptitle;
        this.price = 500;
    }

    LibraryBook(String Ptitle, int Pprice){
        this.title = Ptitle;
        this.price = Pprice;
    }

    public void DisplayInformation(){
        System.out.println("Title : " + this.title);
        System.out.println("Price : " + this.price);
    }

    public static void main(String[] args){
        LibraryBook b1 = new LibraryBook();
        LibraryBook b2 = new LibraryBook("Diary of a wimpy kid");
        LibraryBook b3 = new LibraryBook("Encyclopedia",1000);

        b1.DisplayInformation();
        b2.DisplayInformation();
        b3.DisplayInformation();
    }
}
