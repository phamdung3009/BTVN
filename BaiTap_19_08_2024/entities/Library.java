package BaiTap_19_08_2024.entities;

import BaiTap_19_08_2024.function.IFunction;

import java.util.*;

public class Library implements IFunction {
    private List<Book> books = new ArrayList<>(); //danh sách các sách trong thư viện
    private Set<String> borrowedBooks = new HashSet<>();//tập hợp các ISBN của các sách đã được mượn.
    private Map<String, String> borrowedBy = new HashMap<>();//ánh xạ ISBN của sách với tên người mượn.

    // thêm một cuốn sách vào thư viện.
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    // cho phép mượn một cuốn sách. Nếu sách đã bị mượn thì ném ra một ngoại lệ.
    @Override
    public void borrowBook(String isbn, String borrower) throws Exception {
        if (borrowedBooks.contains(isbn)) {// kiểm tra xem mã sách đã được mượn chưa?
            throw new Exception("ERROR!!! Sách mã " + isbn + " đã được mượn");
        }
        borrowedBooks.add(isbn); // thêm các mã sách vào SET
        borrowedBy.put(isbn, borrower); // nếu đã được muộn, sẽ put mã và người mượn vào Map
    }

    //cho phép trả lại một cuốn sách. Nếu sách chưa được mượn thì ném ra một ngoại lệ.
    @Override
    public void returnBook(String isbn) throws Exception {
        if (!borrowedBooks.contains(isbn)) { // phủ định sách có tồn tại không
            throw new Exception("ERROR!!! Sách mã " + isbn + " chưa có ai sử dung");
        }
        borrowedBooks.remove(isbn); // sau khi sách được trả lại sẽ được xoá bỏ trong list SET
        borrowedBy.remove(isbn);// và xoá luôn cả ở MAP bởi isbn
    }

    // hiển thị danh sách các sách trong thư viện.
    @Override
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
            if (borrowedBooks.contains(book.getIsbn())) {
                System.out.println(borrowedBy.get(book.getIsbn()) + " đang sử dụng " + book.getTitle());
            }
        }
    }
}
