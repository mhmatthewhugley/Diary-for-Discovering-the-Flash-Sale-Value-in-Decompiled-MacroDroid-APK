package p126l4;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p126l4.C7682l;

/* renamed from: l4.g */
/* compiled from: GroupedLinkedMap */
class C7672g<K extends C7682l, V> {

    /* renamed from: a */
    private final C7673a<K, V> f18582a = new C7673a<>();

    /* renamed from: b */
    private final Map<K, C7673a<K, V>> f18583b = new HashMap();

    /* renamed from: l4.g$a */
    /* compiled from: GroupedLinkedMap */
    private static class C7673a<K, V> {

        /* renamed from: a */
        final K f18584a;

        /* renamed from: b */
        private List<V> f18585b;

        /* renamed from: c */
        C7673a<K, V> f18586c;

        /* renamed from: d */
        C7673a<K, V> f18587d;

        C7673a() {
            this((Object) null);
        }

        /* renamed from: a */
        public void mo37701a(V v) {
            if (this.f18585b == null) {
                this.f18585b = new ArrayList();
            }
            this.f18585b.add(v);
        }

        @Nullable
        /* renamed from: b */
        public V mo37702b() {
            int c = mo37703c();
            if (c > 0) {
                return this.f18585b.remove(c - 1);
            }
            return null;
        }

        /* renamed from: c */
        public int mo37703c() {
            List<V> list = this.f18585b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        C7673a(K k) {
            this.f18587d = this;
            this.f18586c = this;
            this.f18584a = k;
        }
    }

    C7672g() {
    }

    /* renamed from: b */
    private void m31976b(C7673a<K, V> aVar) {
        m31978e(aVar);
        C7673a<K, V> aVar2 = this.f18582a;
        aVar.f18587d = aVar2;
        aVar.f18586c = aVar2.f18586c;
        m31979g(aVar);
    }

    /* renamed from: c */
    private void m31977c(C7673a<K, V> aVar) {
        m31978e(aVar);
        C7673a<K, V> aVar2 = this.f18582a;
        aVar.f18587d = aVar2.f18587d;
        aVar.f18586c = aVar2;
        m31979g(aVar);
    }

    /* renamed from: e */
    private static <K, V> void m31978e(C7673a<K, V> aVar) {
        C7673a<K, V> aVar2 = aVar.f18587d;
        aVar2.f18586c = aVar.f18586c;
        aVar.f18586c.f18587d = aVar2;
    }

    /* renamed from: g */
    private static <K, V> void m31979g(C7673a<K, V> aVar) {
        aVar.f18586c.f18587d = aVar;
        aVar.f18587d.f18586c = aVar;
    }

    @Nullable
    /* renamed from: a */
    public V mo37697a(K k) {
        C7673a aVar = this.f18583b.get(k);
        if (aVar == null) {
            aVar = new C7673a(k);
            this.f18583b.put(k, aVar);
        } else {
            k.mo37706a();
        }
        m31976b(aVar);
        return aVar.mo37702b();
    }

    /* renamed from: d */
    public void mo37698d(K k, V v) {
        C7673a aVar = this.f18583b.get(k);
        if (aVar == null) {
            aVar = new C7673a(k);
            m31977c(aVar);
            this.f18583b.put(k, aVar);
        } else {
            k.mo37706a();
        }
        aVar.mo37701a(v);
    }

    @Nullable
    /* renamed from: f */
    public V mo37699f() {
        for (C7673a<K, V> aVar = this.f18582a.f18587d; !aVar.equals(this.f18582a); aVar = aVar.f18587d) {
            V b = aVar.mo37702b();
            if (b != null) {
                return b;
            }
            m31978e(aVar);
            this.f18583b.remove(aVar.f18584a);
            ((C7682l) aVar.f18584a).mo37706a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C7673a<K, V> aVar = this.f18582a.f18586c; !aVar.equals(this.f18582a); aVar = aVar.f18586c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f18584a);
            sb.append(':');
            sb.append(aVar.mo37703c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
