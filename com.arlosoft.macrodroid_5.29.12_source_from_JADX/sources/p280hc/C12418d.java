package p280hc;

/* renamed from: hc.d */
/* compiled from: IntTreePMap */
final class C12418d<V> {

    /* renamed from: b */
    private static final C12418d<Object> f59163b = new C12418d<>(C12417c.f59157f);

    /* renamed from: a */
    private final C12417c<V> f59164a;

    private C12418d(C12417c<V> cVar) {
        this.f59164a = cVar;
    }

    /* renamed from: a */
    public static <V> C12418d<V> m83316a() {
        return f59163b;
    }

    /* renamed from: d */
    private C12418d<V> m83317d(C12417c<V> cVar) {
        if (cVar == this.f59164a) {
            return this;
        }
        return new C12418d<>(cVar);
    }

    /* renamed from: b */
    public V mo68779b(int i) {
        return this.f59164a.mo68777a((long) i);
    }

    /* renamed from: c */
    public C12418d<V> mo68780c(int i, V v) {
        return m83317d(this.f59164a.mo68778b((long) i, v));
    }
}
