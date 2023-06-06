package com.shanghai.james.dp.creational.Singleton;

//code a singleton class
public class Singleton {
    //private static Singleton instance = new Singleton();
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
