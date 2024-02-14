package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0 */
/* compiled from: PackageFragmentProviderImpl.kt */
public final class C14065m0 implements C14072o0 {

    /* renamed from: a */
    private final Collection<C14050k0> f62683a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0$a */
    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class C14066a extends C13708q implements C16265l<C14050k0, C16152c> {

        /* renamed from: a */
        public static final C14066a f62684a = new C14066a();

        C14066a() {
            super(1);
        }

        /* renamed from: a */
        public final C16152c invoke(C14050k0 k0Var) {
            C13706o.m87929f(k0Var, "it");
            return k0Var.mo72551e();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.m0$b */
    /* compiled from: PackageFragmentProviderImpl.kt */
    static final class C14067b extends C13708q implements C16265l<C16152c, Boolean> {
        final /* synthetic */ C16152c $fqName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14067b(C16152c cVar) {
            super(1);
            this.$fqName = cVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C16152c cVar) {
            C13706o.m87929f(cVar, "it");
            return Boolean.valueOf(!cVar.mo78558d() && C13706o.m87924a(cVar.mo78559e(), this.$fqName));
        }
    }

    public C14065m0(Collection<? extends C14050k0> collection) {
        C13706o.m87929f(collection, "packageFragments");
        this.f62683a = collection;
    }

    /* renamed from: a */
    public boolean mo72408a(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        Collection<C14050k0> collection = this.f62683a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        for (C14050k0 e : collection) {
            if (C13706o.m87924a(e.mo72551e(), cVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public List<C14050k0> mo72409b(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        Collection<C14050k0> collection = this.f62683a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (C13706o.m87924a(((C14050k0) next).mo72551e(), cVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo72410c(C16152c cVar, Collection<C14050k0> collection) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(collection, "packageFragments");
        for (T next : this.f62683a) {
            if (C13706o.m87924a(((C14050k0) next).mo72551e(), cVar)) {
                collection.add(next);
            }
        }
    }

    /* renamed from: o */
    public Collection<C16152c> mo72411o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(lVar, "nameFilter");
        return C15132p.m93480D(C15132p.m93485n(C15132p.m93494w(C13566b0.m87412N(this.f62683a), C14066a.f62684a), new C14067b(cVar)));
    }
}
