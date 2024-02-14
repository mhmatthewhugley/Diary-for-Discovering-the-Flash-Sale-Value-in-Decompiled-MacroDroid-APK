package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13873d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13918e;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14169a;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14610a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14618h;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14642s;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p271gb.C12336g;
import p279hb.C12412a;
import p288ib.C12479a;
import p288ib.C12482b;
import p288ib.C12484c;
import p288ib.C12488e;
import p288ib.C12492g;
import p288ib.C12493h;
import p288ib.C12498m;
import p288ib.C12500o;
import p288ib.C12510x;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p389sb.C16519a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17007j;
import p442yb.C17011m;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e */
/* compiled from: LazyJavaAnnotationDescriptor.kt */
public final class C14237e implements C13915c, C12336g {

    /* renamed from: i */
    static final /* synthetic */ C16887m<Object>[] f62968i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14301g f62969a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12479a f62970b;

    /* renamed from: c */
    private final C17007j f62971c;

    /* renamed from: d */
    private final C17006i f62972d;

    /* renamed from: e */
    private final C12412a f62973e;

    /* renamed from: f */
    private final C17006i f62974f;

    /* renamed from: g */
    private final boolean f62975g;

    /* renamed from: h */
    private final boolean f62976h;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e$a */
    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class C14238a extends C13708q implements C16254a<Map<C16157f, ? extends C14617g<?>>> {
        final /* synthetic */ C14237e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14238a(C14237e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final Map<C16157f, C14617g<?>> invoke() {
            Collection<C12482b> arguments = this.this$0.f62970b.getArguments();
            C14237e eVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (C12482b bVar : arguments) {
                C16157f name = bVar.getName();
                if (name == null) {
                    name = C14163a0.f62786c;
                }
                C14617g g = eVar.m89894l(bVar);
                C13328m a = g != null ? C13337s.m85692a(name, g) : null;
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return C13615t0.m87768r(arrayList);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e$b */
    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class C14239b extends C13708q implements C16254a<C16152c> {
        final /* synthetic */ C14237e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14239b(C14237e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final C16152c invoke() {
            C16151b d = this.this$0.f62970b.mo68950d();
            if (d != null) {
                return d.mo78544b();
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e$c */
    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    static final class C14240c extends C13708q implements C16254a<C14951m0> {
        final /* synthetic */ C14237e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14240c(C14237e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke() {
            C16152c e = this.this$0.mo72241e();
            if (e == null) {
                return C17088k.m100540d(C17087j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, this.this$0.f62970b.toString());
            }
            C13948e f = C13873d.m88370f(C13873d.f62132a, e, this.this$0.f62969a.mo72917d().mo72296m(), (Integer) null, 4, (Object) null);
            if (f == null) {
                C12492g s = this.this$0.f62970b.mo68953s();
                f = s != null ? this.this$0.f62969a.mo72914a().mo72776n().mo72923a(s) : null;
                if (f == null) {
                    f = this.this$0.m89893h(e);
                }
            }
            return f.mo72274p();
        }
    }

    static {
        Class<C14237e> cls = C14237e.class;
        f62968i = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public C14237e(C14301g gVar, C12479a aVar, boolean z) {
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(aVar, "javaAnnotation");
        this.f62969a = gVar;
        this.f62970b = aVar;
        this.f62971c = gVar.mo72918e().mo80219d(new C14239b(this));
        this.f62972d = gVar.mo72918e().mo80221f(new C14240c(this));
        this.f62973e = gVar.mo72914a().mo72782t().mo67445a(aVar);
        this.f62974f = gVar.mo72918e().mo80221f(new C14238a(this));
        this.f62975g = aVar.mo68951f();
        this.f62976h = aVar.mo68949C() || z;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final C13948e m89893h(C16152c cVar) {
        C13958g0 d = this.f62969a.mo72917d();
        C16151b m = C16151b.m96975m(cVar);
        C13706o.m87928e(m, "topLevel(fqName)");
        return C14147x.m89566c(d, m, this.f62969a.mo72914a().mo72764b().mo73161d().mo73975q());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final C14617g<?> m89894l(C12482b bVar) {
        if (bVar instanceof C12500o) {
            return C14618h.f63618a.mo73731c(((C12500o) bVar).getValue());
        }
        if (bVar instanceof C12498m) {
            C12498m mVar = (C12498m) bVar;
            return m89897o(mVar.mo68989c(), mVar.mo68990d());
        } else if (bVar instanceof C12488e) {
            C12488e eVar = (C12488e) bVar;
            C16157f name = eVar.getName();
            if (name == null) {
                name = C14163a0.f62786c;
            }
            C13706o.m87928e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            return m89896n(name, eVar.getElements());
        } else if (bVar instanceof C12484c) {
            return m89895m(((C12484c) bVar).mo68958a());
        } else {
            if (bVar instanceof C12493h) {
                return m89898p(((C12493h) bVar).mo68982b());
            }
            return null;
        }
    }

    /* renamed from: m */
    private final C14617g<?> m89895m(C12479a aVar) {
        return new C14610a(new C14237e(this.f62969a, aVar, false, 4, (C13695i) null));
    }

    /* renamed from: n */
    private final C14617g<?> m89896n(C16157f fVar, List<? extends C12482b> list) {
        C14900e0 e0Var;
        C14951m0 j = getType();
        C13706o.m87928e(j, "type");
        if (C14925g0.m92873a(j)) {
            return null;
        }
        C13948e e = C16519a.m98612e(this);
        C13706o.m87926c(e);
        C13966i1 b = C14169a.m89659b(fVar, e);
        if (b == null || (e0Var = b.getType()) == null) {
            e0Var = this.f62969a.mo72914a().mo72775m().mo72296m().mo72139l(C14970r1.INVARIANT, C17088k.m100540d(C17087j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
        }
        C13706o.m87928e(e0Var, "DescriptorResolverUtils.…GUMENT)\n                )");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C12482b l : list) {
            Object l2 = m89894l(l);
            if (l2 == null) {
                l2 = new C14642s();
            }
            arrayList.add(l2);
        }
        return C14618h.f63618a.mo73730b(arrayList, e0Var);
    }

    /* renamed from: o */
    private final C14617g<?> m89897o(C16151b bVar, C16157f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new C14622j(bVar, fVar);
    }

    /* renamed from: p */
    private final C14617g<?> m89898p(C12510x xVar) {
        return C14636q.f63637b.mo73749a(this.f62969a.mo72920g().mo72939o(xVar, C14312d.m90202d(C14190k.COMMON, false, (C13950e1) null, 3, (Object) null)));
    }

    /* renamed from: a */
    public Map<C16157f, C14617g<?>> mo72240a() {
        return (Map) C17011m.m100276a(this.f62974f, this, f62968i[2]);
    }

    /* renamed from: e */
    public C16152c mo72241e() {
        return (C16152c) C17011m.m100277b(this.f62971c, this, f62968i[0]);
    }

    /* renamed from: f */
    public boolean mo68666f() {
        return this.f62975g;
    }

    /* renamed from: i */
    public C12412a getSource() {
        return this.f62973e;
    }

    /* renamed from: j */
    public C14951m0 getType() {
        return (C14951m0) C17011m.m100276a(this.f62972d, this, f62968i[1]);
    }

    /* renamed from: k */
    public final boolean mo72807k() {
        return this.f62976h;
    }

    public String toString() {
        return C14552c.m91136s(C14552c.f63483g, this, (C13918e) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14237e(C14301g gVar, C12479a aVar, boolean z, int i, C13695i iVar) {
        this(gVar, aVar, (i & 4) != 0 ? false : z);
    }
}
