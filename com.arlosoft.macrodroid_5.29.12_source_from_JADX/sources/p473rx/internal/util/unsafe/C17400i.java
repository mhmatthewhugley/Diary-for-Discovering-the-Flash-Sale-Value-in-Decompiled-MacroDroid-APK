package p473rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.i */
/* compiled from: MpmcArrayQueue */
abstract class C17400i<E> extends C17398g<E> {

    /* renamed from: z */
    private static final long f69160z = C17417z.m101180a(C17400i.class, "producerIndex");
    private volatile long producerIndex;

    public C17400i(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final boolean mo80732q(long j, long j2) {
        return C17417z.f69168a.compareAndSwapLong(this, f69160z, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final long mo80733s() {
        return this.producerIndex;
    }
}
