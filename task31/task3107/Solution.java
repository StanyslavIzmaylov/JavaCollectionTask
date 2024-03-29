package com.javarush.task.task31.task3107;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Null Object Pattern
*/

public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        Path paths = Paths.get(pathToFile);
        try {
            fileData = new ConcreteFileData(Files.isHidden(paths), Files.isExecutable(paths), Files.isDirectory(paths),Files.isWritable(paths));
        }
        catch (Exception e){
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
