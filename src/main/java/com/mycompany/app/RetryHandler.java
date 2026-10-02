package com.mycompany.app;

public class RetryHandler {

    public int getMaxRetries(boolean isCriticalOperation) {
        if (isCriticalOperation) {
            return 3;
        } else {
            return 3;
        }
    }
}
