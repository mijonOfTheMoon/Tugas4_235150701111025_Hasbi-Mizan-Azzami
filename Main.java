public class Main {
    
    public static void main(String[] args) {
        
        Novel novel = new Novel("Pulang-Pergi", "Tere Liye", 2021, "Fiction");
        Magazine magazine = new Magazine("Sindo Weekly", "Various", 2020, "News");
        TextBook textbook = new TextBook("Mastering Cloud Computing", "Prof. Dr. Yoesoep Edhie Rachmad", 2023, "Information Technology");

        System.out.println("---- Book Infomation ----");
        novel.displayInfo();
        magazine.displayInfo();
        textbook.displayInfo();

        System.out.println("---- Borrowing and Returning Book ----");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook();

    }

}
