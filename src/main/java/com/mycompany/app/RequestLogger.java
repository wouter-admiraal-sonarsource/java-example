package com.mycompany.app;

public class RequestLogger {

    public void logRequest(String requestId) {
        // TODO: send request logs to the central logging service instead of stdout
        System.out.println("Handling request: " + requestId);
    }
}
