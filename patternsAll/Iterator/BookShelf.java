/**
 * BookShelf
 */
public class BookShelf implements Aggregate {
      private Book[] books;
      private int last = 0;
      public int length;

      public Iterator iterator() {
            return new BookShelfIterator(this);
      }

      public Book getBookAt(int index) {
            return books[index];
      }

      public void appendBook(Book book) {
            this.books[last] = book;
            last++;
      }

      public int getLength() {
            return last;
      }


      public BookShelf(int maxsize) {
            this.books = new Book[maxsize];
            setLength(books.length);
      }

      public void setLength(int length) {
            this.length = length;
      }

}