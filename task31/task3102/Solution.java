package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
            Queue<File> queue = new ArrayDeque<>();
            queue.add(new File(root));
            List<String> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                File current = queue.poll();
                File[] listOfFiles = current.listFiles();
                if (listOfFiles != null){
                    for (File file : listOfFiles) {
                        if (file.isDirectory()) {
                            queue.add(file);
                        } else {
                            list.add(file.getAbsolutePath());
                        }
                    }
                }
            }
            return list;
    }




    public static void main(String[] args) {

    }
}
