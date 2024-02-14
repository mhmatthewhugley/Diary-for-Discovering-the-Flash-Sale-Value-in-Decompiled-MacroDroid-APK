package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13957g;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.load.java.C14406x;
import p288ib.C12513z;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.a */
/* compiled from: context.kt */
public final class C14222a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.a$a */
    /* compiled from: context.kt */
    static final class C14223a extends C13708q implements C16254a<C14406x> {
        final /* synthetic */ C13957g $containingDeclaration;
        final /* synthetic */ C14301g $this_childForClassOrPackage;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14223a(C14301g gVar, C13957g gVar2) {
            super(0);
            this.$this_childForClassOrPackage = gVar;
            this.$containingDeclaration = gVar2;
        }

        /* renamed from: a */
        public final C14406x invoke() {
            return C14222a.m89814g(this.$this_childForClassOrPackage, this.$containingDeclaration.getAnnotations());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.a$b */
    /* compiled from: context.kt */
    static final class C14224b extends C13708q implements C16254a<C14406x> {
        final /* synthetic */ C13921g $additionalAnnotations;
        final /* synthetic */ C14301g $this_copyWithNewDefaultTypeQualifiers;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14224b(C14301g gVar, C13921g gVar2) {
            super(0);
            this.$this_copyWithNewDefaultTypeQualifiers = gVar;
            this.$additionalAnnotations = gVar2;
        }

        /* renamed from: a */
        public final C14406x invoke() {
            return C14222a.m89814g(this.$this_copyWithNewDefaultTypeQualifiers, this.$additionalAnnotations);
        }
    }

    /* renamed from: a */
    private static final C14301g m89808a(C14301g gVar, C14064m mVar, C12513z zVar, int i, C13321g<C14406x> gVar2) {
        C14306k kVar;
        C14225b a = gVar.mo72914a();
        if (zVar != null) {
            kVar = new C14302h(gVar, mVar, zVar, i);
        } else {
            kVar = gVar.mo72919f();
        }
        return new C14301g(a, kVar, gVar2);
    }

    /* renamed from: b */
    public static final C14301g m89809b(C14301g gVar, C14306k kVar) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(kVar, "typeParameterResolver");
        return new C14301g(gVar.mo72914a(), kVar, gVar.mo72916c());
    }

    /* renamed from: c */
    public static final C14301g m89810c(C14301g gVar, C13957g gVar2, C12513z zVar, int i) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(gVar2, "containingDeclaration");
        return m89808a(gVar, gVar2, zVar, i, C13323i.m85668a(C13326k.f61325d, new C14223a(gVar, gVar2)));
    }

    /* renamed from: d */
    public static /* synthetic */ C14301g m89811d(C14301g gVar, C13957g gVar2, C12513z zVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            zVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m89810c(gVar, gVar2, zVar, i);
    }

    /* renamed from: e */
    public static final C14301g m89812e(C14301g gVar, C14064m mVar, C12513z zVar, int i) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(mVar, "containingDeclaration");
        C13706o.m87929f(zVar, "typeParameterOwner");
        return m89808a(gVar, mVar, zVar, i, gVar.mo72916c());
    }

    /* renamed from: f */
    public static /* synthetic */ C14301g m89813f(C14301g gVar, C14064m mVar, C12513z zVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m89812e(gVar, mVar, zVar, i);
    }

    /* renamed from: g */
    public static final C14406x m89814g(C14301g gVar, C13921g gVar2) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(gVar2, "additionalAnnotations");
        return gVar.mo72914a().mo72763a().mo72672c(gVar.mo72915b(), gVar2);
    }

    /* renamed from: h */
    public static final C14301g m89815h(C14301g gVar, C13921g gVar2) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(gVar2, "additionalAnnotations");
        return gVar2.isEmpty() ? gVar : new C14301g(gVar.mo72914a(), gVar.mo72919f(), C13323i.m85668a(C13326k.f61325d, new C14224b(gVar, gVar2)));
    }

    /* renamed from: i */
    public static final C14301g m89816i(C14301g gVar, C14225b bVar) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(bVar, "components");
        return new C14301g(bVar, gVar.mo72919f(), gVar.mo72916c());
    }
}
