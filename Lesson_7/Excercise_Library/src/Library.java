public class Library {
    private int id;
    private String bookName;
    private String company;
    private int year;
    private int amount;

    public Library() {
    }

    public Library(int id, String bookName, String company, int year, int amount) {
        this.id = id;
        this.bookName = bookName;
        this.company = company;
        this.year = year;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
