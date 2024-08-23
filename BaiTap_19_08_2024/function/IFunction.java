package BaiTap_19_08_2024.function;

import BaiTap_19_08_2024.entities.Book;

/*
1. rename lai ten interface ? dat la IFunction thi co y nghia gi?
=> Thay vao do, dat 1 cai ten -> nhin vao ten thoi la biet duoc y nghia no thuc hien cho muc dich gi
=> BookFunction, IBook, BookRepository

*  */
public interface IFunction {
    public void addBook(Book book);

    public void borrowBook(String isbn, String borrower) throws Exception;

    public void returnBook(String isbn) throws Exception;

    public void displayBooks();
}
