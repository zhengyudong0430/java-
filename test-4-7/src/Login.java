import com.sun.deploy.association.Action;
import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-07
 * Time: 0:08
 */
public class Login {
    private static String username= "小明";
    private static String password = "123456";


    public static void main(String[] args) throws NameException,PasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String username= scanner.next();
        System.out.println("请输入密码: ");
        String password = scanner.next();
        login(username,password);
    }
    public static void login(String username, String password) throws NameException,PasswordException {
        if (!Login.username.equals(username)) {
            throw new NameException("用户名输入有误");
        }
        if (!Login.password.equals(password)) {
            throw new PasswordException("密码输入有误");
        }
        System.out.println("登陆成功!");
    }
}

