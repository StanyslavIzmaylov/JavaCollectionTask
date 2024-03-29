package com.javarush.task.task37.task3703;

/* 
Найти класс по описанию Ӏ Java Collections: 7 уровень, 6 лекция
*/

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.DelayQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return  ConcurrentSkipListMap.class;
    }
}
