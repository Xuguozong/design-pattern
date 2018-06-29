package com.design.pattern.creation.factory.factorymethod;

public class Client {
    public static void main(String[] args){
        Factory factory = new FileLoggerFactory();
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
