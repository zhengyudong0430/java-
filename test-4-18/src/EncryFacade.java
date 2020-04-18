/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-18
 * Time: 19:00
 */
public class EncryFacade {

    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryFacade(){
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
