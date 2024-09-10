public class Client {

    public static void main(String args[]){
        ILoggerFactory iLoggerFactory = new DebugLoggerFactory();
        ILogger logger = iLoggerFactory.createLogger();
        logger.log("This is DEBUG LOG");

        ILoggerFactory iLoggerFactory2 = new ErrorLoggerFactory();
        ILogger logger2 = iLoggerFactory2.createLogger();
        logger2.log("This is ERROR LOG");
    }
}
