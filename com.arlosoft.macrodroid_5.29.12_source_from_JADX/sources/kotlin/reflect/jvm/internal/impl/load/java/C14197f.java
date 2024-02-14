package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.load.java.C14208h0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.f */
/* compiled from: specialBuiltinMembers.kt */
public final class C14197f extends C14208h0 {

    /* renamed from: n */
    public static final C14197f f62882n = new C14197f();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.f$a */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C14198a extends C13708q implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        public static final C14198a f62883a = new C14198a();

        C14198a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf(C14197f.f62882n.m89739j(bVar));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.f$b */
    /* compiled from: specialBuiltinMembers.kt */
    static final class C14199b extends C13708q implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        public static final C14199b f62884a = new C14199b();

        C14199b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C13936b bVar) {
            C13706o.m87929f(bVar, "it");
            return Boolean.valueOf((bVar instanceof C14154y) && C14197f.f62882n.m89739j(bVar));
        }
    }

    private C14197f() {
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m89739j(C13936b bVar) {
        return C13566b0.m87414O(C14208h0.f62898a.mo72741e(), C14470v.m90690d(bVar));
    }

    /* renamed from: k */
    public static final C14154y m89740k(C14154y yVar) {
        C13706o.m87929f(yVar, "functionDescriptor");
        C14197f fVar = f62882n;
        C16157f name = yVar.getName();
        C13706o.m87928e(name, "functionDescriptor.name");
        if (!fVar.mo72725l(name)) {
            return null;
        }
        return (C14154y) C16519a.m98610c(yVar, false, C14198a.f62883a, 1, (Object) null);
    }

    /* renamed from: m */
    public static final C14208h0.C14211b m89741m(C13936b bVar) {
        C13936b c;
        String d;
        C13706o.m87929f(bVar, "<this>");
        C14208h0.C14209a aVar = C14208h0.f62898a;
        if (!aVar.mo72740d().contains(bVar.getName()) || (c = C16519a.m98610c(bVar, false, C14199b.f62884a, 1, (Object) null)) == null || (d = C14470v.m90690d(c)) == null) {
            return null;
        }
        return aVar.mo72748l(d);
    }

    /* renamed from: l */
    public final boolean mo72725l(C16157f fVar) {
        C13706o.m87929f(fVar, "<this>");
        return C14208h0.f62898a.mo72740d().contains(fVar);
    }
}
