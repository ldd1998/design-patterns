package com.ldd;

import com.ldd.factory.IFactory;
import com.ldd.factory.impl.DellFactory;
import com.ldd.factory.impl.HPFactory;
import com.ldd.product.Keyboard;
import com.ldd.product.MainFrame;

public class Main {
    public static void main(String[] args) {
        IFactory dellFactory = new DellFactory();
        IFactory hpFactory = new HPFactory();
        //创建戴尔键盘
        Keyboard dellKeyboard = dellFactory.createKeyboard();
        MainFrame hpFactoryMainFrame = hpFactory.createMainFrame();
        //...
    }
}