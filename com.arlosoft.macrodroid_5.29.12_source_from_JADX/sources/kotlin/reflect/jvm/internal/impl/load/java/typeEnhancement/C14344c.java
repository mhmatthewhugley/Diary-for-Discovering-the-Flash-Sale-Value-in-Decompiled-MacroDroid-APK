package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c */
/* compiled from: typeEnhancement.kt */
final class C14344c implements C13921g {

    /* renamed from: a */
    private final C16152c f63119a;

    public C14344c(C16152c cVar) {
        C13706o.m87929f(cVar, "fqNameToMatch");
        this.f63119a = cVar;
    }

    /* renamed from: c */
    public C14343b mo72247H(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        if (C13706o.m87924a(cVar, this.f63119a)) {
            return C14343b.f63118a;
        }
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<C13915c> iterator() {
        return C13614t.m87748j().iterator();
    }

    /* renamed from: n1 */
    public boolean mo72249n1(C16152c cVar) {
        return C13921g.C13924b.m88505b(this, cVar);
    }
}
