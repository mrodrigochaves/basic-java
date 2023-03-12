package edu.mrodrigochaves.exercices;

public class LogLevels {
    
    public static String message(String logLine) {
        String result = logLine.substring(logLine.indexOf(' '));
        return result.trim();
    }
    public static String logLevel(String logLine) {
         String result = logLine.substring(1,logLine.indexOf(']'));
         return result.toLowerCase();
    }
    public static String reformat(String logLine) {
         return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
