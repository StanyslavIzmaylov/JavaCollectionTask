package com.javarush.task.task40.task4007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* 
Работа с датами
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        printDate("21.4.2014 15:56:45");
        System.out.println();
        printDate("21.4.2014");
        System.out.println();
        printDate("17:33:40");
    }

    public static void printDate(String date) throws ParseException {
      if (date.contains(".")&& date.contains(":")){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(simpleDateFormat.parse(date));
          System.out.println("День: " + calendar.get(Calendar.DATE));
          System.out.println("День недели: " + (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 7 : calendar.get(Calendar.DAY_OF_WEEK) - 1));
          System.out.println("День месяца: " + calendar.get(Calendar.DAY_OF_MONTH));
          System.out.println("День года: " + calendar.get(Calendar.DAY_OF_YEAR));
          System.out.println("Неделя месяца: " + calendar.get(Calendar.WEEK_OF_MONTH));
          System.out.println("Неделя года: " + calendar.get(Calendar.WEEK_OF_YEAR));
          System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
          System.out.println("Год: " + calendar.get(Calendar.YEAR));

          System.out.println("AM или PM: " + (calendar.get(Calendar.AM_PM) == Calendar.PM ? "PM" : "AM"));
          System.out.println("Часы: " + calendar.get(Calendar.HOUR));
          System.out.println("Часы дня: " + calendar.get(Calendar.HOUR_OF_DAY));
          System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
          System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
      }
        if (date.contains(".")&& !date.contains(":")){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(date));
            System.out.println("День: " + calendar.get(Calendar.DATE));
            System.out.println("День недели: " + (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 7 : calendar.get(Calendar.DAY_OF_WEEK) - 1));
            System.out.println("День месяца: " + calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println("День года: " + calendar.get(Calendar.DAY_OF_YEAR));
            System.out.println("Неделя месяца: " + calendar.get(Calendar.WEEK_OF_MONTH));
            System.out.println("Неделя года: " + calendar.get(Calendar.WEEK_OF_YEAR));
            System.out.println("Месяц: " + (calendar.get(Calendar.MONTH) + 1));
            System.out.println("Год: " + calendar.get(Calendar.YEAR));

        }
        if (date.contains(":")&& !date.contains(".")){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(simpleDateFormat.parse(date));

            System.out.println("AM или PM: " + (calendar.get(Calendar.AM_PM) == Calendar.PM ? "PM" : "AM"));
            System.out.println("Часы: " + calendar.get(Calendar.HOUR));
            System.out.println("Часы дня: " + calendar.get(Calendar.HOUR_OF_DAY));
            System.out.println("Минуты: " + calendar.get(Calendar.MINUTE));
            System.out.println("Секунды: " + calendar.get(Calendar.SECOND));
        }
    }
}
