package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.h */
/* compiled from: AnnotationsImpl.kt */
public final class C13925h implements C13921g {

    /* renamed from: a */
    private final List<C13915c> f62333a;

    public C13925h(List<? extends C13915c> list) {
        C13706o.m87929f(list, "annotations");
        this.f62333a = list;
    }

    /* renamed from: H */
    public C13915c mo72247H(C16152c cVar) {
        return C13921g.C13924b.m88504a(this, cVar);
    }

    public boolean isEmpty() {
        return this.f62333a.isEmpty();
    }

    public Iterator<C13915c> iterator() {
        return this.f62333a.iterator();
    }

    /* renamed from: n1 */
    public boolean mo72249n1(C16152c cVar) {
        return C13921g.C13924b.m88505b(this, cVar);
    }

    public String toString() {
        return this.f62333a.toString();
    }
}
