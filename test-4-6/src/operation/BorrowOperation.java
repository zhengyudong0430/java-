package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-06
 * Time: 15:59
 */
public class BorrowOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要借的图书：");
        String name = scanner.nextLine();
        for (int i=0;i<bookList.getUsedSize();i++) {
            Book book =bookList.getbooks(i);
            if(book.getisBorrowed()) {
                System.out.println("已被借出！");
                return;
            }
            if(bookList.getbooks(i).getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功!");
                return;
            }
        }
        System.out.println("没有你想借阅的书。");

    }
}
