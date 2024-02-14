package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.mail.UIDFolder;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    @VisibleForTesting

    /* renamed from: B */
    transient long[] f16523B;

    /* renamed from: C */
    private transient int f16524C;

    /* renamed from: D */
    private transient int f16525D;
    private final boolean accessOrder;

    CompactLinkedHashMap() {
        this(3);
    }

    /* renamed from: e0 */
    public static <K, V> CompactLinkedHashMap<K, V> m26658e0() {
        return new CompactLinkedHashMap<>();
    }

    /* renamed from: f0 */
    public static <K, V> CompactLinkedHashMap<K, V> m26659f0(int i) {
        return new CompactLinkedHashMap<>(i);
    }

    /* renamed from: g0 */
    private int m26660g0(int i) {
        return ((int) (m26661h0(i) >>> 32)) - 1;
    }

    /* renamed from: h0 */
    private long m26661h0(int i) {
        return m26662i0()[i];
    }

    /* renamed from: i0 */
    private long[] m26662i0() {
        long[] jArr = this.f16523B;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    /* renamed from: k0 */
    private void m26663k0(int i, long j) {
        m26662i0()[i] = j;
    }

    /* renamed from: l0 */
    private void m26664l0(int i, int i2) {
        m26663k0(i, (m26661h0(i) & UIDFolder.MAXUID) | (((long) (i2 + 1)) << 32));
    }

    /* renamed from: m0 */
    private void m26665m0(int i, int i2) {
        if (i == -2) {
            this.f16524C = i2;
        } else {
            m26666n0(i, i2);
        }
        if (i2 == -2) {
            this.f16525D = i;
        } else {
            m26664l0(i2, i);
        }
    }

    /* renamed from: n0 */
    private void m26666n0(int i, int i2) {
        m26663k0(i, (m26661h0(i) & -4294967296L) | (((long) (i2 + 1)) & UIDFolder.MAXUID));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo34819C() {
        return this.f16524C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo34820D(int i) {
        return ((int) m26661h0(i)) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo34822H(int i) {
        super.mo34822H(i);
        this.f16524C = -2;
        this.f16525D = -2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo34823I(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        super.mo34823I(i, k, v, i2, i3);
        m26665m0(this.f16525D, i);
        m26665m0(i, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo34825N(int i, int i2) {
        int size = size() - 1;
        super.mo34825N(i, i2);
        m26665m0(m26660g0(i), mo34820D(i));
        if (i < size) {
            m26665m0(m26660g0(size), i);
            m26665m0(i, mo34820D(size));
        }
        m26663k0(size, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo34827V(int i) {
        super.mo34827V(i);
        this.f16523B = Arrays.copyOf(m26662i0(), i);
    }

    public void clear() {
        if (!mo34826O()) {
            this.f16524C = -2;
            this.f16525D = -2;
            long[] jArr = this.f16523B;
            if (jArr != null) {
                Arrays.fill(jArr, 0, size(), 0);
            }
            super.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo34836n(int i) {
        if (this.accessOrder) {
            m26665m0(m26660g0(i), mo34820D(i));
            m26665m0(this.f16525D, i);
            m26665m0(i, -2);
            mo34821F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo34837p(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo34839q() {
        int q = super.mo34839q();
        this.f16523B = new long[q];
        return q;
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: r */
    public Map<K, V> mo34840r() {
        Map<K, V> r = super.mo34840r();
        this.f16523B = null;
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Map<K, V> mo34844v(int i) {
        return new LinkedHashMap(i, 1.0f, this.accessOrder);
    }

    CompactLinkedHashMap(int i) {
        this(i, false);
    }

    CompactLinkedHashMap(int i, boolean z) {
        super(i);
        this.accessOrder = z;
    }
}
