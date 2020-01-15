/**
 * testIterator
 */
public class testIterator {
      Book[] books;
      public static void main(String[] args) {
            BookShelf bookShelf = new BookShelf(5);

            bookShelf.appendBook(new Book("Baby I Love You Forever!"));
            bookShelf.appendBook(new Book("Yesterday Once Again!"));
            bookShelf.appendBook(new Book("No More Sex!"));
            bookShelf.appendBook(new Book("Fucking Long Time!"));
            bookShelf.appendBook(new Book("Ok! Very Well!"));

            Iterator iterator = bookShelf.iterator();
            while(iterator.hasNext()){
                  Book book = (Book)iterator.next();
                  System.out.println(book.getName());
            }

            System.out.println(bookShelf.length);
            
      }


}