package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: f */
    private static final IntArrayList f56932f;

    /* renamed from: c */
    private int[] f56933c;

    /* renamed from: d */
    private int f56934d;

    static {
        IntArrayList intArrayList = new IntArrayList(new int[0], 0);
        f56932f = intArrayList;
        intArrayList.mo64743U();
    }

    IntArrayList() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    private void m80718i(int i, int i2) {
        int i3;
        mo64748c();
        if (i < 0 || i > (i3 = this.f56934d)) {
            throw new IndexOutOfBoundsException(m80721n(i));
        }
        int[] iArr = this.f56933c;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f56933c, i, iArr2, i + 1, this.f56934d - i);
            this.f56933c = iArr2;
        }
        this.f56933c[i] = i2;
        this.f56934d++;
        this.modCount++;
    }

    /* renamed from: j */
    public static IntArrayList m80719j() {
        return f56932f;
    }

    /* renamed from: k */
    private void m80720k(int i) {
        if (i < 0 || i >= this.f56934d) {
            throw new IndexOutOfBoundsException(m80721n(i));
        }
    }

    /* renamed from: n */
    private String m80721n(int i) {
        return "Index:" + i + ", Size:" + this.f56934d;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo64748c();
        Internal.m80732a(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i = intArrayList.f56934d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f56934d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f56933c;
            if (i3 > iArr.length) {
                this.f56933c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(intArrayList.f56933c, 0, this.f56933c, this.f56934d, intArrayList.f56934d);
            this.f56934d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i, Integer num) {
        m80718i(i, num.intValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.f56934d != intArrayList.f56934d) {
            return false;
        }
        int[] iArr = intArrayList.f56933c;
        for (int i = 0; i < this.f56934d; i++) {
            if (this.f56933c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Integer num) {
        mo65218h(num.intValue());
        return true;
    }

    /* renamed from: h */
    public void mo65218h(int i) {
        mo64748c();
        int i2 = this.f56934d;
        int[] iArr = this.f56933c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f56933c = iArr2;
        }
        int[] iArr3 = this.f56933c;
        int i3 = this.f56934d;
        this.f56934d = i3 + 1;
        iArr3[i3] = i;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56934d; i2++) {
            i = (i * 31) + this.f56933c[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f56933c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Integer get(int i) {
        return Integer.valueOf(mo65221m(i));
    }

    /* renamed from: m */
    public int mo65221m(int i) {
        m80720k(i);
        return this.f56933c[i];
    }

    /* renamed from: o */
    public Internal.IntList mo64901q1(int i) {
        if (i >= this.f56934d) {
            return new IntArrayList(Arrays.copyOf(this.f56933c, i), this.f56934d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public Integer remove(int i) {
        mo64748c();
        m80720k(i);
        int[] iArr = this.f56933c;
        int i2 = iArr[i];
        int i3 = this.f56934d;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f56934d--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: q */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo65226s(i, num.intValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo64748c();
        if (i2 >= i) {
            int[] iArr = this.f56933c;
            System.arraycopy(iArr, i2, iArr, i, this.f56934d - i2);
            this.f56934d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public int mo65226s(int i, int i2) {
        mo64748c();
        m80720k(i);
        int[] iArr = this.f56933c;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public int size() {
        return this.f56934d;
    }

    private IntArrayList(int[] iArr, int i) {
        this.f56933c = iArr;
        this.f56934d = i;
    }
}
