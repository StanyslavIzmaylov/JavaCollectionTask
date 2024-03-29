package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.io.IOException;

public class Shortener {
    private Long lastId = 0L;
    private StorageStrategy storageStrategy;

    public Shortener(StorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    public synchronized Long getId(String string){
        try {
            if (storageStrategy.containsValue(string)){
                return storageStrategy.getKey(string);
            } else
               lastId = lastId+1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        storageStrategy.put(lastId,string);
        return lastId;
    }
    public synchronized String getString(Long id){

       return storageStrategy.getValue(id);
    }
}
