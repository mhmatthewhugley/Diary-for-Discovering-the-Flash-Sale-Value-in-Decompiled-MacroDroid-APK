package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import javax.mail.UIDFolder;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {
    @VisibleForTesting

    /* renamed from: i */
    transient long[] f17056i;

    /* renamed from: j */
    private transient int f17057j;

    /* renamed from: k */
    private transient int f17058k;

    ObjectCountLinkedHashMap() {
        this(3);
    }

    /* renamed from: E */
    private int m28507E(int i) {
        return (int) (this.f17056i[i] >>> 32);
    }

    /* renamed from: F */
    private int m28508F(int i) {
        return (int) this.f17056i[i];
    }

    /* renamed from: G */
    private void m28509G(int i, int i2) {
        long[] jArr = this.f17056i;
        jArr[i] = (jArr[i] & UIDFolder.MAXUID) | (((long) i2) << 32);
    }

    /* renamed from: H */
    private void m28510H(int i, int i2) {
        if (i == -2) {
            this.f17057j = i2;
        } else {
            m28511I(i, i2);
        }
        if (i2 == -2) {
            this.f17058k = i;
        } else {
            m28509G(i2, i);
        }
    }

    /* renamed from: I */
    private void m28511I(int i, int i2) {
        long[] jArr = this.f17056i;
        jArr[i] = (jArr[i] & -4294967296L) | (((long) i2) & UIDFolder.MAXUID);
    }

    /* renamed from: a */
    public void mo36247a() {
        super.mo36247a();
        this.f17057j = -2;
        this.f17058k = -2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo36249e() {
        int i = this.f17057j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo36255n(int i, float f) {
        super.mo36255n(i, f);
        this.f17057j = -2;
        this.f17058k = -2;
        long[] jArr = new long[i];
        this.f17056i = jArr;
        Arrays.fill(jArr, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo36256o(int i, @ParametricNullness K k, int i2, int i3) {
        super.mo36256o(i, k, i2, i3);
        m28510H(this.f17058k, i);
        m28510H(i, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo36257p(int i) {
        int C = mo36246C() - 1;
        m28510H(m28507E(i), m28508F(i));
        if (i < C) {
            m28510H(m28507E(C), i);
            m28510H(i, m28508F(C));
        }
        super.mo36257p(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo36258s(int i) {
        int F = m28508F(i);
        if (F == -2) {
            return -1;
        }
        return F;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo36259t(int i, int i2) {
        return i == mo36246C() ? i2 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo36263y(int i) {
        super.mo36263y(i);
        long[] jArr = this.f17056i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.f17056i = copyOf;
        Arrays.fill(copyOf, length, i, -1);
    }

    ObjectCountLinkedHashMap(int i) {
        this(i, 1.0f);
    }

    ObjectCountLinkedHashMap(int i, float f) {
        super(i, f);
    }
}
