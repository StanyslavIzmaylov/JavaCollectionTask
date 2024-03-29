package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        String pathsToZip = args[1];
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(pathsToZip));
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(pathsToZip));
        ZipEntry zipEntry = zipInputStream.getNextEntry();
        File tmpFile = File.createTempFile(null,null);
        while (zipEntry != null){
            Files.copy(zipInputStream,tmpFile.toPath());

        }
        zipOutputStream.write(fileName.getBytes());
        zipOutputStream.write(tmpFile.toPath().getNameCount());
        zipInputStream.close();
        zipOutputStream.close();
    }
}
