package com.javarush.task.task38.task3810;

import org.jsoup.select.Evaluator;

public @interface Author {
    String value();

    Position position() default Position.OTHER;
}
