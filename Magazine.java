public class Magazine extends Book{
    
    private String category;
    
    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category : " + category + "\n");
    }

    @Override
    public void borrowBook() {
        if (isBorrowed()) {
            System.out.println("Magazine : " + getTitle() + " is already borrowed");
        } else {
            setBorrowed(true);
            System.out.println("Magazine : " + getTitle() + " borrowed successfully");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine : " + getTitle() + " returned successfully");
        } else {
            System.out.println("Magazine : " + getTitle() + " is not borrowed");
        }
    }

}
