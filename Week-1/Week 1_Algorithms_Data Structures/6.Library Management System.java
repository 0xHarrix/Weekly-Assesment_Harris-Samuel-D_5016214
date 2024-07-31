class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

public class LibraryManagement {
    public static int linearSearch(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Book[] books, String title) {
        int left = 0;
        int right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = books[mid].title.compareTo(title);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "1984", "George Orwell"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald")
        };

        System.out.println(linearSearch(books, "1984")); // Output: 0
        System.out.println(binarySearch(books, "The Great Gatsby")); // Output: 2
    }
}
