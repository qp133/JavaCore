public class SchoolBook extends Library{
    private int numberOfPages;
    private String status;
    private int numberOfBorrowed;

    public SchoolBook() {
    }

    public SchoolBook(int id, String bookName, String company, int year, int amount, int numberOfPages, String status, int numberOfBorrowed) {
        super(id, bookName, company, year, amount);
        this.numberOfPages = numberOfPages;
        this.status = status;
        this.numberOfBorrowed = numberOfBorrowed;
    }
}
