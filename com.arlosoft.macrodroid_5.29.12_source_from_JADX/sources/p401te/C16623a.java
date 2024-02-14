package p401te;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import p352oe.C15892q;

/* renamed from: te.a */
/* compiled from: Ser */
final class C16623a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private Object object;
    private byte type;

    public C16623a() {
    }

    /* renamed from: a */
    static Object m98988a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return m98990c(dataInput.readByte(), dataInput);
    }

    /* renamed from: b */
    static long m98989b(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return (((long) (((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255))) * 900) - 4575744000L;
    }

    /* renamed from: c */
    private static Object m98990c(byte b, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b == 1) {
            return C16624b.m98999m(dataInput);
        }
        if (b == 2) {
            return C16627d.m99016n(dataInput);
        }
        if (b == 3) {
            return C16628e.m99029c(dataInput);
        }
        throw new StreamCorruptedException("Unknown serialized type");
    }

    /* renamed from: d */
    static C15892q m98991d(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? C15892q.m95835H(dataInput.readInt()) : C15892q.m95835H(readByte * 900);
    }

    /* renamed from: e */
    static void m98992e(long j, DataOutput dataOutput) throws IOException {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j);
            return;
        }
        int i = (int) ((j + 4575744000L) / 900);
        dataOutput.writeByte((i >>> 16) & 255);
        dataOutput.writeByte((i >>> 8) & 255);
        dataOutput.writeByte(i & 255);
    }

    /* renamed from: f */
    private static void m98993f(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((C16624b) obj).mo79510n(dataOutput);
        } else if (b == 2) {
            ((C16627d) obj).mo79531r(dataOutput);
        } else if (b == 3) {
            ((C16628e) obj).mo79534d(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    /* renamed from: g */
    static void m98994g(C15892q qVar, DataOutput dataOutput) throws IOException {
        int E = qVar.mo75866E();
        int i = E % TypedValues.Custom.TYPE_INT == 0 ? E / TypedValues.Custom.TYPE_INT : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(E);
        }
    }

    private Object readResolve() {
        return this.object;
    }

    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = m98990c(readByte, objectInput);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        m98993f(this.type, this.object, objectOutput);
    }

    C16623a(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }
}
