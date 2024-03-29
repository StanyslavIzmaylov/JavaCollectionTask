package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args){
        Solution.testStrategy(new HashMapStorageStrategy(),1000);
    }
    public static Set<Long> getIds(Shortener shortener, Set<String> strings){
        Set<Long> idSet = new HashSet<>();
        for(String str: strings){
            idSet.add(shortener.getId(str));
        }
        return idSet;
    }
    public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> strSet = new HashSet<>();
        for (Long key: keys){
           strSet.add(shortener.getString(key));
        }
        return strSet;
    }
         public static void testStrategy(StorageStrategy strategy, long elementsNumber){
               Helper.printMessage(strategy.getClass().getSimpleName());
                Set<String> testStr = new HashSet<>();
                for (int i = 0; i < elementsNumber; i++){
                    testStr.add(Helper.generateRandomString());
                }
                Shortener shortener = new Shortener(strategy);

             Date startTest = new Date();
             Set<Long> testLong = getIds(shortener,testStr);
             Date endTest = new Date();
             long time = endTest.getTime() - startTest.getTime();
             Helper.printMessage("Время тестирования :"+time);

             startTest = new Date();
             Set<String> testString = getStrings(shortener,testLong);
             endTest = new Date();
             long timeLong = endTest.getTime() - startTest.getTime();
             Helper.printMessage("Время тестирования :"+timeLong);

             if (testStr.equals(testString)) {
                 Helper.printMessage("Тест пройден.");
             }
             else Helper.printMessage("Тест не пройден.");
         }
}
