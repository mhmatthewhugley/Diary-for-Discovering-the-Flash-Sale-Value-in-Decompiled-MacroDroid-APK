package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* renamed from: o */
    private transient int[] f16526o;

    /* renamed from: p */
    private transient int[] f16527p;

    /* renamed from: s */
    private transient int f16528s;

    /* renamed from: z */
    private transient int f16529z;

    CompactLinkedHashSet() {
    }

    /* renamed from: W */
    public static <E> CompactLinkedHashSet<E> m26678W(int i) {
        return new CompactLinkedHashSet<>(i);
    }

    /* renamed from: X */
    private int m26679X(int i) {
        return m26680Y()[i] - 1;
    }

    /* renamed from: Y */
    private int[] m26680Y() {
        int[] iArr = this.f16526o;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: a0 */
    private int[] m26681a0() {
        int[] iArr = this.f16527p;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: b0 */
    private void m26682b0(int i, int i2) {
        m26680Y()[i] = i2 + 1;
    }

    /* renamed from: d0 */
    private void m26683d0(int i, int i2) {
        if (i == -2) {
            this.f16528s = i2;
        } else {
            m26684f0(i, i2);
        }
        if (i2 == -2) {
            this.f16529z = i;
        } else {
            m26682b0(i2, i);
        }
    }

    /* renamed from: f0 */
    private void m26684f0(int i, int i2) {
        m26681a0()[i] = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo34868B(int i, @ParametricNullness E e, int i2, int i3) {
        super.mo34868B(i, e, i2, i3);
        m26683d0(this.f16529z, i);
        m26683d0(i, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo34869D(int i, int i2) {
        int size = size() - 1;
        super.mo34869D(i, i2);
        m26683d0(m26679X(i), mo34884t(i));
        if (i < size) {
            m26683d0(m26679X(size), i);
            m26683d0(i, mo34884t(size));
        }
        m26680Y()[size] = 0;
        m26681a0()[size] = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo34871O(int i) {
        super.mo34871O(i);
        this.f16526o = Arrays.copyOf(m26680Y(), i);
        this.f16527p = Arrays.copyOf(m26681a0(), i);
    }

    public void clear() {
        if (!mo34870F()) {
            this.f16528s = -2;
            this.f16529z = -2;
            int[] iArr = this.f16526o;
            if (!(iArr == null || this.f16527p == null)) {
                Arrays.fill(iArr, 0, size(), 0);
                Arrays.fill(this.f16527p, 0, size(), 0);
            }
            super.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo34875f(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo34876h() {
        int h = super.mo34876h();
        this.f16526o = new int[h];
        this.f16527p = new int[h];
        return h;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: i */
    public Set<E> mo34877i() {
        Set<E> i = super.mo34877i();
        this.f16526o = null;
        this.f16527p = null;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo34881q() {
        return this.f16528s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo34884t(int i) {
        return m26681a0()[i] - 1;
    }

    public Object[] toArray() {
        return ObjectArrays.m28472h(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo34888z(int i) {
        super.mo34888z(i);
        this.f16528s = -2;
        this.f16529z = -2;
    }

    CompactLinkedHashSet(int i) {
        super(i);
    }

    public <T> T[] toArray(T[] tArr) {
        return ObjectArrays.m28473i(this, tArr);
    }
}
