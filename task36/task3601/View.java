package com.javarush.task.task36.task3601;

import java.util.List;

public class View {
    private Controller controller = new Controller();

    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}
