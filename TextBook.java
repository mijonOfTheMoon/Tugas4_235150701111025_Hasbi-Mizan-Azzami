public class TextBook extends Book{
    
    private String subject;
    
    public TextBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject\t : " + subject + "\n");
    }

    @Override
    public void borrowBook() {
        if (isBorrowed()) {
            System.out.println("Textbook : " + getTitle() + " is already borrowed");
        } else {
            setBorrowed(true);
            System.out.println("Textbook : " + getTitle() + " borrowed successfully");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Textbook : " + getTitle() + " returned successfully");
        } else {
            System.out.println("Textbook : " + getTitle() + " is not borrowed");
        }
    }

}
