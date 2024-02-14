package p280hc;

/* renamed from: hc.c */
/* compiled from: IntTree */
final class C12417c<V> {

    /* renamed from: f */
    static final C12417c<Object> f59157f = new C12417c<>();

    /* renamed from: a */
    private final long f59158a;

    /* renamed from: b */
    private final V f59159b;

    /* renamed from: c */
    private final C12417c<V> f59160c;

    /* renamed from: d */
    private final C12417c<V> f59161d;

    /* renamed from: e */
    private final int f59162e;

    private C12417c() {
        this.f59162e = 0;
        this.f59158a = 0;
        this.f59159b = null;
        this.f59160c = null;
        this.f59161d = null;
    }

    /* renamed from: c */
    private static <V> C12417c<V> m83311c(long j, V v, C12417c<V> cVar, C12417c<V> cVar2) {
        C12417c<V> cVar3 = cVar;
        int i = cVar3.f59162e;
        int i2 = cVar2.f59162e;
        if (i + i2 > 1) {
            if (i >= i2 * 5) {
                C12417c<V> cVar4 = cVar3.f59160c;
                C12417c<V> cVar5 = cVar3.f59161d;
                if (cVar5.f59162e < cVar4.f59162e * 2) {
                    long j2 = cVar3.f59158a;
                    return new C12417c(j2 + j, cVar3.f59159b, cVar4, new C12417c(-j2, v, cVar5.m83313e(cVar5.f59158a + j2), cVar2));
                }
                C12417c<V> cVar6 = cVar5.f59160c;
                C12417c<V> cVar7 = cVar5.f59161d;
                long j3 = cVar5.f59158a;
                long j4 = cVar3.f59158a + j3 + j;
                V v2 = cVar5.f59159b;
                V v3 = v2;
                C12417c cVar8 = new C12417c(-j3, cVar3.f59159b, cVar4, cVar6.m83313e(cVar6.f59158a + j3));
                long j5 = cVar3.f59158a;
                long j6 = cVar5.f59158a;
                return new C12417c(j4, v3, cVar8, new C12417c((-j5) - j6, v, cVar7.m83313e(cVar7.f59158a + j6 + j5), cVar2));
            }
            C12417c<V> cVar9 = cVar2;
            if (i2 >= i * 5) {
                C12417c<V> cVar10 = cVar9.f59160c;
                C12417c<V> cVar11 = cVar9.f59161d;
                if (cVar10.f59162e < cVar11.f59162e * 2) {
                    long j7 = cVar9.f59158a;
                    return new C12417c(j7 + j, cVar9.f59159b, new C12417c(-j7, v, cVar, cVar10.m83313e(cVar10.f59158a + j7)), cVar11);
                }
                C12417c<V> cVar12 = cVar10.f59160c;
                C12417c<V> cVar13 = cVar10.f59161d;
                long j8 = cVar10.f59158a;
                long j9 = cVar9.f59158a;
                V v4 = cVar10.f59159b;
                long j10 = j8 + j9 + j;
                C12417c cVar14 = new C12417c((-j9) - j8, v, cVar, cVar12.m83313e(cVar12.f59158a + j8 + j9));
                long j11 = cVar10.f59158a;
                return new C12417c(j10, v4, cVar14, new C12417c(-j11, cVar9.f59159b, cVar13.m83313e(cVar13.f59158a + j11), cVar11));
            }
        }
        return new C12417c(j, v, cVar, cVar2);
    }

    /* renamed from: d */
    private C12417c<V> m83312d(C12417c<V> cVar, C12417c<V> cVar2) {
        if (cVar == this.f59160c && cVar2 == this.f59161d) {
            return this;
        }
        return m83311c(this.f59158a, this.f59159b, cVar, cVar2);
    }

    /* renamed from: e */
    private C12417c<V> m83313e(long j) {
        if (this.f59162e == 0 || j == this.f59158a) {
            return this;
        }
        return new C12417c(j, this.f59159b, this.f59160c, this.f59161d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public V mo68777a(long j) {
        if (this.f59162e == 0) {
            return null;
        }
        long j2 = this.f59158a;
        if (j < j2) {
            return this.f59160c.mo68777a(j - j2);
        }
        if (j > j2) {
            return this.f59161d.mo68777a(j - j2);
        }
        return this.f59159b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12417c<V> mo68778b(long j, V v) {
        if (this.f59162e == 0) {
            return new C12417c(j, v, this, this);
        }
        long j2 = this.f59158a;
        if (j < j2) {
            return m83312d(this.f59160c.mo68778b(j - j2, v), this.f59161d);
        }
        if (j > j2) {
            return m83312d(this.f59160c, this.f59161d.mo68778b(j - j2, v));
        }
        if (v == this.f59159b) {
            return this;
        }
        return new C12417c(j, v, this.f59160c, this.f59161d);
    }

    private C12417c(long j, V v, C12417c<V> cVar, C12417c<V> cVar2) {
        this.f59158a = j;
        this.f59159b = v;
        this.f59160c = cVar;
        this.f59161d = cVar2;
        this.f59162e = cVar.f59162e + 1 + cVar2.f59162e;
    }
}
