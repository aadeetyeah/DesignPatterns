//Low level Module

public class DebugLogger implements ILogger {

    @Override
    public void log(String msg) {
        System.out.println("DEBUG: "+ msg);
    }
}
