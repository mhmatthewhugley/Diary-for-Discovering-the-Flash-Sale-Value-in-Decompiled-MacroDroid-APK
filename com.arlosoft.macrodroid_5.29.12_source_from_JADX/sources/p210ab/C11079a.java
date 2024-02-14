package p210ab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13846b;
import kotlin.reflect.jvm.internal.impl.builtins.C13851f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import p210ab.C11084c;
import p217bb.C11119b;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: ab.a */
/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
public final class C11079a implements C11119b {

    /* renamed from: a */
    private final C17012n f53986a;

    /* renamed from: b */
    private final C13958g0 f53987b;

    public C11079a(C17012n nVar, C13958g0 g0Var) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(g0Var, "module");
        this.f53986a = nVar;
        this.f53987b = g0Var;
    }

    /* renamed from: a */
    public Collection<C13948e> mo62146a(C16152c cVar) {
        C13706o.m87929f(cVar, "packageFqName");
        return C13627z0.m87806d();
    }

    /* renamed from: b */
    public C13948e mo62147b(C16151b bVar) {
        C13706o.m87929f(bVar, "classId");
        if (bVar.mo78553k() || bVar.mo78554l()) {
            return null;
        }
        String b = bVar.mo78551i().mo78556b();
        C13706o.m87928e(b, "classId.relativeClassName.asString()");
        if (!C15177w.m93663N(b, "Function", false, 2, (Object) null)) {
            return null;
        }
        C16152c h = bVar.mo78549h();
        C13706o.m87928e(h, "classId.packageFqName");
        C11084c.C11085a.C11086a c = C11084c.f54000a.mo62196c(b, h);
        if (c == null) {
            return null;
        }
        C11084c a = c.mo62197a();
        int b2 = c.mo62198b();
        List<C14050k0> i0 = this.f53987b.mo72295V(h).mo72522i0();
        ArrayList arrayList = new ArrayList();
        for (T next : i0) {
            if (next instanceof C13846b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (next2 instanceof C13851f) {
                arrayList2.add(next2);
            }
        }
        C14050k0 k0Var = (C13851f) C13566b0.m87424Y(arrayList2);
        if (k0Var == null) {
            k0Var = (C13846b) C13566b0.m87422W(arrayList);
        }
        return new C11080b(this.f53986a, k0Var, a, b2);
    }

    /* renamed from: c */
    public boolean mo62148c(C16152c cVar, C16157f fVar) {
        C13706o.m87929f(cVar, "packageFqName");
        C13706o.m87929f(fVar, "name");
        String d = fVar.mo78583d();
        C13706o.m87928e(d, "name.asString()");
        if ((C15176v.m93634I(d, "Function", false, 2, (Object) null) || C15176v.m93634I(d, "KFunction", false, 2, (Object) null) || C15176v.m93634I(d, "SuspendFunction", false, 2, (Object) null) || C15176v.m93634I(d, "KSuspendFunction", false, 2, (Object) null)) && C11084c.f54000a.mo62196c(d, cVar) != null) {
            return true;
        }
        return false;
    }
}
