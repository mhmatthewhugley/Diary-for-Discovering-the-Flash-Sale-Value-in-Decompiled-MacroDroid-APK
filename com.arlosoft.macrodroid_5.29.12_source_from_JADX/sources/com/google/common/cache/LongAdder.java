package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.cache.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f4463d = 0;
        this.f4461a = null;
        this.f4462c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(mo22543i());
    }

    /* renamed from: a */
    public void mo22536a(long j) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.f4461a;
        if (cellArr == null) {
            long j2 = this.f4462c;
            if (mo22548d(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.f4455f.get();
        boolean z = true;
        if (!(iArr == null || cellArr == null || (length = cellArr.length) < 1 || (cell = cellArr[(length - 1) & iArr[0]]) == null)) {
            long j3 = cell.f4466a;
            z = cell.mo22553a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        mo22550h(j, iArr, z);
    }

    /* renamed from: b */
    public void mo22537b() {
        mo22536a(1);
    }

    public double doubleValue() {
        return (double) mo22543i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final long mo22541f(long j, long j2) {
        return j + j2;
    }

    public float floatValue() {
        return (float) mo22543i();
    }

    /* renamed from: i */
    public long mo22543i() {
        long j = this.f4462c;
        Striped64.Cell[] cellArr = this.f4461a;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f4466a;
                }
            }
        }
        return j;
    }

    public int intValue() {
        return (int) mo22543i();
    }

    public long longValue() {
        return mo22543i();
    }

    public String toString() {
        return Long.toString(mo22543i());
    }
}
