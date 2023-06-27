package com.shanghai.james.dp.behaviro.iterator;

public class ConcreteAggregate implements Aggregate {
    private Object[] objects;

    public ConcreteAggregate(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return objects.length;
    }

    public Object get(int i) {
        return objects[i];
    }
}
