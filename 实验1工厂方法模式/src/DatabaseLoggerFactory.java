/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-11
 * Time: 22:56
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger(){
        Logger logger= new DatabaseLogger();
        return logger;
    }
}
