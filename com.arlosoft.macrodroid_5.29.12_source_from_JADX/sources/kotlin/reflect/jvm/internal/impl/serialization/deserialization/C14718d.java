package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14825z;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p308kb.C13444b;
import p308kb.C13460d;
import p308kb.C13473g;
import p308kb.C13481i;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13519s;
import p308kb.C13527u;
import p327mb.C15719c;
import p327mb.C15722e;
import p425wb.C16793a;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d */
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
public final class C14718d implements C14716c<C13915c, C14617g<?>> {

    /* renamed from: a */
    private final C16793a f63764a;

    /* renamed from: b */
    private final C14781e f63765b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d$a */
    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    public /* synthetic */ class C14719a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63766a;

        static {
            int[] iArr = new int[C14713b.values().length];
            iArr[C14713b.PROPERTY.ordinal()] = 1;
            iArr[C14713b.PROPERTY_GETTER.ordinal()] = 2;
            iArr[C14713b.PROPERTY_SETTER.ordinal()] = 3;
            f63766a = iArr;
        }
    }

    public C14718d(C13958g0 g0Var, C14043j0 j0Var, C16793a aVar) {
        C13706o.m87929f(g0Var, "module");
        C13706o.m87929f(j0Var, "notFoundClasses");
        C13706o.m87929f(aVar, "protocol");
        this.f63764a = aVar;
        this.f63765b = new C14781e(g0Var, j0Var);
    }

    /* renamed from: a */
    public List<C13915c> mo73134a(C14825z zVar, C13494n nVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        return C13614t.m87748j();
    }

    /* renamed from: c */
    public List<C13915c> mo73135c(C14825z.C14826a aVar) {
        C13706o.m87929f(aVar, "container");
        List<C13444b> list = (List) aVar.mo74028f().mo73393w(this.f63764a.mo79779a());
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13444b a : list) {
            arrayList.add(this.f63765b.mo73941a(a, aVar.mo74023b()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C13915c> mo73136d(C13508q qVar, C15719c cVar) {
        C13706o.m87929f(qVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        List<C13444b> list = (List) qVar.mo73393w(this.f63764a.mo79789k());
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13444b a : list) {
            arrayList.add(this.f63765b.mo73941a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<C13915c> mo73137f(C14825z zVar, C13473g gVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(gVar, "proto");
        List<C13444b> list = (List) gVar.mo73393w(this.f63764a.mo79782d());
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13444b a : list) {
            arrayList.add(this.f63765b.mo73941a(a, zVar.mo74023b()));
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<C13915c> mo73138g(C14825z zVar, C14516o oVar, C14713b bVar) {
        List<C13444b> list;
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(oVar, "proto");
        C13706o.m87929f(bVar, "kind");
        if (oVar instanceof C13460d) {
            list = (List) ((C13460d) oVar).mo73393w(this.f63764a.mo79781c());
        } else if (oVar instanceof C13481i) {
            list = (List) ((C13481i) oVar).mo73393w(this.f63764a.mo79784f());
        } else if (oVar instanceof C13494n) {
            int i = C14719a.f63766a[bVar.ordinal()];
            if (i == 1) {
                list = (List) ((C13494n) oVar).mo73393w(this.f63764a.mo79786h());
            } else if (i == 2) {
                list = (List) ((C13494n) oVar).mo73393w(this.f63764a.mo79787i());
            } else if (i == 3) {
                list = (List) ((C13494n) oVar).mo73393w(this.f63764a.mo79788j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + oVar).toString());
        }
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13444b a : list) {
            arrayList.add(this.f63765b.mo73941a(a, zVar.mo74023b()));
        }
        return arrayList;
    }

    /* renamed from: h */
    public List<C13915c> mo73139h(C13519s sVar, C15719c cVar) {
        C13706o.m87929f(sVar, "proto");
        C13706o.m87929f(cVar, "nameResolver");
        List<C13444b> list = (List) sVar.mo73393w(this.f63764a.mo79790l());
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13444b a : list) {
            arrayList.add(this.f63765b.mo73941a(a, cVar));
        }
        return arrayList;
    }

    /* renamed from: i */
    public List<C13915c> mo73140i(C14825z zVar, C14516o oVar, C14713b bVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(oVar, "proto");
        C13706o.m87929f(bVar, "kind");
        return C13614t.m87748j();
    }

    /* renamed from: j */
    public List<C13915c> mo73141j(C14825z zVar, C14516o oVar, C14713b bVar, int i, C13527u uVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(oVar, "callableProto");
        C13706o.m87929f(bVar, "kind");
        C13706o.m87929f(uVar, "proto");
        List<C13444b> list = (List) uVar.mo73393w(this.f63764a.mo79785g());
        if (list == null) {
            list = C13614t.m87748j();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13444b a : list) {
            arrayList.add(this.f63765b.mo73941a(a, zVar.mo74023b()));
        }
        return arrayList;
    }

    /* renamed from: k */
    public List<C13915c> mo73142k(C14825z zVar, C13494n nVar) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        return C13614t.m87748j();
    }

    /* renamed from: l */
    public C14617g<?> mo73113b(C14825z zVar, C13494n nVar, C14900e0 e0Var) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        C13706o.m87929f(e0Var, "expectedType");
        return null;
    }

    /* renamed from: m */
    public C14617g<?> mo73114e(C14825z zVar, C13494n nVar, C14900e0 e0Var) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        C13706o.m87929f(e0Var, "expectedType");
        C13444b.C13446b.C13449c cVar = (C13444b.C13446b.C13449c) C15722e.m95026a(nVar, this.f63764a.mo79780b());
        if (cVar == null) {
            return null;
        }
        return this.f63765b.mo73942f(e0Var, cVar, zVar.mo74023b());
    }
}
