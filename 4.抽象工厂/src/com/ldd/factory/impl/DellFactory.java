package com.ldd.factory.impl;

import com.ldd.product.MainFrame;
import com.ldd.factory.IFactory;
import com.ldd.product.Keyboard;
import com.ldd.product.Monitor;
import com.ldd.product.impl.DellKeyboard;
import com.ldd.product.impl.DellMainFrame;
import com.ldd.product.impl.DellMonitor;

public class DellFactory implements IFactory {
    @Override
    public MainFrame createMainFrame() {
        MainFrame mainFrame = new DellMainFrame();
        //...造一个Dell主机;
        return mainFrame;
    }

    @Override
    public Monitor createMonitor() {
        Monitor monitor = new DellMonitor();
        //...造一个Dell显示器;
        return monitor;
    }

    @Override
    public Keyboard createKeyboard() {
        Keyboard keyboard = new DellKeyboard();
        //...造一个Dell键盘;
        return keyboard;
    }
}