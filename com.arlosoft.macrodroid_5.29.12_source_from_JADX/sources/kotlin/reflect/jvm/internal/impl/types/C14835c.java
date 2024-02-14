package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import p218bc.C11129d;
import p218bc.C11134i;
import p218bc.C11136k;
import p218bc.C11139n;
import p218bc.C11141p;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.c */
/* compiled from: AbstractTypeChecker.kt */
public final class C14835c {

    /* renamed from: a */
    public static final C14835c f63961a = new C14835c();

    private C14835c() {
    }

    /* renamed from: c */
    private final boolean m92420c(C14889d1 d1Var, C11136k kVar, C11139n nVar) {
        C11141p j = d1Var.mo74131j();
        if (j.mo62305h0(kVar)) {
            return true;
        }
        if (j.mo62332x0(kVar)) {
            return false;
        }
        if (!d1Var.mo74135n() || !j.mo62303g0(kVar)) {
            return j.mo62289X(j.mo62292b(kVar), nVar);
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m92421e(C14889d1 d1Var, C11136k kVar, C11136k kVar2) {
        C11141p j = d1Var.mo74131j();
        if (C14902f.f64033b) {
            if (!j.mo62300f(kVar) && !j.mo62317o0(j.mo62292b(kVar))) {
                boolean l = d1Var.mo74133l(kVar);
            }
            if (!j.mo62300f(kVar2)) {
                boolean l2 = d1Var.mo74133l(kVar2);
            }
        }
        if (j.mo62332x0(kVar2) || j.mo62280K(kVar) || j.mo62266A0(kVar)) {
            return true;
        }
        if ((kVar instanceof C11129d) && j.mo62288W((C11129d) kVar)) {
            return true;
        }
        C14835c cVar = f63961a;
        if (cVar.mo74053a(d1Var, kVar, C14889d1.C14893c.C14895b.f64024a)) {
            return true;
        }
        if (!j.mo62280K(kVar2) && !cVar.mo74053a(d1Var, kVar2, C14889d1.C14893c.C14897d.f64026a) && !j.mo62320q0(kVar)) {
            return cVar.mo74054b(d1Var, kVar, j.mo62292b(kVar2));
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo74053a(C14889d1 d1Var, C11136k kVar, C14889d1.C14893c cVar) {
        C14889d1 d1Var2 = d1Var;
        C11136k kVar2 = kVar;
        C13706o.m87929f(d1Var2, "<this>");
        C13706o.m87929f(kVar2, "type");
        C14889d1.C14893c cVar2 = cVar;
        C13706o.m87929f(cVar2, "supertypesPolicy");
        C11141p j = d1Var.mo74131j();
        if (!((j.mo62320q0(kVar2) && !j.mo62332x0(kVar2)) || j.mo62280K(kVar2))) {
            d1Var.mo74132k();
            ArrayDeque<C11136k> h = d1Var.mo74129h();
            C13706o.m87926c(h);
            Set<C11136k> i = d1Var.mo74130i();
            C13706o.m87926c(i);
            h.push(kVar2);
            while (!h.isEmpty()) {
                if (i.size() <= 1000) {
                    C11136k pop = h.pop();
                    C13706o.m87928e(pop, "current");
                    if (i.add(pop)) {
                        C14889d1.C14893c cVar3 = j.mo62332x0(pop) ? C14889d1.C14893c.C14896c.f64025a : cVar2;
                        if (!(!C13706o.m87924a(cVar3, C14889d1.C14893c.C14896c.f64025a))) {
                            cVar3 = null;
                        }
                        if (cVar3 == null) {
                            continue;
                        } else {
                            C11141p j2 = d1Var.mo74131j();
                            for (C11134i a : j2.mo62273E(j2.mo62292b(pop))) {
                                C11136k a2 = cVar3.mo74058a(d1Var2, a);
                                if ((j.mo62320q0(a2) && !j.mo62332x0(a2)) || j.mo62280K(a2)) {
                                    d1Var.mo74127e();
                                } else {
                                    h.add(a2);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + kVar2 + ". Supertypes = " + C13566b0.m87432g0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null)).toString());
                }
            }
            d1Var.mo74127e();
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo74054b(C14889d1 d1Var, C11136k kVar, C11139n nVar) {
        C13706o.m87929f(d1Var, "state");
        C13706o.m87929f(kVar, "start");
        C13706o.m87929f(nVar, "end");
        C11141p j = d1Var.mo74131j();
        if (f63961a.m92420c(d1Var, kVar, nVar)) {
            return true;
        }
        d1Var.mo74132k();
        ArrayDeque<C11136k> h = d1Var.mo74129h();
        C13706o.m87926c(h);
        Set<C11136k> i = d1Var.mo74130i();
        C13706o.m87926c(i);
        h.push(kVar);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                C11136k pop = h.pop();
                C13706o.m87928e(pop, "current");
                if (i.add(pop)) {
                    C14889d1.C14893c cVar = j.mo62332x0(pop) ? C14889d1.C14893c.C14896c.f64025a : C14889d1.C14893c.C14895b.f64024a;
                    if (!(!C13706o.m87924a(cVar, C14889d1.C14893c.C14896c.f64025a))) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        C11141p j2 = d1Var.mo74131j();
                        for (C11134i a : j2.mo62273E(j2.mo62292b(pop))) {
                            C11136k a2 = cVar.mo74058a(d1Var, a);
                            if (f63961a.m92420c(d1Var, a2, nVar)) {
                                d1Var.mo74127e();
                                return true;
                            }
                            h.add(a2);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + kVar + ". Supertypes = " + C13566b0.m87432g0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 63, (Object) null)).toString());
            }
        }
        d1Var.mo74127e();
        return false;
    }

    /* renamed from: d */
    public final boolean mo74055d(C14889d1 d1Var, C11136k kVar, C11136k kVar2) {
        C13706o.m87929f(d1Var, "state");
        C13706o.m87929f(kVar, "subType");
        C13706o.m87929f(kVar2, "superType");
        return m92421e(d1Var, kVar, kVar2);
    }
}
