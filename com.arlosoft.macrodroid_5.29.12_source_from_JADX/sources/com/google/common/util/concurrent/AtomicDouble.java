package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicLong;

@ElementTypesAreNonnullByDefault
public class AtomicDouble extends Number {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient AtomicLong f53459a;

    public AtomicDouble(double d) {
        this.f53459a = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f53459a = new AtomicLong();
        mo61649b(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(mo61648a());
    }

    /* renamed from: a */
    public final double mo61648a() {
        return Double.longBitsToDouble(this.f53459a.get());
    }

    /* renamed from: b */
    public final void mo61649b(double d) {
        this.f53459a.set(Double.doubleToRawLongBits(d));
    }

    public double doubleValue() {
        return mo61648a();
    }

    public float floatValue() {
        return (float) mo61648a();
    }

    public int intValue() {
        return (int) mo61648a();
    }

    public long longValue() {
        return (long) mo61648a();
    }

    public String toString() {
        return Double.toString(mo61648a());
    }

    public AtomicDouble() {
        this(0.0d);
    }
}
