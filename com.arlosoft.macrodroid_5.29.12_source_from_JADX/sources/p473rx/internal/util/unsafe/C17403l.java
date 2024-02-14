package p473rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.l */
/* compiled from: SpmcArrayQueue */
abstract class C17403l<E> extends C17405n<E> {

    /* renamed from: p */
    protected static final long f69161p = C17417z.m101180a(C17403l.class, "consumerIndex");
    private volatile long consumerIndex;

    public C17403l(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo80738p(long j, long j2) {
        return C17417z.f69168a.compareAndSwapLong(this, f69161p, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final long mo80739q() {
        return this.consumerIndex;
    }
}
