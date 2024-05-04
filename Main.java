public class Main {

    public static void main(String[] args) {

        TextBook textbook = new TextBook("Building Event-Driven Microservices", "Adam Bellemare", 2020,
                "Information Technology");
        Novel novel = new Novel("Pulang-Pergi", "Tere Liye", 2021, "Fiction");
        Magazine magazine = new Magazine("Sindo Weekly", "Various", 2020, "News");

        System.out.println("---- Book Infomation ----");
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();

        System.out.println("---- Borrowing and Returning Book ----");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook();

    }

}
