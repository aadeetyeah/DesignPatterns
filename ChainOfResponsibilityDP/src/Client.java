import handlers.*;
import request.Priority;
import request.Request;

public class Client {
    public static void main(String args[]){
        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);
        Request request4 = new Request(Priority.NEW_FEATURE);

        ISupportHandler supportHandler1 = new Tier1SupportHandler();
        ISupportHandler supportHandler2 = new Tier2SupportHandler();
        ISupportHandler supportHandler3 = new ProductionSupportHandler();
        ISupportHandler supportHandler4 = new DeveloperHandler();

        supportHandler1.setNextHandler(supportHandler2);
        supportHandler2.setNextHandler(supportHandler3);
        supportHandler3.setNextHandler(supportHandler4);

        supportHandler1.handleRequest(request1);
        supportHandler1.handleRequest(request2);
        supportHandler1.handleRequest(request3);
        supportHandler1.handleRequest(request4);
    }
}
