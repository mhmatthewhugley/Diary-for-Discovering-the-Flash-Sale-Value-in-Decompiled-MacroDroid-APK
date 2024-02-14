package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14475y;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.z */
/* compiled from: methodSignatureMapping.kt */
public final class C14477z implements C14475y<C14446l> {

    /* renamed from: a */
    public static final C14477z f63316a = new C14477z();

    private C14477z() {
    }

    /* renamed from: b */
    public String mo73228b(C13948e eVar) {
        return C14475y.C14476a.m90714a(this, eVar);
    }

    /* renamed from: c */
    public String mo73229c(C13948e eVar) {
        C13706o.m87929f(eVar, "classDescriptor");
        return null;
    }

    /* renamed from: d */
    public C14900e0 mo73230d(C14900e0 e0Var) {
        return C14475y.C14476a.m90715b(this, e0Var);
    }

    /* renamed from: e */
    public void mo73231e(C14900e0 e0Var, C13948e eVar) {
        C13706o.m87929f(e0Var, "kotlinType");
        C13706o.m87929f(eVar, "descriptor");
    }

    /* renamed from: f */
    public C14900e0 mo73232f(Collection<? extends C14900e0> collection) {
        C13706o.m87929f(collection, "types");
        throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + C13566b0.m87432g0(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null));
    }

    /* renamed from: g */
    public C14446l mo73227a(C13948e eVar) {
        C13706o.m87929f(eVar, "classDescriptor");
        return null;
    }
}
