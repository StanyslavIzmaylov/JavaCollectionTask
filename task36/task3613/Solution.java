package com.javarush.task.task36.task3613;

/* 
Найти класс по описанию Ӏ Java Collections: 6 уровень, 10 лекция
*/

import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        return SynchronousQueue.class;
    }

}
