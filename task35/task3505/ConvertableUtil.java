package com.javarush.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static <Key ,E extends Convertable<Key>>Map <Key ,E >convert(List<E> list) {
        Map <Key,E >result = new HashMap();
        for (E elements: list){
            Key key = elements.getKey();
            result.put(key,elements);
        }
        return result;
    }
}
