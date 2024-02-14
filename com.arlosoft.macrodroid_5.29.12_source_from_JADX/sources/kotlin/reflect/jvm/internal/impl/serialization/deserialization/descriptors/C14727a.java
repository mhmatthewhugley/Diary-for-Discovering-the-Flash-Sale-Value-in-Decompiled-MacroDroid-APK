package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p362pb.C16152c;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a */
/* compiled from: DeserializedAnnotations.kt */
public class C14727a implements C13921g {

    /* renamed from: c */
    static final /* synthetic */ C16887m<Object>[] f63776c = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14727a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a */
    private final C17006i f63777a;

    public C14727a(C17012n nVar, C16254a<? extends List<? extends C13915c>> aVar) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(aVar, "compute");
        this.f63777a = nVar.mo80221f(aVar);
    }

    /* renamed from: c */
    private final List<C13915c> m91977c() {
        return (List) C17011m.m100276a(this.f63777a, this, f63776c[0]);
    }

    /* renamed from: H */
    public C13915c mo72247H(C16152c cVar) {
        return C13921g.C13924b.m88504a(this, cVar);
    }

    public boolean isEmpty() {
        return m91977c().isEmpty();
    }

    public Iterator<C13915c> iterator() {
        return m91977c().iterator();
    }

    /* renamed from: n1 */
    public boolean mo72249n1(C16152c cVar) {
        return C13921g.C13924b.m88505b(this, cVar);
    }
}
