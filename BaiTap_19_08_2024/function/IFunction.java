package BaiTap_19_08_2024.function;

import BaiTap_19_08_2024.entities.Book;

public interface IFunction {
    public void addBook(Book book);

    public void borrowBook(String isbn, String borrower) throws Exception;

    public void returnBook(String isbn) throws Exception;

    public void displayBooks();
}
