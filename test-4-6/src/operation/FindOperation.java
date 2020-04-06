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
public class FindOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入你要找的书：");
        String name = scanner.nextLine();
        for(int i= 0;i<bookList.getUsedSize();i++) {
           Book book =  bookList.getbooks(i);
            if(book.getName().equals(name)) {
                System.out.println(book);
                System.out.println("找到了这本书。");
                return;
            }
        }
        System.out.println("没有找到你想要的书！");
    }

}
