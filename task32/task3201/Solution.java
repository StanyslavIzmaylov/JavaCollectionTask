package com.javarush.task.task32.task3201;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Запись в существующий файл
*/

public class Solution {
    public static void main(String... args) throws IOException {
        long number = Long.parseLong(args[1]);
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        File file = new File(args[2]);
        raf.seek(Math.min(raf.length(), number));
        raf.write(args[2].getBytes());

    }
}
