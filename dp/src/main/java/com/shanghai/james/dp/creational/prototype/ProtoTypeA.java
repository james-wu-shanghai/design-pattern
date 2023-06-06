package com.shanghai.james.dp.creational.prototype;

public class ProtoTypeA extends ProtoType {
    void doService() {
        System.out.println("ProtoTypeA doService," + innerState);
    }
}
