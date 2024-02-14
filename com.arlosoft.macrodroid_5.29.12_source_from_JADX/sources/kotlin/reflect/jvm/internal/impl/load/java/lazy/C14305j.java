package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import p288ib.C12492g;
import p398tb.C16608c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.j */
/* compiled from: ModuleClassResolver.kt */
public final class C14305j implements C14304i {

    /* renamed from: a */
    public C16608c f63071a;

    /* renamed from: a */
    public C13948e mo72923a(C12492g gVar) {
        C13706o.m87929f(gVar, "javaClass");
        return mo72924b().mo79455b(gVar);
    }

    /* renamed from: b */
    public final C16608c mo72924b() {
        C16608c cVar = this.f63071a;
        if (cVar != null) {
            return cVar;
        }
        C13706o.m87945v("resolver");
        return null;
    }

    /* renamed from: c */
    public final void mo72925c(C16608c cVar) {
        C13706o.m87929f(cVar, "<set-?>");
        this.f63071a = cVar;
    }
}
