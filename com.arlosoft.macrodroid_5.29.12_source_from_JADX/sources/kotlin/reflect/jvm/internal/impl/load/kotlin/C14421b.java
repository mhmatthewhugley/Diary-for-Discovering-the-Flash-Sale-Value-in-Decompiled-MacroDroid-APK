package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14421b.C14422a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14467t;
import kotlin.reflect.jvm.internal.impl.protobuf.C14495h;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14713b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14784f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14825z;
import org.apache.commons.p353io.FilenameUtils;
import p308kb.C13444b;
import p308kb.C13455c;
import p308kb.C13460d;
import p308kb.C13473g;
import p308kb.C13481i;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13519s;
import p308kb.C13527u;
import p327mb.C15714b;
import p327mb.C15719c;
import p327mb.C15722e;
import p327mb.C15723f;
import p327mb.C15724g;
import p336nb.C15766a;
import p349ob.C15829b;
import p349ob.C15831d;
import p349ob.C15841i;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p398tb.C16609d;
import p449za.C17075a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b */
/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
public abstract class C14421b<A, S extends C14422a<? extends A>> implements C14784f<A> {

    /* renamed from: a */
    private final C14454o f63236a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$a */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static abstract class C14422a<A> {
        /* renamed from: a */
        public abstract Map<C14467t, List<A>> mo73116a();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$b */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    private enum C14423b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$c */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public /* synthetic */ class C14424c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63241a;

        static {
            int[] iArr = new int[C14713b.values().length];
            iArr[C14713b.PROPERTY_GETTER.ordinal()] = 1;
            iArr[C14713b.PROPERTY_SETTER.ordinal()] = 2;
            iArr[C14713b.PROPERTY.ordinal()] = 3;
            f63241a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$d */
    /* compiled from: AbstractBinaryClassAnnotationLoader.kt */
    public static final class C14425d implements C14459q.C14462c {

        /* renamed from: a */
        final /* synthetic */ C14421b<A, S> f63242a;

        /* renamed from: b */
        final /* synthetic */ ArrayList<A> f63243b;

        C14425d(C14421b<A, S> bVar, ArrayList<A> arrayList) {
            this.f63242a = bVar;
            this.f63243b = arrayList;
        }

        /* renamed from: a */
        public void mo70772a() {
        }

        /* renamed from: c */
        public C14459q.C14460a mo70773c(C16151b bVar, C14158z0 z0Var) {
            C13706o.m87929f(bVar, "classId");
            C13706o.m87929f(z0Var, "source");
            return this.f63242a.mo73150y(bVar, z0Var, this.f63243b);
        }
    }

    public C14421b(C14454o oVar) {
        C13706o.m87929f(oVar, "kotlinClassFinder");
        this.f63236a = oVar;
    }

    /* renamed from: B */
    private final C14459q m90505B(C14825z.C14826a aVar) {
        C14158z0 c = aVar.mo74024c();
        C14466s sVar = c instanceof C14466s ? (C14466s) c : null;
        if (sVar != null) {
            return sVar.mo73205d();
        }
        return null;
    }

    /* renamed from: l */
    private final int m90506l(C14825z zVar, C14516o oVar) {
        if (oVar instanceof C13481i) {
            if (C15723f.m95031d((C13481i) oVar)) {
                return 1;
            }
        } else if (oVar instanceof C13494n) {
            if (C15723f.m95032e((C13494n) oVar)) {
                return 1;
            }
        } else if (oVar instanceof C13460d) {
            C13706o.m87927d(zVar, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            C14825z.C14826a aVar = (C14825z.C14826a) zVar;
            if (aVar.mo74029g() == C13455c.C13458c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.mo74031i()) {
                return 1;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + oVar.getClass());
        }
        return 0;
    }

    /* renamed from: m */
    private final List<A> m90507m(C14825z zVar, C14467t tVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        C14459q o = mo73143o(zVar, mo73147v(zVar, z, z2, bool, z3));
        if (o == null) {
            return C13614t.m87748j();
        }
        List<A> list = (List) mo73115p(o).mo73116a().get(tVar);
        return list == null ? C13614t.m87748j() : list;
    }

    /* renamed from: n */
    static /* synthetic */ List m90508n(C14421b bVar, C14825z zVar, C14467t tVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return bVar.m90507m(zVar, tVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: s */
    public static /* synthetic */ C14467t m90509s(C14421b bVar, C14516o oVar, C15719c cVar, C15724g gVar, C14713b bVar2, boolean z, int i, Object obj) {
        if (obj == null) {
            return bVar.mo73145r(oVar, cVar, gVar, bVar2, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: u */
    public static /* synthetic */ C14467t m90510u(C14421b bVar, C13494n nVar, C15719c cVar, C15724g gVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return bVar.mo73146t(nVar, cVar, gVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: z */
    private final List<A> m90511z(C14825z zVar, C13494n nVar, C14423b bVar) {
        C14423b bVar2 = bVar;
        Boolean g = C15714b.f65025A.mo75157d(nVar.mo71357e0());
        C13706o.m87928e(g, "IS_CONST.get(proto.flags)");
        boolean booleanValue = g.booleanValue();
        boolean f = C15841i.m95458f(nVar);
        if (bVar2 == C14423b.PROPERTY) {
            C14467t u = m90510u(this, nVar, zVar.mo74023b(), zVar.mo74025d(), false, true, false, 40, (Object) null);
            if (u == null) {
                return C13614t.m87748j();
            }
            return m90508n(this, zVar, u, true, false, Boolean.valueOf(booleanValue), f, 8, (Object) null);
        }
        C14467t u2 = m90510u(this, nVar, zVar.mo74023b(), zVar.mo74025d(), true, false, false, 48, (Object) null);
        if (u2 == null) {
            return C13614t.m87748j();
        }
        boolean z = false;
        boolean N = C15177w.m93663N(u2.mo73207a(), "$delegate", false, 2, (Object) null);
        if (bVar2 == C14423b.DELEGATE_FIELD) {
            z = true;
        }
        if (N != z) {
            return C13614t.m87748j();
        }
        return m90507m(zVar, u2, true, true, Boolean.valueOf(booleanValue), f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract A mo73133A(C13444b bVar, C15719c cVar);

    /* renamed from: a */
    public List<A> mo73134a(C14825z zVar, C13494n nVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        return m90511z(zVar, nVar, C14423b.DELEGATE_FIELD);
    }

    /* renamed from: c */
    public List<A> mo73135c(C14825z.C14826a aVar) {
        C13706o.m87929f(aVar, "container");
        C14459q B = m90505B(aVar);
        if (B != null) {
            ArrayList arrayList = new ArrayList(1);
            B.mo67428c(new C14425d(this, arrayList), mo73144q(B));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo74022a()).toString());
    }

    /* renamed from: d */
    public List<A> mo73136d(C13508q qVar, C15719c cVar) {
        C13706o.m87929f(qVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        Object w = qVar.mo73393w(C15766a.f65116f);
        C13706o.m87928e(w, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C13444b> iterable = (Iterable) w;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
        for (C13444b bVar : iterable) {
            C13706o.m87928e(bVar, "it");
            arrayList.add(mo73133A(bVar, cVar));
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<A> mo73137f(C14825z zVar, C13473g gVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(gVar, "proto");
        C14467t.C14468a aVar = C14467t.f63311b;
        String string = zVar.mo74023b().getString(gVar.mo71212H());
        String c = ((C14825z.C14826a) zVar).mo74027e().mo78545c();
        C13706o.m87928e(c, "container as ProtoContai…Class).classId.asString()");
        return m90508n(this, zVar, aVar.mo73211a(string, C15829b.m95440b(c)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: g */
    public List<A> mo73138g(C14825z zVar, C14516o oVar, C14713b bVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(oVar, "proto");
        C13706o.m87929f(bVar, "kind");
        if (bVar == C14713b.PROPERTY) {
            return m90511z(zVar, (C13494n) oVar, C14423b.PROPERTY);
        }
        C14467t s = m90509s(this, oVar, zVar.mo74023b(), zVar.mo74025d(), bVar, false, 16, (Object) null);
        if (s == null) {
            return C13614t.m87748j();
        }
        return m90508n(this, zVar, s, false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: h */
    public List<A> mo73139h(C13519s sVar, C15719c cVar) {
        C13706o.m87929f(sVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        Object w = sVar.mo73393w(C15766a.f65118h);
        C13706o.m87928e(w, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C13444b> iterable = (Iterable) w;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
        for (C13444b bVar : iterable) {
            C13706o.m87928e(bVar, "it");
            arrayList.add(mo73133A(bVar, cVar));
        }
        return arrayList;
    }

    /* renamed from: i */
    public List<A> mo73140i(C14825z zVar, C14516o oVar, C14713b bVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(oVar, "proto");
        C13706o.m87929f(bVar, "kind");
        C14467t s = m90509s(this, oVar, zVar.mo74023b(), zVar.mo74025d(), bVar, false, 16, (Object) null);
        if (s == null) {
            return C13614t.m87748j();
        }
        return m90508n(this, zVar, C14467t.f63311b.mo73215e(s, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: j */
    public List<A> mo73141j(C14825z zVar, C14516o oVar, C14713b bVar, int i, C13527u uVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(oVar, "callableProto");
        C13706o.m87929f(bVar, "kind");
        C13706o.m87929f(uVar, "proto");
        C14467t s = m90509s(this, oVar, zVar.mo74023b(), zVar.mo74025d(), bVar, false, 16, (Object) null);
        if (s == null) {
            return C13614t.m87748j();
        }
        return m90508n(this, zVar, C14467t.f63311b.mo73215e(s, i + m90506l(zVar, oVar)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: k */
    public List<A> mo73142k(C14825z zVar, C13494n nVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        return m90511z(zVar, nVar, C14423b.BACKING_FIELD);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C14459q mo73143o(C14825z zVar, C14459q qVar) {
        C13706o.m87929f(zVar, "container");
        if (qVar != null) {
            return qVar;
        }
        if (zVar instanceof C14825z.C14826a) {
            return m90505B((C14825z.C14826a) zVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract S mo73115p(C14459q qVar);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public byte[] mo73144q(C14459q qVar) {
        C13706o.m87929f(qVar, "kotlinClass");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C14467t mo73145r(C14516o oVar, C15719c cVar, C15724g gVar, C14713b bVar, boolean z) {
        C13706o.m87929f(oVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C13706o.m87929f(bVar, "kind");
        if (oVar instanceof C13460d) {
            C14467t.C14468a aVar = C14467t.f63311b;
            C15831d.C15833b b = C15841i.f65291a.mo75620b((C13460d) oVar, cVar, gVar);
            if (b == null) {
                return null;
            }
            return aVar.mo73212b(b);
        } else if (oVar instanceof C13481i) {
            C14467t.C14468a aVar2 = C14467t.f63311b;
            C15831d.C15833b e = C15841i.f65291a.mo75622e((C13481i) oVar, cVar, gVar);
            if (e == null) {
                return null;
            }
            return aVar2.mo73212b(e);
        } else if (!(oVar instanceof C13494n)) {
            return null;
        } else {
            C14495h.C14502f<C13494n, C15766a.C15774d> fVar = C15766a.f65114d;
            C13706o.m87928e(fVar, "propertySignature");
            C15766a.C15774d dVar = (C15766a.C15774d) C15722e.m95026a((C14495h.C14499d) oVar, fVar);
            if (dVar == null) {
                return null;
            }
            int i = C14424c.f63241a[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return mo73146t((C13494n) oVar, cVar, gVar, true, true, z);
                } else if (!dVar.mo75451J()) {
                    return null;
                } else {
                    C14467t.C14468a aVar3 = C14467t.f63311b;
                    C15766a.C15771c E = dVar.mo75446E();
                    C13706o.m87928e(E, "signature.setter");
                    return aVar3.mo73213c(cVar, E);
                }
            } else if (!dVar.mo75450I()) {
                return null;
            } else {
                C14467t.C14468a aVar4 = C14467t.f63311b;
                C15766a.C15771c D = dVar.mo75445D();
                C13706o.m87928e(D, "signature.getter");
                return aVar4.mo73213c(cVar, D);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C14467t mo73146t(C13494n nVar, C15719c cVar, C15724g gVar, boolean z, boolean z2, boolean z3) {
        C13706o.m87929f(nVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C14495h.C14502f<C13494n, C15766a.C15774d> fVar = C15766a.f65114d;
        C13706o.m87928e(fVar, "propertySignature");
        C15766a.C15774d dVar = (C15766a.C15774d) C15722e.m95026a(nVar, fVar);
        if (dVar == null) {
            return null;
        }
        if (z) {
            C15831d.C15832a c = C15841i.f65291a.mo75621c(nVar, cVar, gVar, z3);
            if (c == null) {
                return null;
            }
            return C14467t.f63311b.mo73212b(c);
        } else if (!z2 || !dVar.mo75452L()) {
            return null;
        } else {
            C14467t.C14468a aVar = C14467t.f63311b;
            C15766a.C15771c F = dVar.mo75447F();
            C13706o.m87928e(F, "signature.syntheticMethod");
            return aVar.mo73213c(cVar, F);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C14459q mo73147v(C14825z zVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        C14825z.C14826a h;
        C13706o.m87929f(zVar, "container");
        if (z) {
            if (bool != null) {
                if (zVar instanceof C14825z.C14826a) {
                    C14825z.C14826a aVar = (C14825z.C14826a) zVar;
                    if (aVar.mo74029g() == C13455c.C13458c.INTERFACE) {
                        C14454o oVar = this.f63236a;
                        C16151b d = aVar.mo74027e().mo78546d(C16157f.m97019i("DefaultImpls"));
                        C13706o.m87928e(d, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return C14458p.m90655b(oVar, d);
                    }
                }
                if (bool.booleanValue() && (zVar instanceof C14825z.C14827b)) {
                    C14158z0 c = zVar.mo74024c();
                    C14445k kVar = c instanceof C14445k ? (C14445k) c : null;
                    C16609d f = kVar != null ? kVar.mo73173f() : null;
                    if (f != null) {
                        C14454o oVar2 = this.f63236a;
                        String f2 = f.mo79458f();
                        C13706o.m87928e(f2, "facadeClassName.internalName");
                        C16151b m = C16151b.m96975m(new C16152c(C15176v.m93629D(f2, '/', FilenameUtils.EXTENSION_SEPARATOR, false, 4, (Object) null)));
                        C13706o.m87928e(m, "topLevel(FqName(facadeCl…lName.replace('/', '.')))");
                        return C14458p.m90655b(oVar2, m);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + zVar + ')').toString());
            }
        }
        if (z2 && (zVar instanceof C14825z.C14826a)) {
            C14825z.C14826a aVar2 = (C14825z.C14826a) zVar;
            if (aVar2.mo74029g() == C13455c.C13458c.COMPANION_OBJECT && (h = aVar2.mo74030h()) != null && (h.mo74029g() == C13455c.C13458c.CLASS || h.mo74029g() == C13455c.C13458c.ENUM_CLASS || (z3 && (h.mo74029g() == C13455c.C13458c.INTERFACE || h.mo74029g() == C13455c.C13458c.ANNOTATION_CLASS)))) {
                return m90505B(h);
            }
        }
        if (!(zVar instanceof C14825z.C14827b) || !(zVar.mo74024c() instanceof C14445k)) {
            return null;
        }
        C14158z0 c2 = zVar.mo74024c();
        C13706o.m87927d(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        C14445k kVar2 = (C14445k) c2;
        C14459q g = kVar2.mo73174g();
        return g == null ? C14458p.m90655b(this.f63236a, kVar2.mo73171d()) : g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo73148w(C16151b bVar) {
        C14459q b;
        C13706o.m87929f(bVar, "classId");
        if (bVar.mo78548g() == null || !C13706o.m87924a(bVar.mo78552j().mo78583d(), "Container") || (b = C14458p.m90655b(this.f63236a, bVar)) == null || !C17075a.f68516a.mo80344c(b)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract C14459q.C14460a mo73149x(C16151b bVar, C14158z0 z0Var, List<A> list);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C14459q.C14460a mo73150y(C16151b bVar, C14158z0 z0Var, List<A> list) {
        C13706o.m87929f(bVar, "annotationClassId");
        C13706o.m87929f(z0Var, "source");
        C13706o.m87929f(list, "result");
        if (C17075a.f68516a.mo80343b().contains(bVar)) {
            return null;
        }
        return mo73149x(bVar, z0Var, list);
    }
}
