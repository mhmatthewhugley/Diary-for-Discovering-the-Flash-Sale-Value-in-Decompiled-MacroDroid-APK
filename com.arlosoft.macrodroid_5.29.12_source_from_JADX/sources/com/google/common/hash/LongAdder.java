package com.google.common.hash;

import com.google.common.hash.Striped64;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f17604d = 0;
        this.f17602a = null;
        this.f17603c = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(mo37041h());
    }

    /* renamed from: a */
    public void mo37035a(long j) {
        int length;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr = this.f17602a;
        if (cellArr == null) {
            long j2 = this.f17603c;
            if (mo37057c(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = Striped64.f17596f.get();
        boolean z = true;
        if (!(iArr == null || cellArr == null || (length = cellArr.length) < 1 || (cell = cellArr[(length - 1) & iArr[0]]) == null)) {
            long j3 = cell.f17607a;
            z = cell.mo37062a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        mo37059g(j, iArr, z);
    }

    public double doubleValue() {
        return (double) mo37041h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo37039e(long j, long j2) {
        return j + j2;
    }

    public float floatValue() {
        return (float) mo37041h();
    }

    /* renamed from: h */
    public long mo37041h() {
        long j = this.f17603c;
        Striped64.Cell[] cellArr = this.f17602a;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j += cell.f17607a;
                }
            }
        }
        return j;
    }

    public int intValue() {
        return (int) mo37041h();
    }

    public long longValue() {
        return mo37041h();
    }

    public String toString() {
        return Long.toString(mo37041h());
    }
}
