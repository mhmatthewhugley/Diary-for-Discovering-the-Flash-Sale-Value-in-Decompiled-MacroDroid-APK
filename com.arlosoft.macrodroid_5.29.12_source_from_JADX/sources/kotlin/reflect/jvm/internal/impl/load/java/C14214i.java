package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.i */
/* compiled from: ClassicBuiltinSpecialProperties.kt */
public final class C14214i {

    /* renamed from: a */
    public static final C14214i f62922a = new C14214i();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.i$a */
    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    static final class C14215a extends C13708q implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        public static final C14215a f62923a = new C14215a();

        C14215a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf(C14214i.f62922a.mo72755b(bVar));
        }
    }

    private C14214i() {
    }

    /* renamed from: c */
    private final boolean m89792c(C13936b bVar) {
        if (C13566b0.m87414O(C14202g.f62890a.mo72733c(), C16519a.m98611d(bVar)) && bVar.mo72235g().isEmpty()) {
            return true;
        }
        if (!C13853h.m88260f0(bVar)) {
            return false;
        }
        Collection<? extends C13936b> d = bVar.mo72234d();
        C13706o.m87928e(d, "overriddenDescriptors");
        if (!d.isEmpty()) {
            for (C13936b bVar2 : d) {
                C14214i iVar = f62922a;
                C13706o.m87928e(bVar2, "it");
                if (iVar.mo72755b(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String mo72754a(C13936b bVar) {
        C16157f fVar;
        C13706o.m87929f(bVar, "<this>");
        C13853h.m88260f0(bVar);
        C13936b c = C16519a.m98610c(C16519a.m98622o(bVar), false, C14215a.f62923a, 1, (Object) null);
        if (c == null || (fVar = C14202g.f62890a.mo72731a().get(C16519a.m98615h(c))) == null) {
            return null;
        }
        return fVar.mo78583d();
    }

    /* renamed from: b */
    public final boolean mo72755b(C13936b bVar) {
        C13706o.m87929f(bVar, "callableMemberDescriptor");
        if (!C14202g.f62890a.mo72734d().contains(bVar.getName())) {
            return false;
        }
        return m89792c(bVar);
    }
}
