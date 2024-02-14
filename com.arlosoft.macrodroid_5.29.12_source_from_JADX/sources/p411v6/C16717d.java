package p411v6;

import java.lang.ref.Reference;
import java.util.Hashtable;

/* renamed from: v6.d */
/* compiled from: ReferenceHashtable */
public abstract class C16717d<K, V, R extends Reference<V>> {

    /* renamed from: a */
    Hashtable<K, R> f67645a = new Hashtable<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo79633a(V v);

    /* renamed from: b */
    public V mo79634b(K k, V v) {
        Reference reference = (Reference) this.f67645a.put(k, mo79633a(v));
        if (reference == null) {
            return null;
        }
        return reference.get();
    }
}
