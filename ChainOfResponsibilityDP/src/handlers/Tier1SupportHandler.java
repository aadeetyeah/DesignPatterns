package handlers;

import request.Priority;
import request.Request;

public class Tier1SupportHandler implements ISupportHandler{

    private ISupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority() == Priority.BASIC){
            System.out.println("Tier 1 Support handled the request");
        }else{
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(ISupportHandler handler) {
        this.nextHandler = handler;
    }
}
