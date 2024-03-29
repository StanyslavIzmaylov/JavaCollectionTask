package com.javarush.task.task40.task4008;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/* 
Работа с Java 8 DateTime API
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
           DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.M.y H:m:s");
            LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
            LocalTime localTime = LocalTime.parse(date, dateTimeFormatter);
            System.out.println("День: " + localDate.getDayOfMonth());
            System.out.println("День недели: " + localDate.getDayOfWeek().getValue());
            System.out.println("День месяца: " + localDate.getDayOfMonth());
            System.out.println("День года: " + localDate.getDayOfYear());
            System.out.println("Неделя месяца: " + localDate.format(DateTimeFormatter.ofPattern("W")));
            System.out.println("Неделя года: " + localDate.format(DateTimeFormatter.ofPattern("w")));
            System.out.println("Месяц: " + localDate.getMonth().getValue());
            System.out.println("Год: " + localDate.getYear());

            System.out.println("AM или PM: " + localTime.format(DateTimeFormatter.ofPattern("a")));
            System.out.println("Часы: " + localTime.format(DateTimeFormatter.ofPattern("K")));
            System.out.println("Часы дня: " + localTime.getHour());
            System.out.println("Минуты: " + localTime.getMinute());
            System.out.println("Секунды: " + localTime.getSecond());
        }
        if (date.contains(".")&& !date.contains(":")){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.M.y");
            LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
            System.out.println("День: " + localDate.getDayOfMonth());
            System.out.println("День недели: " + localDate.getDayOfWeek().getValue());
            System.out.println("День месяца: " + localDate.getDayOfMonth());
            System.out.println("День года: " + localDate.getDayOfYear());
            System.out.println("Неделя месяца: " + localDate.format(DateTimeFormatter.ofPattern("W")));
            System.out.println("Неделя года: " + localDate.format(DateTimeFormatter.ofPattern("w")));
            System.out.println("Месяц: " + localDate.getMonth().getValue());
            System.out.println("Год: " + localDate.getYear());

        }
        if (date.contains(":")&& !date.contains(".")){
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:m:s");
            LocalTime localTime = LocalTime.parse(date, dateTimeFormatter);

            System.out.println("AM или PM: " + localTime.format(DateTimeFormatter.ofPattern("a")));
            System.out.println("Часы: " + localTime.format(DateTimeFormatter.ofPattern("K")));
            System.out.println("Часы дня: " + localTime.getHour());
            System.out.println("Минуты: " + localTime.getMinute());
            System.out.println("Секунды: " + localTime.getSecond());
        }
    }
}
