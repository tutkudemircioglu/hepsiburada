package com.tutku.hepsiburada.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
    private static final Logger logger = LogManager.getLogger(com.tutku.hepsiburada.logger.Log.class.getName());


    public static void info(String message) {
        logger.info(message);
    }
    public static void warn(String message) {
        logger.warn(message);
    }
    public static void debug(String message) {
        logger.debug(message);
    }
    public static void error(String message,Throwable data) {
        logger.error(message,data);
    }

}
