package p473rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.q */
/* compiled from: SpmcArrayQueue */
abstract class C17408q<E> extends C17404m<E> {

    /* renamed from: o */
    protected static final long f69162o = C17417z.m101180a(C17408q.class, "producerIndex");
    private volatile long producerIndex;

    public C17408q(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final long mo80740n() {
        return this.producerIndex;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo80741o(long j) {
        C17417z.f69168a.putOrderedLong(this, f69162o, j);
    }
}
