package com.shanghai.james.dp.creational.prototype;

public abstract class ProtoType implements Cloneable {
    protected String innerState;

    abstract void doService();

    @Override
    public ProtoType clone() {
        try {
            ProtoType clone = (ProtoType) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
