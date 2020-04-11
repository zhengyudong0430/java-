/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-11
 * Time: 22:57
 */
public class FileLoggerFactory implements LoggerFactory{
    public Logger createLogger() {
        // 创建文件日志记录器对象
        Logger logger= new FileLogger();


        return logger;
    }


}
