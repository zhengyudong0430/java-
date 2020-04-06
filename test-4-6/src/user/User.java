package user;

import book.Book;
import book.BookList;
import operation.Ioperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-06
 * Time: 16:16
 */
 abstract  public class User {
    public String name;
    public Ioperation []Operations;
    public User(String name) {
    this.name = name;
    }
     public abstract  int  menu();
    public void doOperation (int choice, BookList bookList) {
        Operations[choice].work(bookList);
    }

}
