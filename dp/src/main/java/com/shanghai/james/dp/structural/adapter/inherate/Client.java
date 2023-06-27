package com.shanghai.james.dp.structural.adapter.inherate;

public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request(); // call adaptee's sepcifiedRequest() in face

    }
}
