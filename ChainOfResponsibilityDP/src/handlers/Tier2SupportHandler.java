package handlers;

import request.Priority;
import request.Request;

public class Tier2SupportHandler implements ISupportHandler{

    private ISupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()== Priority.INTERMEDIATE){
            System.out.println("Tier 2 Support handled the request.");
        }else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(ISupportHandler handler) {
        this.nextHandler = handler;
    }
}
