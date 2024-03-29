package com.javarush.task.task33.task3303;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* 
Десериализация JSON объекта
*/

public class Solution {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        FileReader fl = new FileReader(fileName);
        ObjectMapper mapper = new ObjectMapper();
        Object o = mapper.readValue(fl, clazz);
        return (T) o;
    }

    public static void main(String[] args) {

    }
}
