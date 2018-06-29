package com.design.pattern.creation.factory.factorymethod;

public class FileLoggerFactory extends Factory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
