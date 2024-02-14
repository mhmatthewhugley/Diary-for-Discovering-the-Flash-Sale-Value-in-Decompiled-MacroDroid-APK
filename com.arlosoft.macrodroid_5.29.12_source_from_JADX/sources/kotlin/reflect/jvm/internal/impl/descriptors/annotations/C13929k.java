package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import p362pb.C16152c;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.k */
/* compiled from: Annotations.kt */
public final class C13929k implements C13921g {

    /* renamed from: a */
    private final List<C13921g> f62338a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.k$a */
    /* compiled from: Annotations.kt */
    static final class C13930a extends C13708q implements C16265l<C13921g, C13915c> {
        final /* synthetic */ C16152c $fqName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13930a(C16152c cVar) {
            super(1);
            this.$fqName = cVar;
        }

        /* renamed from: a */
        public final C13915c invoke(C13921g gVar) {
            C13706o.m87929f(gVar, "it");
            return gVar.mo72247H(this.$fqName);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.k$b */
    /* compiled from: Annotations.kt */
    static final class C13931b extends C13708q implements C16265l<C13921g, C15118h<? extends C13915c>> {

        /* renamed from: a */
        public static final C13931b f62339a = new C13931b();

        C13931b() {
            super(1);
        }

        /* renamed from: a */
        public final C15118h<C13915c> invoke(C13921g gVar) {
            C13706o.m87929f(gVar, "it");
            return C13566b0.m87412N(gVar);
        }
    }

    public C13929k(List<? extends C13921g> list) {
        C13706o.m87929f(list, "delegates");
        this.f62338a = list;
    }

    /* renamed from: H */
    public C13915c mo72247H(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return (C13915c) C15132p.m93488q(C15132p.m93495x(C13566b0.m87412N(this.f62338a), new C13930a(cVar)));
    }

    public boolean isEmpty() {
        List<C13921g> list = this.f62338a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C13921g isEmpty : list) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator<C13915c> iterator() {
        return C15132p.m93489r(C13566b0.m87412N(this.f62338a), C13931b.f62339a).iterator();
    }

    /* renamed from: n1 */
    public boolean mo72249n1(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        for (C13921g n1 : C13566b0.m87412N(this.f62338a)) {
            if (n1.mo72249n1(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13929k(C13921g... gVarArr) {
        this((List<? extends C13921g>) C13596m.m87610i0(gVarArr));
        C13706o.m87929f(gVarArr, "delegates");
    }
}
