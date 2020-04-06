package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-06
 * Time: 15:59
 */
public class ExitOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(0);
    }
}
