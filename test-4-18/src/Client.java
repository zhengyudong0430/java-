/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-18
 * Time: 19:01
 */
public class Client {
    public static void main(String[] args) {
        EncryFacade ef = new EncryFacade();
        ef.fileEncrypt("H:/facade/src.txt", "H:/facade/des.txt");
    }

}
