package Org.selenuim.pom.tests;

public class POJOClass {
    public POJOClass(int  bookId, String customerName) {
        this.bookId = bookId;
        this.customerName = customerName;
    }

    private int  bookId;



    private String customerName;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
