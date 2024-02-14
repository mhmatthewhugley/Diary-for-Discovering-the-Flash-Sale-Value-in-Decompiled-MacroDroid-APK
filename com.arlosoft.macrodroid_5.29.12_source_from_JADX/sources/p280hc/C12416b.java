package p280hc;

/* renamed from: hc.b */
/* compiled from: HashPMap */
public final class C12416b<K, V> {

    /* renamed from: c */
    private static final C12416b<Object, Object> f59154c = new C12416b<>(C12418d.m83316a(), 0);

    /* renamed from: a */
    private final C12418d<C12414a<C12419e<K, V>>> f59155a;

    /* renamed from: b */
    private final int f59156b;

    private C12416b(C12418d<C12414a<C12419e<K, V>>> dVar, int i) {
        this.f59155a = dVar;
        this.f59156b = i;
    }

    /* renamed from: a */
    private static /* synthetic */ void m83305a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    /* renamed from: b */
    public static <K, V> C12416b<K, V> m83306b() {
        C12416b<Object, Object> bVar = f59154c;
        if (bVar == null) {
            m83305a(0);
        }
        return bVar;
    }

    /* renamed from: d */
    private C12414a<C12419e<K, V>> m83307d(int i) {
        C12414a<C12419e<K, V>> b = this.f59155a.mo68779b(i);
        return b == null ? C12414a.m83299d() : b;
    }

    /* renamed from: e */
    private static <K, V> int m83308e(C12414a<C12419e<K, V>> aVar, Object obj) {
        int i = 0;
        C12414a<E> aVar2 = aVar;
        while (aVar2 != null && aVar2.size() > 0) {
            if (((C12419e) aVar2.f59150a).key.equals(obj)) {
                return i;
            }
            i++;
            aVar2 = aVar2.f59151c;
        }
        return -1;
    }

    /* renamed from: c */
    public V mo68775c(Object obj) {
        C12414a<E> d = m83307d(obj.hashCode());
        while (d != null && d.size() > 0) {
            C12419e eVar = (C12419e) d.f59150a;
            if (eVar.key.equals(obj)) {
                return eVar.value;
            }
            d = d.f59151c;
        }
        return null;
    }

    /* renamed from: f */
    public C12416b<K, V> mo68776f(K k, V v) {
        C12414a d = m83307d(k.hashCode());
        int size = d.size();
        int e = m83308e(d, k);
        if (e != -1) {
            d = d.mo68768h(e);
        }
        C12414a j = d.mo68770j(new C12419e(k, v));
        return new C12416b<>(this.f59155a.mo68780c(k.hashCode(), j), (this.f59156b - size) + j.size());
    }
}
