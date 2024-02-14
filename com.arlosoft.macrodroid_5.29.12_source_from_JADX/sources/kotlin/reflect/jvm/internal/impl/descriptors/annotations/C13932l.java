package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C13706o;
import p362pb.C16152c;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.l */
/* compiled from: Annotations.kt */
public final class C13932l implements C13921g {

    /* renamed from: a */
    private final C13921g f62340a;

    /* renamed from: c */
    private final boolean f62341c;

    /* renamed from: d */
    private final C16265l<C16152c, Boolean> f62342d;

    public C13932l(C13921g gVar, boolean z, C16265l<? super C16152c, Boolean> lVar) {
        C13706o.m87929f(gVar, "delegate");
        C13706o.m87929f(lVar, "fqNameFilter");
        this.f62340a = gVar;
        this.f62341c = z;
        this.f62342d = lVar;
    }

    /* renamed from: c */
    private final boolean m88517c(C13915c cVar) {
        C16152c e = cVar.mo72241e();
        return e != null && this.f62342d.invoke(e).booleanValue();
    }

    /* renamed from: H */
    public C13915c mo72247H(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        if (this.f62342d.invoke(cVar).booleanValue()) {
            return this.f62340a.mo72247H(cVar);
        }
        return null;
    }

    public boolean isEmpty() {
        boolean z;
        C13921g gVar = this.f62340a;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            Iterator it = gVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m88517c((C13915c) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!this.f62341c) {
            return z;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public Iterator<C13915c> iterator() {
        C13921g gVar = this.f62340a;
        ArrayList arrayList = new ArrayList();
        for (Object next : gVar) {
            if (m88517c((C13915c) next)) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: n1 */
    public boolean mo72249n1(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        if (this.f62342d.invoke(cVar).booleanValue()) {
            return this.f62340a.mo72249n1(cVar);
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13932l(C13921g gVar, C16265l<? super C16152c, Boolean> lVar) {
        this(gVar, false, lVar);
        C13706o.m87929f(gVar, "delegate");
        C13706o.m87929f(lVar, "fqNameFilter");
    }
}
