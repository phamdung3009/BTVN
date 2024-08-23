package BaiTap_19_08_2024;

import BaiTap_19_08_2024.entities.Book;
import BaiTap_19_08_2024.entities.Library;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        // thêm mới 5 loại sách
        lib.addBook(new Book("Book1", "A1", "1"));
        lib.addBook(new Book("Book2", "A2", "2"));
        lib.addBook(new Book("Book3", "A3", "3"));
        lib.addBook(new Book("Book4", "A4", "4"));
        lib.addBook(new Book("Book5", "A5", "5"));
        // Hiển thị tất cả các loại sách
        lib.displayBooks();
        System.out.println("-----------------------------------------");
        // mượn sách
        try {
            lib.borrowBook("1","Nguyen Van A");
            lib.borrowBook("2","Nguyen Van B");
//            lib.borrowBook("2","Nguyen Van B");
            lib.borrowBook("3","Nguyen Van C");
//            lib.borrowBook("3","Nguyen Van C");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        lib.displayBooks();

        System.out.println("-----------------------------------------");
        // trả sách
        try {
            lib.returnBook("1");
            lib.returnBook("2");
            lib.returnBook("5");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        lib.displayBooks();
    }
}
