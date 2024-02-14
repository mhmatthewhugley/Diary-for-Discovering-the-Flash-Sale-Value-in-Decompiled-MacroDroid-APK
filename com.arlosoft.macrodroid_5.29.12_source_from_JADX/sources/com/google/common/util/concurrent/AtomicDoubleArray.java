package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient AtomicLongArray f53460a;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        ImmutableLongArray.Builder e = ImmutableLongArray.m73596e();
        for (int i = 0; i < readInt; i++) {
            e.mo61335a(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f53460a = new AtomicLongArray(e.mo61336b().mo61320m());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int b = mo61656b();
        objectOutputStream.writeInt(b);
        for (int i = 0; i < b; i++) {
            objectOutputStream.writeDouble(mo61655a(i));
        }
    }

    /* renamed from: a */
    public final double mo61655a(int i) {
        return Double.longBitsToDouble(this.f53460a.get(i));
    }

    /* renamed from: b */
    public final int mo61656b() {
        return this.f53460a.length();
    }

    public String toString() {
        int b = mo61656b() - 1;
        if (b == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder((b + 1) * 19);
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.f53460a.get(i)));
            if (i == b) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i++;
        }
    }
}
