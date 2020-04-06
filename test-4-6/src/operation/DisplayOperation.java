package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-06
 * Time: 15:58
 */
public class DisplayOperation implements Ioperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for(int i=0;i<bookList.getUsedSize();i++) {
            System.out.println(bookList.getbooks(i));
        }
    }
}
