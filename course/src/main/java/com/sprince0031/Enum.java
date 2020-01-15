package com.sprince0031;



public class Enum {
    public enum LoggingLevel {
        PENDING(1), PROCESSING(2), PROCESSED(3);
        private int i;

        private LoggingLevel(int i) {
            this.i = i;
        }
    }   
    
    public LoggingLevel getLoggingLevel() {
        LoggingLevel finalState = null;
        for (LoggingLevel state: LoggingLevel.values()) {
            if (state == LoggingLevel.PENDING) {
                System.out.println("PENDING state");
            }
            if (state == LoggingLevel.PROCESSING) {
                System.out.println("PROCESSING state");
            }
            if (state == LoggingLevel.PROCESSED) {
                System.out.println("PROCESSED state");
            }
            finalState = state;
        }
        return finalState;
    }
}