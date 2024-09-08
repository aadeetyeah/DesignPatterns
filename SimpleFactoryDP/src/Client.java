//High Level Module

public class Client {

    public static void main(String args[]){
        ILogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        debugLogger.log("Hello there!!!!");

        ILogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        infoLogger.log("Testing info logs");

        ILogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        errorLogger.log("Exception thrown.");
    }
}
