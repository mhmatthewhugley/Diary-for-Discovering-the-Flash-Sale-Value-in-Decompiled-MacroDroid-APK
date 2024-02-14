package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: f */
    private static final BooleanArrayList f56612f;

    /* renamed from: c */
    private boolean[] f56613c;

    /* renamed from: d */
    private int f56614d;

    static {
        BooleanArrayList booleanArrayList = new BooleanArrayList(new boolean[0], 0);
        f56612f = booleanArrayList;
        booleanArrayList.mo64743U();
    }

    BooleanArrayList() {
        this(new boolean[10], 0);
    }

    /* renamed from: h */
    private void m79738h(int i, boolean z) {
        int i2;
        mo64748c();
        if (i < 0 || i > (i2 = this.f56614d)) {
            throw new IndexOutOfBoundsException(m79740m(i));
        }
        boolean[] zArr = this.f56613c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f56613c, i, zArr2, i + 1, this.f56614d - i);
            this.f56613c = zArr2;
        }
        this.f56613c[i] = z;
        this.f56614d++;
        this.modCount++;
    }

    /* renamed from: j */
    private void m79739j(int i) {
        if (i < 0 || i >= this.f56614d) {
            throw new IndexOutOfBoundsException(m79740m(i));
        }
    }

    /* renamed from: m */
    private String m79740m(int i) {
        return "Index:" + i + ", Size:" + this.f56614d;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo64748c();
        Internal.m80732a(collection);
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i = booleanArrayList.f56614d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f56614d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f56613c;
            if (i3 > zArr.length) {
                this.f56613c = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(booleanArrayList.f56613c, 0, this.f56613c, this.f56614d, booleanArrayList.f56614d);
            this.f56614d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i, Boolean bool) {
        m79738h(i, bool.booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.f56614d != booleanArrayList.f56614d) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f56613c;
        for (int i = 0; i < this.f56614d; i++) {
            if (this.f56613c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Boolean bool) {
        mo64893i(bool.booleanValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56614d; i2++) {
            i = (i * 31) + Internal.m80734c(this.f56613c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public void mo64893i(boolean z) {
        mo64748c();
        int i = this.f56614d;
        boolean[] zArr = this.f56613c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f56613c = zArr2;
        }
        boolean[] zArr3 = this.f56613c;
        int i2 = this.f56614d;
        this.f56614d = i2 + 1;
        zArr3[i2] = z;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f56613c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public Boolean get(int i) {
        return Boolean.valueOf(mo64896l(i));
    }

    /* renamed from: l */
    public boolean mo64896l(int i) {
        m79739j(i);
        return this.f56613c[i];
    }

    /* renamed from: n */
    public Internal.BooleanList mo64901q1(int i) {
        if (i >= this.f56614d) {
            return new BooleanArrayList(Arrays.copyOf(this.f56613c, i), this.f56614d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: o */
    public Boolean remove(int i) {
        mo64748c();
        m79739j(i);
        boolean[] zArr = this.f56613c;
        boolean z = zArr[i];
        int i2 = this.f56614d;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f56614d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: p */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo64900q(i, bool.booleanValue()));
    }

    /* renamed from: q */
    public boolean mo64900q(int i, boolean z) {
        mo64748c();
        m79739j(i);
        boolean[] zArr = this.f56613c;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo64748c();
        if (i2 >= i) {
            boolean[] zArr = this.f56613c;
            System.arraycopy(zArr, i2, zArr, i, this.f56614d - i2);
            this.f56614d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f56614d;
    }

    private BooleanArrayList(boolean[] zArr, int i) {
        this.f56613c = zArr;
        this.f56614d = i;
    }
}
