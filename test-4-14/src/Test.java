import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-14
 * Time: 16:35
 */
public class Test {
        public static void main(String[] args) {
            List <String> books = new ArrayList<>();
            books.add("西游记");
            books.add("水浒传");
            books.add("三国演义");
            System.out.println(books);
            books.add(3,"红楼梦");
            System.out.println(books);
            System.out.println(books.get(0));
            List <String > subbooks = books.subList(0,2);
            System.out.println(subbooks);
            List<String > books2 = new ArrayList<>(books);
            System.out.println(books2);
            ArrayList<String> books3 = (ArrayList<String>) books;
            System.out.println("books3"+books3);
            List<String> books4 = (books2);
            System.out.println("books4"+books4);
        }
    }

