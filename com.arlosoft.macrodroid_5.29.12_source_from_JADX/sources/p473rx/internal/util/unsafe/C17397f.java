package p473rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.f */
/* compiled from: MpmcArrayQueue */
abstract class C17397f<E> extends C17399h<E> {

    /* renamed from: A */
    private static final long f69159A = C17417z.m101180a(C17397f.class, "consumerIndex");
    private volatile long consumerIndex;

    public C17397f(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo80730t(long j, long j2) {
        return C17417z.f69168a.compareAndSwapLong(this, f69159A, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final long mo80731u() {
        return this.consumerIndex;
    }
}
