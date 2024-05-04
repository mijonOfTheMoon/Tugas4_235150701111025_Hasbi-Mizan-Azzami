public class Novel extends Book{
    
    private String genre;
    
    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre\t : " + genre + "\n");
    }

    @Override
    public void borrowBook() {
        if (isBorrowed()) {
            System.out.println("Novel\t : " + getTitle() + " is already borrowed");
        } else {
            setBorrowed(true);
            System.out.println("Novel\t : " + getTitle() + " borrowed successfully");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel\t : " + getTitle() + " returned successfully");
        } else {
            System.out.println("Novel\t : " + getTitle() + " is not borrowed");
        }
    }

}
