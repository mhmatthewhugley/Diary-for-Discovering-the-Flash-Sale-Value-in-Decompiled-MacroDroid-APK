package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import javax.mail.UIDFolder;

@GwtCompatible
@ElementTypesAreNonnullByDefault
class ObjectCountHashMap<K> {

    /* renamed from: a */
    transient Object[] f17045a;

    /* renamed from: b */
    transient int[] f17046b;

    /* renamed from: c */
    transient int f17047c;

    /* renamed from: d */
    transient int f17048d;

    /* renamed from: e */
    private transient int[] f17049e;
    @VisibleForTesting

    /* renamed from: f */
    transient long[] f17050f;

    /* renamed from: g */
    private transient float f17051g;

    /* renamed from: h */
    private transient int f17052h;

    class MapEntry extends Multisets.AbstractEntry<K> {
        @ParametricNullness

        /* renamed from: a */
        final K f17053a;

        /* renamed from: c */
        int f17054c;

        MapEntry(int i) {
            this.f17053a = ObjectCountHashMap.this.f17045a[i];
            this.f17054c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36264a() {
            int i = this.f17054c;
            if (i == -1 || i >= ObjectCountHashMap.this.mo36246C() || !Objects.m5349a(this.f17053a, ObjectCountHashMap.this.f17045a[this.f17054c])) {
                this.f17054c = ObjectCountHashMap.this.mo36254m(this.f17053a);
            }
        }

        @ParametricNullness
        /* renamed from: b */
        public K mo35049b() {
            return this.f17053a;
        }

        public int getCount() {
            mo36264a();
            int i = this.f17054c;
            if (i == -1) {
                return 0;
            }
            return ObjectCountHashMap.this.f17046b[i];
        }
    }

    ObjectCountHashMap() {
        mo36255n(3, 1.0f);
    }

    /* renamed from: A */
    private void m28475A(int i) {
        if (this.f17049e.length >= 1073741824) {
            this.f17052h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f17051g)) + 1;
        int[] r = m28483r(i);
        long[] jArr = this.f17050f;
        int length = r.length - 1;
        for (int i3 = 0; i3 < this.f17047c; i3++) {
            int h = m28479h(jArr[i3]);
            int i4 = h & length;
            int i5 = r[i4];
            r[i4] = i3;
            jArr[i3] = (((long) h) << 32) | (((long) i5) & UIDFolder.MAXUID);
        }
        this.f17052h = i2;
        this.f17049e = r;
    }

    /* renamed from: D */
    private static long m28476D(long j, int i) {
        return (j & -4294967296L) | (((long) i) & UIDFolder.MAXUID);
    }

    /* renamed from: b */
    static <K> ObjectCountHashMap<K> m28477b() {
        return new ObjectCountHashMap<>();
    }

    /* renamed from: c */
    static <K> ObjectCountHashMap<K> m28478c(int i) {
        return new ObjectCountHashMap<>(i);
    }

    /* renamed from: h */
    private static int m28479h(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: j */
    private static int m28480j(long j) {
        return (int) j;
    }

    /* renamed from: l */
    private int m28481l() {
        return this.f17049e.length - 1;
    }

    /* renamed from: q */
    private static long[] m28482q(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: r */
    private static int[] m28483r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: w */
    private int m28484w(Object obj, int i) {
        int l = m28481l() & i;
        int i2 = this.f17049e[l];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (m28479h(this.f17050f[i2]) != i || !Objects.m5349a(obj, this.f17045a[i2])) {
                int j = m28480j(this.f17050f[i2]);
                if (j == -1) {
                    return 0;
                }
                int i4 = j;
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f17046b[i2];
                if (i3 == -1) {
                    this.f17049e[l] = m28480j(this.f17050f[i2]);
                } else {
                    long[] jArr = this.f17050f;
                    jArr[i3] = m28476D(jArr[i3], m28480j(jArr[i2]));
                }
                mo36257p(i2);
                this.f17047c--;
                this.f17048d++;
                return i5;
            }
        }
    }

    /* renamed from: z */
    private void m28485z(int i) {
        int length = this.f17050f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                mo36263y(max);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo36245B(int i, int i2) {
        Preconditions.m5390q(i, this.f17047c);
        this.f17046b[i] = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo36246C() {
        return this.f17047c;
    }

    /* renamed from: a */
    public void mo36247a() {
        this.f17048d++;
        Arrays.fill(this.f17045a, 0, this.f17047c, (Object) null);
        Arrays.fill(this.f17046b, 0, this.f17047c, 0);
        Arrays.fill(this.f17049e, -1);
        Arrays.fill(this.f17050f, -1);
        this.f17047c = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo36248d(int i) {
        if (i > this.f17050f.length) {
            mo36263y(i);
        }
        if (i >= this.f17052h) {
            m28475A(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo36249e() {
        return this.f17047c == 0 ? -1 : 0;
    }

    /* renamed from: f */
    public int mo36250f(Object obj) {
        int m = mo36254m(obj);
        if (m == -1) {
            return 0;
        }
        return this.f17046b[m];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Multiset.Entry<K> mo36251g(int i) {
        Preconditions.m5390q(i, this.f17047c);
        return new MapEntry(i);
    }

    /* access modifiers changed from: package-private */
    @ParametricNullness
    /* renamed from: i */
    public K mo36252i(int i) {
        Preconditions.m5390q(i, this.f17047c);
        return this.f17045a[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo36253k(int i) {
        Preconditions.m5390q(i, this.f17047c);
        return this.f17046b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo36254m(Object obj) {
        int d = Hashing.m27250d(obj);
        int i = this.f17049e[m28481l() & d];
        while (i != -1) {
            long j = this.f17050f[i];
            if (m28479h(j) == d && Objects.m5349a(obj, this.f17045a[i])) {
                return i;
            }
            i = m28480j(j);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo36255n(int i, float f) {
        boolean z = false;
        Preconditions.m5378e(i >= 0, "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z = true;
        }
        Preconditions.m5378e(z, "Illegal load factor");
        int a = Hashing.m27247a(i, (double) f);
        this.f17049e = m28483r(a);
        this.f17051g = f;
        this.f17045a = new Object[i];
        this.f17046b = new int[i];
        this.f17050f = m28482q(i);
        this.f17052h = Math.max(1, (int) (((float) a) * f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo36256o(int i, @ParametricNullness K k, int i2, int i3) {
        this.f17050f[i] = (((long) i3) << 32) | UIDFolder.MAXUID;
        this.f17045a[i] = k;
        this.f17046b[i] = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo36257p(int i) {
        int C = mo36246C() - 1;
        if (i < C) {
            Object[] objArr = this.f17045a;
            objArr[i] = objArr[C];
            int[] iArr = this.f17046b;
            iArr[i] = iArr[C];
            objArr[C] = null;
            iArr[C] = 0;
            long[] jArr = this.f17050f;
            long j = jArr[C];
            jArr[i] = j;
            jArr[C] = -1;
            int h = m28479h(j) & m28481l();
            int[] iArr2 = this.f17049e;
            int i2 = iArr2[h];
            if (i2 == C) {
                iArr2[h] = i;
                return;
            }
            while (true) {
                long j2 = this.f17050f[i2];
                int j3 = m28480j(j2);
                if (j3 == C) {
                    this.f17050f[i2] = m28476D(j2, i);
                    return;
                }
                i2 = j3;
            }
        } else {
            this.f17045a[i] = null;
            this.f17046b[i] = 0;
            this.f17050f[i] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo36258s(int i) {
        int i2 = i + 1;
        if (i2 < this.f17047c) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo36259t(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    /* renamed from: u */
    public int mo36260u(@ParametricNullness K k, int i) {
        CollectPreconditions.m26537d(i, "count");
        long[] jArr = this.f17050f;
        Object[] objArr = this.f17045a;
        int[] iArr = this.f17046b;
        int d = Hashing.m27250d(k);
        int l = m28481l() & d;
        int i2 = this.f17047c;
        int[] iArr2 = this.f17049e;
        int i3 = iArr2[l];
        if (i3 == -1) {
            iArr2[l] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m28479h(j) != d || !Objects.m5349a(k, objArr[i3])) {
                    int j2 = m28480j(j);
                    if (j2 == -1) {
                        jArr[i3] = m28476D(j, i2);
                        break;
                    }
                    i3 = j2;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            m28485z(i5);
            mo36256o(i2, k, i, d);
            this.f17047c = i5;
            if (i2 >= this.f17052h) {
                m28475A(this.f17049e.length * 2);
            }
            this.f17048d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @CanIgnoreReturnValue
    /* renamed from: v */
    public int mo36261v(Object obj) {
        return m28484w(obj, Hashing.m27250d(obj));
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: x */
    public int mo36262x(int i) {
        return m28484w(this.f17045a[i], m28479h(this.f17050f[i]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo36263y(int i) {
        this.f17045a = Arrays.copyOf(this.f17045a, i);
        this.f17046b = Arrays.copyOf(this.f17046b, i);
        long[] jArr = this.f17050f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f17050f = copyOf;
    }

    ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        mo36255n(objectCountHashMap.mo36246C(), 1.0f);
        int e = objectCountHashMap.mo36249e();
        while (e != -1) {
            mo36260u(objectCountHashMap.mo36252i(e), objectCountHashMap.mo36253k(e));
            e = objectCountHashMap.mo36258s(e);
        }
    }

    ObjectCountHashMap(int i) {
        this(i, 1.0f);
    }

    ObjectCountHashMap(int i, float f) {
        mo36255n(i, f);
    }
}
