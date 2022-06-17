public class BookService {
    public Book[] getAllBook() {
        Book[] arrBook = new Book[5];

        arrBook[0] = new Book(1, "abc", "xyz", "Drama", "Kim Đồng", 2000);
        arrBook[1] = new Book(2, "abc1", "xyz1", "Action", "Kim Đồng", 2001);
        arrBook[2] = new Book(3, "abc2", "xyz2", "Horror", "Kim Đồng", 2022);
        arrBook[3] = new Book(4, "abc3", "xyz3", "Drama", "Kim Đồng", 1999);
        arrBook[4] = new Book(5, "abc4", "xyz4", "Action", "Kim Đồng", 2022);

        return arrBook;
    }

    public void show(Book[] arr) {
        for (Book b : arr) {
            System.out.println(b.id + " - " + b.title + " - " + b.author + " - " + b.category
                    + " - " + b.company + " - " + b.year);
        }
    }

    public void findBookByName(Book[] arr, String fName) {
        int count = 0;
        for (Book b : arr) {
            if (b.title.contains(fName)) {
                count++;
                System.out.println(b.id + " - " + b.title + " - " + b.author + " - " + b.category
                        + " - " + b.company + " - " + b.year);
            }
        }
        if(count == 0) {
            System.out.println("Không tìm thấy quyển sách này");
        }
    }

    public void findBookByCategory(Book[] arr, String fCategory) {
        int count = 0;
        for (Book b : arr) {
            if (b.category.contains(fCategory)) {
                count++;
                System.out.println(b.id + " - " + b.title + " - " + b.author + " - " + b.category
                        + " - " + b.company + " - " + b.year);
            }
        }
        if(count == 0) {
            System.out.println("Không tìm thấy quyển sách này");
        }
    }

    public void findBookByYear(Book[] arr, int year) {
        for (Book b : arr) {
            if (b.year == year) {
                System.out.println(b.id + " - " + b.title + " - " + b.author + " - " + b.category
                        + " - " + b.company + " - " + b.year);
            }
        }
    }
}
