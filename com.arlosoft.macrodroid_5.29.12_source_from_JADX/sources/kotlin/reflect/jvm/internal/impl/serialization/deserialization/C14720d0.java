package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13852g;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14727a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14778m;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14961p;
import kotlin.reflect.jvm.internal.impl.types.C14966q0;
import kotlin.reflect.jvm.internal.impl.types.C14969r0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14972s0;
import kotlin.reflect.jvm.internal.impl.types.C14994z0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p225cc.C11170a;
import p308kb.C13508q;
import p308kb.C13519s;
import p327mb.C15714b;
import p327mb.C15723f;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p433xa.C16878g;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0 */
/* compiled from: TypeDeserializer.kt */
public final class C14720d0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14798m f63767a;

    /* renamed from: b */
    private final C14720d0 f63768b;

    /* renamed from: c */
    private final String f63769c;

    /* renamed from: d */
    private final String f63770d;

    /* renamed from: e */
    private final C16265l<Integer, C13961h> f63771e;

    /* renamed from: f */
    private final C16265l<Integer, C13961h> f63772f;

    /* renamed from: g */
    private final Map<Integer, C13950e1> f63773g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0$a */
    /* compiled from: TypeDeserializer.kt */
    static final class C14721a extends C13708q implements C16265l<Integer, C13961h> {
        final /* synthetic */ C14720d0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14721a(C14720d0 d0Var) {
            super(1);
            this.this$0 = d0Var;
        }

        /* renamed from: a */
        public final C13961h mo73849a(int i) {
            return this.this$0.m91954d(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo73849a(((Number) obj).intValue());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0$b */
    /* compiled from: TypeDeserializer.kt */
    static final class C14722b extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ C13508q $proto;
        final /* synthetic */ C14720d0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14722b(C14720d0 d0Var, C13508q qVar) {
            super(0);
            this.this$0 = d0Var;
            this.$proto = qVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            return this.this$0.f63767a.mo73988c().mo73962d().mo73136d(this.$proto, this.this$0.f63767a.mo73992g());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0$c */
    /* compiled from: TypeDeserializer.kt */
    static final class C14723c extends C13708q implements C16265l<Integer, C13961h> {
        final /* synthetic */ C14720d0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14723c(C14720d0 d0Var) {
            super(1);
            this.this$0 = d0Var;
        }

        /* renamed from: a */
        public final C13961h mo73851a(int i) {
            return this.this$0.m91956f(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo73851a(((Number) obj).intValue());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0$d */
    /* compiled from: TypeDeserializer.kt */
    /* synthetic */ class C14724d extends C13703l implements C16265l<C16151b, C16151b> {

        /* renamed from: a */
        public static final C14724d f63774a = new C14724d();

        C14724d() {
            super(1);
        }

        public final String getName() {
            return "getOuterClassId";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C16151b.class);
        }

        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        /* renamed from: l */
        public final C16151b invoke(C16151b bVar) {
            C13706o.m87929f(bVar, "p0");
            return bVar.mo78548g();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0$e */
    /* compiled from: TypeDeserializer.kt */
    static final class C14725e extends C13708q implements C16265l<C13508q, C13508q> {
        final /* synthetic */ C14720d0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14725e(C14720d0 d0Var) {
            super(1);
            this.this$0 = d0Var;
        }

        /* renamed from: a */
        public final C13508q invoke(C13508q qVar) {
            C13706o.m87929f(qVar, "it");
            return C15723f.m95034g(qVar, this.this$0.f63767a.mo73995j());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0$f */
    /* compiled from: TypeDeserializer.kt */
    static final class C14726f extends C13708q implements C16265l<C13508q, Integer> {

        /* renamed from: a */
        public static final C14726f f63775a = new C14726f();

        C14726f() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C13508q qVar) {
            C13706o.m87929f(qVar, "it");
            return Integer.valueOf(qVar.mo71438Y());
        }
    }

    public C14720d0(C14798m mVar, C14720d0 d0Var, List<C13519s> list, String str, String str2) {
        Map<Integer, C13950e1> map;
        C13706o.m87929f(mVar, "c");
        C13706o.m87929f(list, "typeParameterProtos");
        C13706o.m87929f(str, "debugName");
        C13706o.m87929f(str2, "containerPresentableName");
        this.f63767a = mVar;
        this.f63768b = d0Var;
        this.f63769c = str;
        this.f63770d = str2;
        this.f63771e = mVar.mo73993h().mo80217b(new C14721a(this));
        this.f63772f = mVar.mo73993h().mo80217b(new C14723c(this));
        if (list.isEmpty()) {
            map = C13615t0.m87759i();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (C13519s next : list) {
                map.put(Integer.valueOf(next.mo71534P()), new C14778m(this.f63767a, next, i));
                i++;
            }
        }
        this.f63773g = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C13961h m91954d(int i) {
        C16151b a = C14823x.m92358a(this.f63767a.mo73992g(), i);
        if (a.mo78553k()) {
            return this.f63767a.mo73988c().mo73960b(a);
        }
        return C14147x.m89565b(this.f63767a.mo73988c().mo73974p(), a);
    }

    /* renamed from: e */
    private final C14951m0 m91955e(int i) {
        if (C14823x.m92358a(this.f63767a.mo73992g(), i).mo78553k()) {
            return this.f63767a.mo73988c().mo73972n().mo74008a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C13961h m91956f(int i) {
        C16151b a = C14823x.m92358a(this.f63767a.mo73992g(), i);
        if (a.mo78553k()) {
            return null;
        }
        return C14147x.m89567d(this.f63767a.mo73988c().mo73974p(), a);
    }

    /* renamed from: g */
    private final C14951m0 m91957g(C14900e0 e0Var, C14900e0 e0Var2) {
        C13853h h = C11170a.m74959h(e0Var);
        C13921g annotations = e0Var.getAnnotations();
        C14900e0 j = C13852g.m88231j(e0Var);
        List<C14900e0> e = C13852g.m88226e(e0Var);
        List<C14926g1> R = C13566b0.m87417R(C13852g.m88233l(e0Var), 1);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(R, 10));
        for (C14926g1 type : R) {
            arrayList.add(type.getType());
        }
        return C13852g.m88223b(h, annotations, j, e, arrayList, (List<C16157f>) null, e0Var2, true).mo73022U0(e0Var.mo73021O0());
    }

    /* renamed from: h */
    private final C14951m0 m91958h(C14830a1 a1Var, C14901e1 e1Var, List<? extends C14926g1> list, boolean z) {
        int size;
        int size2 = e1Var.getParameters().size() - list.size();
        C14951m0 m0Var = null;
        if (size2 == 0) {
            m0Var = m91959i(a1Var, e1Var, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            C14901e1 j = e1Var.mo72371m().mo72130X(size).mo62171j();
            C13706o.m87928e(j, "functionTypeConstructor.…on(arity).typeConstructor");
            m0Var = C14906f0.m92821i(a1Var, j, list, z, (C14849g) null, 16, (Object) null);
        }
        return m0Var == null ? C17088k.f68644a.mo80363f(C17087j.INCONSISTENT_SUSPEND_FUNCTION, list, e1Var, new String[0]) : m0Var;
    }

    /* renamed from: i */
    private final C14951m0 m91959i(C14830a1 a1Var, C14901e1 e1Var, List<? extends C14926g1> list, boolean z) {
        C14951m0 i = C14906f0.m92821i(a1Var, e1Var, list, z, (C14849g) null, 16, (Object) null);
        if (!C13852g.m88237p(i)) {
            return null;
        }
        return m91964p(i);
    }

    /* renamed from: k */
    private final C13950e1 m91960k(int i) {
        C13950e1 e1Var = this.f63773g.get(Integer.valueOf(i));
        if (e1Var != null) {
            return e1Var;
        }
        C14720d0 d0Var = this.f63768b;
        if (d0Var != null) {
            return d0Var.m91960k(i);
        }
        return null;
    }

    /* renamed from: m */
    private static final List<C13508q.C13510b> m91961m(C13508q qVar, C14720d0 d0Var) {
        List<C13508q.C13510b> Z = qVar.mo71439Z();
        C13706o.m87928e(Z, "argumentList");
        C13508q g = C15723f.m95034g(qVar, d0Var.f63767a.mo73995j());
        List<C13508q.C13510b> m = g != null ? m91961m(g, d0Var) : null;
        if (m == null) {
            m = C13614t.m87748j();
        }
        return C13566b0.m87442q0(Z, m);
    }

    /* renamed from: n */
    public static /* synthetic */ C14951m0 m91962n(C14720d0 d0Var, C13508q qVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return d0Var.mo73846l(qVar, z);
    }

    /* renamed from: o */
    private final C14830a1 m91963o(List<? extends C14994z0> list, C13921g gVar, C14901e1 e1Var, C14064m mVar) {
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C14994z0 a : list) {
            arrayList.add(a.mo74224a(gVar, e1Var, mVar));
        }
        return C14830a1.f63959c.mo74050g(C13616u.m87776w(arrayList));
    }

    /* renamed from: p */
    private final C14951m0 m91964p(C14900e0 e0Var) {
        C14900e0 type;
        C14926g1 g1Var = (C14926g1) C13566b0.m87436k0(C13852g.m88233l(e0Var));
        C16152c cVar = null;
        if (g1Var == null || (type = g1Var.getType()) == null) {
            return null;
        }
        C13961h c = type.mo73702N0().mo62183c();
        C16152c h = c != null ? C16519a.m98615h(c) : null;
        if (type.mo73700L0().size() != 1 || (!C13706o.m87924a(h, C13902k.f62191m) && !C13706o.m87924a(h, C14783e0.f63878a))) {
            return (C14951m0) e0Var;
        }
        C14900e0 type2 = ((C14926g1) C13566b0.m87446u0(type.mo73700L0())).getType();
        C13706o.m87928e(type2, "continuationArgumentType.arguments.single().type");
        C14064m e = this.f63767a.mo73990e();
        if (!(e instanceof C13908a)) {
            e = null;
        }
        C13908a aVar = (C13908a) e;
        if (aVar != null) {
            cVar = C16519a.m98611d(aVar);
        }
        if (C13706o.m87924a(cVar, C14717c0.f63762a)) {
            return m91957g(e0Var, type2);
        }
        return m91957g(e0Var, type2);
    }

    /* renamed from: r */
    private final C14926g1 m91965r(C13950e1 e1Var, C13508q.C13510b bVar) {
        if (bVar.mo71470z() != C13508q.C13510b.C13513c.STAR) {
            C14711a0 a0Var = C14711a0.f63745a;
            C13508q.C13510b.C13513c z = bVar.mo71470z();
            C13706o.m87928e(z, "typeArgumentProto.projection");
            C14970r1 c = a0Var.mo73841c(z);
            C13508q m = C15723f.m95040m(bVar, this.f63767a.mo73995j());
            if (m != null) {
                return new C14933i1(c, mo73847q(m));
            }
            return new C14933i1(C17088k.m100540d(C17087j.NO_RECORDED_TYPE, bVar.toString()));
        } else if (e1Var == null) {
            return new C14969r0(this.f63767a.mo73988c().mo73974p().mo72296m());
        } else {
            return new C14972s0(e1Var);
        }
    }

    /* renamed from: s */
    private final C14901e1 m91966s(C13508q qVar) {
        C13961h hVar;
        T t;
        if (qVar.mo71454s0()) {
            hVar = this.f63771e.invoke(Integer.valueOf(qVar.mo71440a0()));
            if (hVar == null) {
                hVar = m91967t(this, qVar, qVar.mo71440a0());
            }
        } else if (qVar.mo71431B0()) {
            hVar = m91960k(qVar.mo71450n0());
            if (hVar == null) {
                return C17088k.f68644a.mo80362e(C17087j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(qVar.mo71450n0()), this.f63770d);
            }
        } else if (qVar.mo71432C0()) {
            String string = this.f63767a.mo73992g().getString(qVar.mo71451o0());
            Iterator<T> it = mo73845j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C13706o.m87924a(((C13950e1) t).getName().mo78583d(), string)) {
                    break;
                }
            }
            hVar = (C13950e1) t;
            if (hVar == null) {
                return C17088k.f68644a.mo80362e(C17087j.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, this.f63767a.mo73990e().toString());
            }
        } else if (!qVar.mo71430A0()) {
            return C17088k.f68644a.mo80362e(C17087j.UNKNOWN_TYPE, new String[0]);
        } else {
            hVar = this.f63772f.invoke(Integer.valueOf(qVar.mo71449m0()));
            if (hVar == null) {
                hVar = m91967t(this, qVar, qVar.mo71449m0());
            }
        }
        C14901e1 j = hVar.mo62171j();
        C13706o.m87928e(j, "classifier.typeConstructor");
        return j;
    }

    /* renamed from: t */
    private static final C13948e m91967t(C14720d0 d0Var, C13508q qVar, int i) {
        C16151b a = C14823x.m92358a(d0Var.f63767a.mo73992g(), i);
        List E = C15132p.m93481E(C15132p.m93494w(C15125n.m93473h(qVar, new C14725e(d0Var)), C14726f.f63775a));
        int l = C15132p.m93483l(C15125n.m93473h(a, C14724d.f63774a));
        while (E.size() < l) {
            E.add(0);
        }
        return d0Var.f63767a.mo73988c().mo73975q().mo72552d(a, E);
    }

    /* renamed from: j */
    public final List<C13950e1> mo73845j() {
        return C13566b0.m87402F0(this.f63773g.values());
    }

    /* renamed from: l */
    public final C14951m0 mo73846l(C13508q qVar, boolean z) {
        C14951m0 m0Var;
        C14951m0 m0Var2;
        C14951m0 j;
        C13706o.m87929f(qVar, "proto");
        if (qVar.mo71454s0()) {
            m0Var = m91955e(qVar.mo71440a0());
        } else {
            m0Var = qVar.mo71430A0() ? m91955e(qVar.mo71449m0()) : null;
        }
        if (m0Var != null) {
            return m0Var;
        }
        C14901e1 s = m91966s(qVar);
        boolean z2 = true;
        if (C17088k.m100541m(s.mo62183c())) {
            return C17088k.f68644a.mo80361c(C17087j.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, s, s.toString());
        }
        C14727a aVar = new C14727a(this.f63767a.mo73993h(), new C14722b(this, qVar));
        C14830a1 o = m91963o(this.f63767a.mo73988c().mo73980v(), aVar, s, this.f63767a.mo73990e());
        List<C13508q.C13510b> m = m91961m(qVar, this);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(m, 10));
        int i = 0;
        for (T next : m) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            List<C13950e1> parameters = s.getParameters();
            C13706o.m87928e(parameters, "constructor.parameters");
            arrayList.add(m91965r((C13950e1) C13566b0.m87425Z(parameters, i), (C13508q.C13510b) next));
            i = i2;
        }
        List F0 = C13566b0.m87402F0(arrayList);
        C13961h c = s.mo62183c();
        if (!z || !(c instanceof C13947d1)) {
            Boolean g = C15714b.f65040a.mo75157d(qVar.mo71442d0());
            C13706o.m87928e(g, "SUSPEND_TYPE.get(proto.flags)");
            if (g.booleanValue()) {
                m0Var2 = m91958h(o, s, F0, qVar.mo71446i0());
            } else {
                m0Var2 = C14906f0.m92821i(o, s, F0, qVar.mo71446i0(), (C14849g) null, 16, (Object) null);
                Boolean g2 = C15714b.f65041b.mo75157d(qVar.mo71442d0());
                C13706o.m87928e(g2, "DEFINITELY_NOT_NULL_TYPE.get(proto.flags)");
                if (g2.booleanValue()) {
                    C14961p c2 = C14961p.C14962a.m93037c(C14961p.f64086f, m0Var2, false, 2, (Object) null);
                    if (c2 != null) {
                        m0Var2 = c2;
                    } else {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + m0Var2 + '\'').toString());
                    }
                }
            }
        } else {
            C14906f0 f0Var = C14906f0.f64036a;
            C14951m0 b = C14906f0.m92814b((C13947d1) c, F0);
            C14830a1 o2 = m91963o(this.f63767a.mo73988c().mo73980v(), C13921g.f62330v.mo72250a(C13566b0.m87440o0(aVar, b.getAnnotations())), s, this.f63767a.mo73990e());
            if (!C14925g0.m92874b(b) && !qVar.mo71446i0()) {
                z2 = false;
            }
            m0Var2 = b.mo73022U0(z2).mo73023V0(o2);
        }
        C13508q a = C15723f.m95028a(qVar, this.f63767a.mo73995j());
        if (!(a == null || (j = C14966q0.m93072j(m0Var2, mo73846l(a, false))) == null)) {
            m0Var2 = j;
        }
        if (!qVar.mo71454s0()) {
            return m0Var2;
        }
        return this.f63767a.mo73988c().mo73978t().mo62254a(C14823x.m92358a(this.f63767a.mo73992g(), qVar.mo71440a0()), m0Var2);
    }

    /* renamed from: q */
    public final C14900e0 mo73847q(C13508q qVar) {
        C13706o.m87929f(qVar, "proto");
        if (!qVar.mo71456u0()) {
            return mo73846l(qVar, true);
        }
        String string = this.f63767a.mo73992g().getString(qVar.mo71443e0());
        C14951m0 n = m91962n(this, qVar, false, 2, (Object) null);
        C13508q c = C15723f.m95030c(qVar, this.f63767a.mo73995j());
        C13706o.m87926c(c);
        return this.f63767a.mo73988c().mo73970l().mo73169a(qVar, string, n, m91962n(this, c, false, 2, (Object) null));
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63769c);
        if (this.f63768b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f63768b.f63769c;
        }
        sb.append(str);
        return sb.toString();
    }
}
