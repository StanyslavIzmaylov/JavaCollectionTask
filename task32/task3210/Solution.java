package com.javarush.task.task32.task3210;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
        long number = Long.parseLong(args[1]);
        String text = args[2];
        RandomAccessFile raf = new RandomAccessFile(args[0], "rw");
        raf.seek(number);
        byte[] bytes = new byte[args[2].length()];
        raf.read(bytes,0,args[2].length());
        String string = new String(bytes);
        raf.seek(raf.length());
       if (string.equals(text)){
           raf.write("true".getBytes());
       }
       else {
           raf.write("false".getBytes());
       }
    }
}
