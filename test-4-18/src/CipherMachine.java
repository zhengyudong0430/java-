/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-18
 * Time: 18:59
 */
public class CipherMachine {
    public String encrypt(String plainText){
        System.out.println("数据加密，将明文转换成密文");
        String es ="";
        for(int i = 0;i < plainText.length();i++){
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
