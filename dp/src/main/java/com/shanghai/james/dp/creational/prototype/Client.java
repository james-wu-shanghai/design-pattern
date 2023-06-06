package com.shanghai.james.dp.creational.prototype;

public class Client {
    //build ProtoTypeA, ProtoTypeB, and clone them, call their doService() method
    public static void main(String[] args) {
        ProtoType protoTypeA = new ProtoTypeA();
        protoTypeA.innerState = "ProtoTypeA";
        protoTypeA.doService();

        ProtoType protoTypeB = new ProtoTypeB();
        protoTypeB.innerState = "ProtoTypeB";
        protoTypeB.doService();

        ProtoType protoTypeAClone = protoTypeA.clone();
        protoTypeAClone.doService();

        ProtoType protoTypeBClone = protoTypeB.clone();
        protoTypeBClone.doService();
    }
}
