package p393t6;

import java.util.Hashtable;
import java.util.Set;

/* renamed from: t6.c */
/* compiled from: HashList */
public class C16576c<T> {

    /* renamed from: a */
    Hashtable<String, C16578e<T>> f67375a = new Hashtable<>();

    /* renamed from: a */
    public Set<String> mo79393a() {
        return this.f67375a.keySet();
    }

    /* renamed from: b */
    public synchronized <V> V mo79394b(String str) {
        C16578e eVar = this.f67375a.get(str);
        if (eVar == null) {
            return null;
        }
        return eVar.mo79400c();
    }

    /* renamed from: c */
    public synchronized <V> void mo79395c(String str, V v) {
        C16578e eVar = this.f67375a.get(str);
        if (eVar == null) {
            eVar = new C16578e();
            this.f67375a.put(str, eVar);
        }
        eVar.mo79401d(v);
    }
}
