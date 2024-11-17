package handlers;

import request.Request;

public class DeveloperHandler implements ISupportHandler{

    private ISupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        System.out.println("Dev team will make a code fix to handle this issue.\n" +
                "As no team was able to handle it.");
    }

    @Override
    public void setNextHandler(ISupportHandler handler) {
        //No next handler as this is the last handler.
    }
}
