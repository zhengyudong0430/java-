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
public class ReturnOperation implements  Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要归还的图书");
        String name = scanner.nextLine();
        for(int i=0;i<bookList.getUsedSize();i++) {
            Book book = bookList.getbooks(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
    }
