package com.shanghai.james.dp.behaviro.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.start();
        context.end();


        //Doesnt' works
        try {
            new Context().end();
        } catch (Exception e) {
            System.out.println("-------error-------"+e.toString());
        }

        try {
            new Context().start().start();
        } catch (Exception e) {
            System.out.println("-------error-------"+e.toString());
        }

        try {
            new Context().start().end().end();
        } catch (Exception e) {
            System.out.println("-------error-------"+e.toString());
        }

    }
}
