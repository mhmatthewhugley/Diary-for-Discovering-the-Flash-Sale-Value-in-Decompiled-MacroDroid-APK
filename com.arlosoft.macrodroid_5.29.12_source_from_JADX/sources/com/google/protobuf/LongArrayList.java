package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {

    /* renamed from: f */
    private static final LongArrayList f56989f;

    /* renamed from: c */
    private long[] f56990c;

    /* renamed from: d */
    private int f56991d;

    static {
        LongArrayList longArrayList = new LongArrayList(new long[0], 0);
        f56989f = longArrayList;
        longArrayList.mo64743U();
    }

    LongArrayList() {
        this(new long[10], 0);
    }

    /* renamed from: h */
    private void m80834h(int i, long j) {
        int i2;
        mo64748c();
        if (i < 0 || i > (i2 = this.f56991d)) {
            throw new IndexOutOfBoundsException(m80837n(i));
        }
        long[] jArr = this.f56990c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f56990c, i, jArr2, i + 1, this.f56991d - i);
            this.f56990c = jArr2;
        }
        this.f56990c[i] = j;
        this.f56991d++;
        this.modCount++;
    }

    /* renamed from: j */
    public static LongArrayList m80835j() {
        return f56989f;
    }

    /* renamed from: k */
    private void m80836k(int i) {
        if (i < 0 || i >= this.f56991d) {
            throw new IndexOutOfBoundsException(m80837n(i));
        }
    }

    /* renamed from: n */
    private String m80837n(int i) {
        return "Index:" + i + ", Size:" + this.f56991d;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo64748c();
        Internal.m80732a(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i = longArrayList.f56991d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f56991d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f56990c;
            if (i3 > jArr.length) {
                this.f56990c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(longArrayList.f56990c, 0, this.f56990c, this.f56991d, longArrayList.f56991d);
            this.f56991d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public void add(int i, Long l) {
        m80834h(i, l.longValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.f56991d != longArrayList.f56991d) {
            return false;
        }
        long[] jArr = longArrayList.f56990c;
        for (int i = 0; i < this.f56991d; i++) {
            if (this.f56990c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Long l) {
        mo65308i(l.longValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f56991d; i2++) {
            i = (i * 31) + Internal.m80737f(this.f56990c[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public void mo65308i(long j) {
        mo64748c();
        int i = this.f56991d;
        long[] jArr = this.f56990c;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f56990c = jArr2;
        }
        long[] jArr3 = this.f56990c;
        int i2 = this.f56991d;
        this.f56991d = i2 + 1;
        jArr3[i2] = j;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f56990c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Long get(int i) {
        return Long.valueOf(mo65311m(i));
    }

    /* renamed from: m */
    public long mo65311m(int i) {
        m80836k(i);
        return this.f56990c[i];
    }

    /* renamed from: o */
    public Internal.LongList mo64901q1(int i) {
        if (i >= this.f56991d) {
            return new LongArrayList(Arrays.copyOf(this.f56990c, i), this.f56991d);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: p */
    public Long remove(int i) {
        mo64748c();
        m80836k(i);
        long[] jArr = this.f56990c;
        long j = jArr[i];
        int i2 = this.f56991d;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f56991d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: q */
    public Long set(int i, Long l) {
        return Long.valueOf(mo65316s(i, l.longValue()));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo64748c();
        if (i2 >= i) {
            long[] jArr = this.f56990c;
            System.arraycopy(jArr, i2, jArr, i, this.f56991d - i2);
            this.f56991d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public long mo65316s(int i, long j) {
        mo64748c();
        m80836k(i);
        long[] jArr = this.f56990c;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public int size() {
        return this.f56991d;
    }

    private LongArrayList(long[] jArr, int i) {
        this.f56990c = jArr;
        this.f56991d = i;
    }
}
