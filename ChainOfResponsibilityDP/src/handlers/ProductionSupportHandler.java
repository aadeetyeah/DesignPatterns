package handlers;

import request.Priority;
import request.Request;

public class ProductionSupportHandler implements ISupportHandler{

    private ISupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()== Priority.CRITICAL){
            System.out.println("Production Support team handled the request.");
        }else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(ISupportHandler handler) {
        this.nextHandler = handler;
    }
}
