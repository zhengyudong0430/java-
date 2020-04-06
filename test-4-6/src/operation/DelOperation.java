package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-06
 * Time: 15:58
 */
public class DelOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入你想删除的图书：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        int pos = 0;
        int i;
        int curSize = bookList.getUsedSize();
        for (i = 0; i < curSize; i++) {
            Book book = bookList.getbooks(i);
            if (book.getName().equals(name)) {
                pos = i;
                break;
            }
        }
        if (i == curSize) {
            System.out.println("没有这本书！");
            return;
        }
        for (int j = pos; j < curSize - 1; i++) {
            Book book = bookList.getbooks(pos + 1);
            bookList.setBooks(j, book);
        }
        bookList.setUsedSize(curSize - 1);
        System.out.println("删除成功！");
    }
}
