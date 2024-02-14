package p473rx.internal.util.unsafe;

import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.c */
/* compiled from: ConcurrentSequencedCircularArrayQueue */
public abstract class C17394c<E> extends C17392a<E> {

    /* renamed from: p */
    private static final long f69156p;

    /* renamed from: s */
    private static final int f69157s;

    /* renamed from: o */
    protected final long[] f69158o;

    static {
        Class<long[]> cls = long[].class;
        Unsafe unsafe = C17417z.f69168a;
        if (8 == unsafe.arrayIndexScale(cls)) {
            int i = C17392a.f69151d;
            int i2 = i + 3;
            f69157s = i2;
            f69156p = (long) (unsafe.arrayBaseOffset(cls) + (32 << (i2 - i)));
            return;
        }
        throw new IllegalStateException("Unexpected long[] element size");
    }

    public C17394c(int i) {
        super(i);
        int i2 = (int) (this.f69154a + 1);
        this.f69158o = new long[((i2 << C17392a.f69151d) + 64)];
        for (long j = 0; j < ((long) i2); j++) {
            mo80724p(this.f69158o, mo80722n(j), j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final long mo80722n(long j) {
        return f69156p + ((j & this.f69154a) << f69157s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final long mo80723o(long[] jArr, long j) {
        return C17417z.f69168a.getLongVolatile(jArr, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo80724p(long[] jArr, long j, long j2) {
        C17417z.f69168a.putOrderedLong(jArr, j, j2);
    }
}
