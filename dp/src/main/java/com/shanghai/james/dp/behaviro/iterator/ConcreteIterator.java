package com.shanghai.james.dp.behaviro.iterator;

public class ConcreteIterator implements Iterator {
    private final ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.size();
    }

    @Override
    public Object next() {
        return aggregate.get(current++);
    }
}
