package com.design.pattern.creation.factory.factorymethod;

public class DataBaseLoggerFactory extends Factory {
    @Override
    public Logger createLogger() {
        return new DataBaseLogger();
    }
}
