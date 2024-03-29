package com.javarush.task.task33.task3310.strategy;

import java.io.IOException;

public interface StorageStrategy {
    boolean containsKey(Long key);
    boolean containsValue(String value) throws IOException, ClassNotFoundException;
    void put(Long key, String value);
    Long getKey(String value);
    String getValue(Long key);
}
