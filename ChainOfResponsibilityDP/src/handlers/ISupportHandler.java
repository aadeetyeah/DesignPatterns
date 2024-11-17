package handlers;

import request.Request;

public interface ISupportHandler {
    void handleRequest(Request request);
    void setNextHandler(ISupportHandler handler);
}
