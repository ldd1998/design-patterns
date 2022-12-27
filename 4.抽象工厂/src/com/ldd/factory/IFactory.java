package com.ldd.factory;

import com.ldd.product.MainFrame;
import com.ldd.product.Keyboard;
import com.ldd.product.Monitor;

public interface IFactory {
    MainFrame createMainFrame();

    Monitor createMonitor();

    Keyboard createKeyboard();
}