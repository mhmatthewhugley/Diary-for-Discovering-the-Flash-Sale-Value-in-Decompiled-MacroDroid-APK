package p442yb;

/* renamed from: yb.l */
/* compiled from: SingleThreadValue */
class C17010l<T> {

    /* renamed from: a */
    private final T f68393a;

    /* renamed from: b */
    private final Thread f68394b = Thread.currentThread();

    C17010l(T t) {
        this.f68393a = t;
    }

    /* renamed from: a */
    public T mo80244a() {
        if (mo80245b()) {
            return this.f68393a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean mo80245b() {
        return this.f68394b == Thread.currentThread();
    }
}
