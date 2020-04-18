import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-18
 * Time: 18:59
 */
public class FileReader {
    public String Read(String fileNameSrc) {
        System.out.println("读取文件，获取明文");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFs = new FileInputStream(fileNameSrc);
            int data;
            try {
                while ((data = inFs.read()) != -1) {
                    sb = sb.append((char) data);
                }

                inFs.close();
                System.out.println(sb.toString());
            } catch (IOException e) {
                System.out.println("文件操作异常");
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在异常");
        }
        return sb.toString();
    }
}
