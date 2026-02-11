public class Book {

    private String title;
    private boolean isIssued;

    public Book(String title) {
        this.title = title;
        this.isIssued = false;
    }

    public void issueBook() {
        if (isIssued == false) {
            isIssued = true;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book already issued");
        }
    }

    public void returnBook() {
        if (isIssued == true) {
            isIssued = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued");
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics");

        b.issueBook();
        b.issueBook();
        b.returnBook();
        b.returnBook();
    }
}
