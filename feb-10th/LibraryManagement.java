class Book {
    boolean available = true;
}

class Library {
    void issue(Book b) throws Exception {
        if (!b.available) throw new Exception();
        b.available = false;
    }
}

public class LibraryManagement {
    public static void main(String[] args) throws Exception {
        Book b = new Book();
        new Library().issue(b);
        System.out.println(b.available);
    }
}
