package com.shanghai.james.dp.behaviro.iterator;

public class Client {
    public static void main(String[] args) {
        final Iterator it = new ConcreteAggregate(new String[]{"a", "b", "c", "d"}).createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
