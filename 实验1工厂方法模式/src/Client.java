/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 兽兽
 * Date: 2020-04-11
 * Time: 22:59
 */
public class Client {
    public static void main(String []args){
        LoggerFactory factory;
        Logger logger;
       /* factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();*/
        factory = new DatabaseLoggerFactory ();
        logger = factory.createLogger();
        logger.writeLog();

    }
}
