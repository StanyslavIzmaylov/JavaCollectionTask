package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader bf = new BufferedReader(new FileReader(fileName));
        TreeSet<Character> characterTreeSet = new TreeSet<>();
        while (bf.ready()) {
            String line = bf.readLine();
            for (char ch : line.toLowerCase().toCharArray()) {
                if (ch >= 97 && ch <= 122) {
                    characterTreeSet.add(ch);
                }
            }
        }
        bf.close();
        int count = 0;
        for (Character c : characterTreeSet) {
            System.out.print(c);
            count++;
            if (count == 5) {
                break;
            }
        }
    }
}
