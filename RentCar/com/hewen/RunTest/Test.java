package com.hewen.RunTest;

import Log.LogMenu;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LogMenu logMenu = new LogMenu();
        logMenu.process();
    }
}