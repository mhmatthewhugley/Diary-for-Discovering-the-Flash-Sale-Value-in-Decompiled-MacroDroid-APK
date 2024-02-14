package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13941c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p370qa.C16269p;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.b */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class C14597b {

    /* renamed from: a */
    public static final C14597b f63599a = new C14597b();

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.b$a */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C14598a extends C13708q implements C16269p<C14064m, C14064m, Boolean> {

        /* renamed from: a */
        public static final C14598a f63600a = new C14598a();

        C14598a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C14064m mVar, C14064m mVar2) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.b$b */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C14599b implements C14844e.C14845a {

        /* renamed from: a */
        final /* synthetic */ boolean f63601a;

        /* renamed from: b */
        final /* synthetic */ C13908a f63602b;

        /* renamed from: c */
        final /* synthetic */ C13908a f63603c;

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.b$b$a */
        /* compiled from: DescriptorEquivalenceForOverrides.kt */
        static final class C14600a extends C13708q implements C16269p<C14064m, C14064m, Boolean> {

            /* renamed from: $a */
            final /* synthetic */ C13908a f63604$a;

            /* renamed from: $b */
            final /* synthetic */ C13908a f63605$b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14600a(C13908a aVar, C13908a aVar2) {
                super(2);
                this.f63604$a = aVar;
                this.f63605$b = aVar2;
            }

            /* renamed from: a */
            public final Boolean invoke(C14064m mVar, C14064m mVar2) {
                return Boolean.valueOf(C13706o.m87924a(mVar, this.f63604$a) && C13706o.m87924a(mVar2, this.f63605$b));
            }
        }

        C14599b(boolean z, C13908a aVar, C13908a aVar2) {
            this.f63601a = z;
            this.f63602b = aVar;
            this.f63603c = aVar2;
        }

        /* renamed from: a */
        public final boolean mo73697a(C14901e1 e1Var, C14901e1 e1Var2) {
            C13706o.m87929f(e1Var, "c1");
            C13706o.m87929f(e1Var2, "c2");
            if (C13706o.m87924a(e1Var, e1Var2)) {
                return true;
            }
            C13961h c = e1Var.mo62183c();
            C13961h c2 = e1Var2.mo62183c();
            if (!(c instanceof C13950e1) || !(c2 instanceof C13950e1)) {
                return false;
            }
            return C14597b.f63599a.mo73695g((C13950e1) c, (C13950e1) c2, this.f63601a, new C14600a(this.f63602b, this.f63603c));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.b$c */
    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    static final class C14601c extends C13708q implements C16269p<C14064m, C14064m, Boolean> {

        /* renamed from: a */
        public static final C14601c f63606a = new C14601c();

        C14601c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C14064m mVar, C14064m mVar2) {
            return Boolean.FALSE;
        }
    }

    private C14597b() {
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m91455b(C14597b bVar, C13908a aVar, C13908a aVar2, boolean z, boolean z2, boolean z3, C14849g gVar, int i, Object obj) {
        return bVar.mo73692a(aVar, aVar2, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, gVar);
    }

    /* renamed from: c */
    private final boolean m91456c(C13948e eVar, C13948e eVar2) {
        return C13706o.m87924a(eVar.mo62171j(), eVar2.mo62171j());
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m91457e(C14597b bVar, C14064m mVar, C14064m mVar2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return bVar.mo73693d(mVar, mVar2, z, z2);
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m91458h(C14597b bVar, C13950e1 e1Var, C13950e1 e1Var2, boolean z, C16269p pVar, int i, Object obj) {
        if ((i & 8) != 0) {
            pVar = C14601c.f63606a;
        }
        return bVar.mo73695g(e1Var, e1Var2, z, pVar);
    }

    /* renamed from: i */
    private final boolean m91459i(C14064m mVar, C14064m mVar2, C16269p<? super C14064m, ? super C14064m, Boolean> pVar, boolean z) {
        C14064m b = mVar.mo62163b();
        C14064m b2 = mVar2.mo62163b();
        if ((b instanceof C13936b) || (b2 instanceof C13936b)) {
            return pVar.invoke(b, b2).booleanValue();
        }
        return m91457e(this, b, b2, z, false, 8, (Object) null);
    }

    /* renamed from: j */
    private final C14158z0 m91460j(C13908a aVar) {
        while (aVar instanceof C13936b) {
            C13936b bVar = (C13936b) aVar;
            if (bVar.mo72264h() != C13936b.C13937a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends C13936b> d = bVar.mo72234d();
            C13706o.m87928e(d, "overriddenDescriptors");
            aVar = (C13936b) C13566b0.m87447v0(d);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }

    /* renamed from: a */
    public final boolean mo73692a(C13908a aVar, C13908a aVar2, boolean z, boolean z2, boolean z3, C14849g gVar) {
        C13706o.m87929f(aVar, "a");
        C13706o.m87929f(aVar2, "b");
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        if (C13706o.m87924a(aVar, aVar2)) {
            return true;
        }
        if (!C13706o.m87924a(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z2 && (aVar instanceof C13941c0) && (aVar2 instanceof C13941c0) && ((C13941c0) aVar).mo62175l0() != ((C13941c0) aVar2).mo62175l0()) {
            return false;
        }
        if ((C13706o.m87924a(aVar.mo62163b(), aVar2.mo62163b()) && (!z || !C13706o.m87924a(m91460j(aVar), m91460j(aVar2)))) || C14650d.m91605E(aVar) || C14650d.m91605E(aVar2) || !m91459i(aVar, aVar2, C14598a.f63600a, z)) {
            return false;
        }
        C14658j i = C14658j.m91674i(gVar, new C14599b(z, aVar, aVar2));
        C13706o.m87928e(i, "a: CallableDescriptor,\n …= a && y == b }\n        }");
        C14658j.C14667i.C14668a c = i.mo73769E(aVar, aVar2, (C13948e) null, !z3).mo73778c();
        C14658j.C14667i.C14668a aVar3 = C14658j.C14667i.C14668a.OVERRIDABLE;
        if (c == aVar3 && i.mo73769E(aVar2, aVar, (C13948e) null, !z3).mo73778c() == aVar3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo73693d(C14064m mVar, C14064m mVar2, boolean z, boolean z2) {
        if ((mVar instanceof C13948e) && (mVar2 instanceof C13948e)) {
            return m91456c((C13948e) mVar, (C13948e) mVar2);
        }
        if ((mVar instanceof C13950e1) && (mVar2 instanceof C13950e1)) {
            return m91458h(this, (C13950e1) mVar, (C13950e1) mVar2, z, (C16269p) null, 8, (Object) null);
        } else if ((mVar instanceof C13908a) && (mVar2 instanceof C13908a)) {
            return m91455b(this, (C13908a) mVar, (C13908a) mVar2, z, z2, false, C14849g.C14850a.f63969a, 16, (Object) null);
        } else if (!(mVar instanceof C14050k0) || !(mVar2 instanceof C14050k0)) {
            return C13706o.m87924a(mVar, mVar2);
        } else {
            return C13706o.m87924a(((C14050k0) mVar).mo72551e(), ((C14050k0) mVar2).mo72551e());
        }
    }

    /* renamed from: f */
    public final boolean mo73694f(C13950e1 e1Var, C13950e1 e1Var2, boolean z) {
        C13706o.m87929f(e1Var, "a");
        C13706o.m87929f(e1Var2, "b");
        return m91458h(this, e1Var, e1Var2, z, (C16269p) null, 8, (Object) null);
    }

    /* renamed from: g */
    public final boolean mo73695g(C13950e1 e1Var, C13950e1 e1Var2, boolean z, C16269p<? super C14064m, ? super C14064m, Boolean> pVar) {
        C13706o.m87929f(e1Var, "a");
        C13706o.m87929f(e1Var2, "b");
        C13706o.m87929f(pVar, "equivalentCallables");
        if (C13706o.m87924a(e1Var, e1Var2)) {
            return true;
        }
        if (!C13706o.m87924a(e1Var.mo62163b(), e1Var2.mo62163b()) && m91459i(e1Var, e1Var2, pVar, z) && e1Var.mo72272i() == e1Var2.mo72272i()) {
            return true;
        }
        return false;
    }
}
