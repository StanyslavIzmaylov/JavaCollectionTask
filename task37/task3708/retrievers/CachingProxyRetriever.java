package com.javarush.task.task37.task3708.retrievers;

import com.javarush.task.task37.task3708.cache.LRUCache;
import com.javarush.task.task37.task3708.storage.Storage;

public class CachingProxyRetriever implements Retriever {
    LRUCache<Long, Object> cache = new LRUCache<>(10);
    OriginalRetriever originalRetriever;

    @Override
    public Object retrieve(long id) {
        Object result = cache.find(id);
        if (result == null) {
          Object object =   originalRetriever.retrieve(id);
            cache.set(id, object);
            return object;
        }
        return result;
    }

    public CachingProxyRetriever(Storage storage) {
        this.originalRetriever = new OriginalRetriever(storage);
    }
}
