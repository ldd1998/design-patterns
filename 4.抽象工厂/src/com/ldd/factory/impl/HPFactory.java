package com.ldd.factory.impl;

import com.ldd.product.MainFrame;
import com.ldd.factory.IFactory;
import com.ldd.product.Keyboard;
import com.ldd.product.Monitor;
import com.ldd.product.impl.HPKeyboard;
import com.ldd.product.impl.HPMainFrame;
import com.ldd.product.impl.HPMonitor;

public class HPFactory implements IFactory {
    @Override
    public MainFrame createMainFrame() {
        MainFrame mainFrame = new HPMainFrame();
        //...造一个HP主机;
        return mainFrame;
    }

    @Override
    public Monitor createMonitor() {
        Monitor monitor = new HPMonitor();
        //...造一个HP显示器;
        return monitor;
    }

    @Override
    public Keyboard createKeyboard() {
        Keyboard keyboard = new HPKeyboard();
        //...造一个HP键盘;
        return keyboard;
    }
}