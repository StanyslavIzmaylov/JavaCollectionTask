package com.javarush.task.task38.task3804;

/* 
Фабрика исключений
*/

public class Solution {
    public static Class getFactoryClass() {
        return FactoryClass.class;
    }

    public static void main(String[] args) {
     FactoryClass.ExeptionReturn(ApplicationExceptionMessage.SOCKET_IS_CLOSED);
    }
}