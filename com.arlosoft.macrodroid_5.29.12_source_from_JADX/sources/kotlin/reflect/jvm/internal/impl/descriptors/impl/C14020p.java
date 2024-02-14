package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14048j1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13926i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14006l0;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14975t;
import p272gc.C12354e;
import p362pb.C16157f;
import p370qa.C16254a;
import p416vb.C16754d;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.p */
/* compiled from: FunctionDescriptorImpl */
public abstract class C14020p extends C14003k implements C14154y {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C14146w0 f62567A;

    /* renamed from: B */
    private C13945d0 f62568B;

    /* renamed from: C */
    private C14141u f62569C;

    /* renamed from: D */
    private boolean f62570D;

    /* renamed from: E */
    private boolean f62571E;

    /* renamed from: F */
    private boolean f62572F;

    /* renamed from: G */
    private boolean f62573G;

    /* renamed from: H */
    private boolean f62574H;

    /* renamed from: I */
    private boolean f62575I;

    /* renamed from: J */
    private boolean f62576J;

    /* renamed from: K */
    private boolean f62577K;

    /* renamed from: L */
    private boolean f62578L;

    /* renamed from: M */
    private boolean f62579M;

    /* renamed from: N */
    private boolean f62580N;

    /* renamed from: O */
    private boolean f62581O;

    /* renamed from: P */
    private Collection<? extends C14154y> f62582P;

    /* renamed from: Q */
    private volatile C16254a<Collection<C14154y>> f62583Q;

    /* renamed from: R */
    private final C14154y f62584R;

    /* renamed from: S */
    private final C13936b.C13937a f62585S;

    /* renamed from: T */
    private C14154y f62586T;

    /* renamed from: U */
    protected Map<C13908a.C13909a<?>, Object> f62587U;

    /* renamed from: g */
    private List<C13950e1> f62588g;

    /* renamed from: o */
    private List<C13966i1> f62589o;

    /* renamed from: p */
    private C14900e0 f62590p;

    /* renamed from: s */
    private List<C14146w0> f62591s;

    /* renamed from: z */
    private C14146w0 f62592z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.p$a */
    /* compiled from: FunctionDescriptorImpl */
    class C14021a implements C16254a<Collection<C14154y>> {

        /* renamed from: a */
        final /* synthetic */ C14945l1 f62593a;

        C14021a(C14945l1 l1Var) {
            this.f62593a = l1Var;
        }

        /* renamed from: a */
        public Collection<C14154y> invoke() {
            C12354e eVar = new C12354e();
            for (C14154y c : C14020p.this.mo72234d()) {
                eVar.add(c.mo72267c(this.f62593a));
            }
            return eVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.p$b */
    /* compiled from: FunctionDescriptorImpl */
    static class C14022b implements C16254a<List<C14048j1>> {

        /* renamed from: a */
        final /* synthetic */ List f62595a;

        C14022b(List list) {
            this.f62595a = list;
        }

        /* renamed from: a */
        public List<C14048j1> invoke() {
            return this.f62595a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.p$c */
    /* compiled from: FunctionDescriptorImpl */
    public class C14023c implements C14154y.C14155a<C14154y> {

        /* renamed from: a */
        protected C14936j1 f62596a;

        /* renamed from: b */
        protected C14064m f62597b;

        /* renamed from: c */
        protected C13945d0 f62598c;

        /* renamed from: d */
        protected C14141u f62599d;

        /* renamed from: e */
        protected C14154y f62600e;

        /* renamed from: f */
        protected C13936b.C13937a f62601f;

        /* renamed from: g */
        protected List<C13966i1> f62602g;

        /* renamed from: h */
        protected List<C14146w0> f62603h;

        /* renamed from: i */
        protected C14146w0 f62604i;

        /* renamed from: j */
        protected C14146w0 f62605j;

        /* renamed from: k */
        protected C14900e0 f62606k;

        /* renamed from: l */
        protected C16157f f62607l;

        /* renamed from: m */
        protected boolean f62608m;

        /* renamed from: n */
        protected boolean f62609n;

        /* renamed from: o */
        protected boolean f62610o;

        /* renamed from: p */
        protected boolean f62611p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public boolean f62612q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public List<C13950e1> f62613r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public C13921g f62614s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public boolean f62615t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public Map<C13908a.C13909a<?>, Object> f62616u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public Boolean f62617v;

        /* renamed from: w */
        protected boolean f62618w;

        /* renamed from: x */
        final /* synthetic */ C14020p f62619x;

        public C14023c(C14020p pVar, C14936j1 j1Var, C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, List<C13966i1> list, List<C14146w0> list2, C14146w0 w0Var, C14900e0 e0Var, C16157f fVar) {
            if (j1Var == null) {
                m89104u(0);
            }
            if (mVar == null) {
                m89104u(1);
            }
            if (d0Var == null) {
                m89104u(2);
            }
            if (uVar == null) {
                m89104u(3);
            }
            if (aVar == null) {
                m89104u(4);
            }
            if (list == null) {
                m89104u(5);
            }
            if (list2 == null) {
                m89104u(6);
            }
            if (e0Var == null) {
                m89104u(7);
            }
            this.f62619x = pVar;
            this.f62600e = null;
            this.f62605j = pVar.f62567A;
            this.f62608m = true;
            this.f62609n = false;
            this.f62610o = false;
            this.f62611p = false;
            this.f62612q = pVar.mo72317C0();
            this.f62613r = null;
            this.f62614s = null;
            this.f62615t = pVar.mo72320F0();
            this.f62616u = new LinkedHashMap();
            this.f62617v = null;
            this.f62618w = false;
            this.f62596a = j1Var;
            this.f62597b = mVar;
            this.f62598c = d0Var;
            this.f62599d = uVar;
            this.f62601f = aVar;
            this.f62602g = list;
            this.f62603h = list2;
            this.f62604i = w0Var;
            this.f62606k = e0Var;
            this.f62607l = fVar;
        }

        /* renamed from: u */
        private static /* synthetic */ void m89104u(int i) {
            String str;
            int i2;
            Throwable th;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        /* renamed from: B */
        public C14023c mo72513s(C13921g gVar) {
            if (gVar == null) {
                m89104u(35);
            }
            this.f62614s = gVar;
            return this;
        }

        /* renamed from: C */
        public C14023c mo72509o(boolean z) {
            this.f62608m = z;
            return this;
        }

        /* renamed from: D */
        public C14023c mo72497c(C14146w0 w0Var) {
            this.f62605j = w0Var;
            return this;
        }

        /* renamed from: E */
        public C14023c mo72494a() {
            this.f62611p = true;
            return this;
        }

        /* renamed from: F */
        public C14023c mo72499e(C14146w0 w0Var) {
            this.f62604i = w0Var;
            return this;
        }

        /* renamed from: G */
        public C14023c mo72478G(boolean z) {
            this.f62617v = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: H */
        public C14023c mo72498d() {
            this.f62615t = true;
            return this;
        }

        /* renamed from: I */
        public C14023c mo72503i() {
            this.f62612q = true;
            return this;
        }

        /* renamed from: J */
        public C14023c mo72481J(boolean z) {
            this.f62618w = z;
            return this;
        }

        /* renamed from: K */
        public C14023c mo72512r(C13936b.C13937a aVar) {
            if (aVar == null) {
                m89104u(14);
            }
            this.f62601f = aVar;
            return this;
        }

        /* renamed from: L */
        public C14023c mo72505k(C13945d0 d0Var) {
            if (d0Var == null) {
                m89104u(10);
            }
            this.f62598c = d0Var;
            return this;
        }

        /* renamed from: M */
        public C14023c mo72504j(C16157f fVar) {
            if (fVar == null) {
                m89104u(17);
            }
            this.f62607l = fVar;
            return this;
        }

        /* renamed from: N */
        public C14023c mo72508n(C13936b bVar) {
            this.f62600e = (C14154y) bVar;
            return this;
        }

        /* renamed from: O */
        public C14023c mo72511q(C14064m mVar) {
            if (mVar == null) {
                m89104u(8);
            }
            this.f62597b = mVar;
            return this;
        }

        /* renamed from: P */
        public C14023c mo72506l() {
            this.f62610o = true;
            return this;
        }

        /* renamed from: Q */
        public C14023c mo72507m(C14900e0 e0Var) {
            if (e0Var == null) {
                m89104u(23);
            }
            this.f62606k = e0Var;
            return this;
        }

        /* renamed from: R */
        public C14023c mo72514t() {
            this.f62609n = true;
            return this;
        }

        /* renamed from: S */
        public C14023c mo72500f(C14936j1 j1Var) {
            if (j1Var == null) {
                m89104u(37);
            }
            this.f62596a = j1Var;
            return this;
        }

        /* renamed from: T */
        public C14023c mo72510p(List<C13950e1> list) {
            if (list == null) {
                m89104u(21);
            }
            this.f62613r = list;
            return this;
        }

        /* renamed from: U */
        public C14023c mo72495b(List<C13966i1> list) {
            if (list == null) {
                m89104u(19);
            }
            this.f62602g = list;
            return this;
        }

        /* renamed from: V */
        public C14023c mo72502h(C14141u uVar) {
            if (uVar == null) {
                m89104u(12);
            }
            this.f62599d = uVar;
            return this;
        }

        public C14154y build() {
            return this.f62619x.mo62206M0(this);
        }

        /* renamed from: g */
        public <V> C14154y.C14155a<C14154y> mo72501g(C13908a.C13909a<V> aVar, V v) {
            if (aVar == null) {
                m89104u(39);
            }
            this.f62616u.put(aVar, v);
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C14020p(C14064m mVar, C14154y yVar, C13921g gVar, C16157f fVar, C13936b.C13937a aVar, C14158z0 z0Var) {
        super(mVar, gVar, fVar, z0Var);
        if (mVar == null) {
            m89055h0(0);
        }
        if (gVar == null) {
            m89055h0(1);
        }
        if (fVar == null) {
            m89055h0(2);
        }
        if (aVar == null) {
            m89055h0(3);
        }
        if (z0Var == null) {
            m89055h0(4);
        }
        this.f62569C = C14127t.f62758i;
        this.f62570D = false;
        this.f62571E = false;
        this.f62572F = false;
        this.f62573G = false;
        this.f62574H = false;
        this.f62575I = false;
        this.f62576J = false;
        this.f62577K = false;
        this.f62578L = false;
        this.f62579M = false;
        this.f62580N = true;
        this.f62581O = false;
        this.f62582P = null;
        this.f62583Q = null;
        this.f62586T = null;
        this.f62587U = null;
        this.f62584R = yVar == null ? this : yVar;
        this.f62585S = aVar;
    }

    /* renamed from: N0 */
    private C14158z0 m89048N0(boolean z, C14154y yVar) {
        C14158z0 z0Var;
        if (z) {
            if (yVar == null) {
                yVar = m89079a();
            }
            z0Var = yVar.getSource();
        } else {
            z0Var = C14158z0.f62778a;
        }
        if (z0Var == null) {
            m89055h0(27);
        }
        return z0Var;
    }

    /* renamed from: O0 */
    public static List<C13966i1> m89049O0(C14154y yVar, List<C13966i1> list, C14945l1 l1Var) {
        if (list == null) {
            m89055h0(28);
        }
        if (l1Var == null) {
            m89055h0(29);
        }
        return m89050P0(yVar, list, l1Var, false, false, (boolean[]) null);
    }

    /* renamed from: P0 */
    public static List<C13966i1> m89050P0(C14154y yVar, List<C13966i1> list, C14945l1 l1Var, boolean z, boolean z2, boolean[] zArr) {
        C14900e0 e0Var;
        C14945l1 l1Var2 = l1Var;
        if (list == null) {
            m89055h0(30);
        }
        if (l1Var2 == null) {
            m89055h0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C13966i1 next : list) {
            C14900e0 type = next.getType();
            C14970r1 r1Var = C14970r1.IN_VARIANCE;
            C14900e0 p = l1Var2.mo74215p(type, r1Var);
            C14900e0 v0 = next.mo72306v0();
            if (v0 == null) {
                e0Var = null;
            } else {
                e0Var = l1Var2.mo74215p(v0, r1Var);
            }
            if (p == null) {
                return null;
            }
            if (!((p == next.getType() && v0 == e0Var) || zArr == null)) {
                zArr[0] = true;
            }
            arrayList.add(C14006l0.m88968K0(yVar, z ? null : next, next.mo72303i(), next.getAnnotations(), next.getName(), p, next.mo72302A0(), next.mo72305r0(), next.mo72304p0(), e0Var, z2 ? next.getSource() : C14158z0.f62778a, next instanceof C14006l0.C14008b ? new C14022b(((C14006l0.C14008b) next).mo72443N0()) : null));
        }
        return arrayList;
    }

    /* renamed from: T0 */
    private void m89051T0() {
        C16254a<Collection<C14154y>> aVar = this.f62583Q;
        if (aVar != null) {
            this.f62582P = aVar.invoke();
            this.f62583Q = null;
        }
    }

    /* renamed from: a1 */
    private void m89052a1(boolean z) {
        this.f62578L = z;
    }

    /* renamed from: b1 */
    private void m89053b1(boolean z) {
        this.f62577K = z;
    }

    /* renamed from: d1 */
    private void m89054d1(C14154y yVar) {
        this.f62586T = yVar;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m89055h0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: B */
    public boolean mo62204B() {
        return this.f62574H;
    }

    /* renamed from: C0 */
    public boolean mo72317C0() {
        return this.f62577K;
    }

    /* renamed from: D0 */
    public void mo72262D0(Collection<? extends C13936b> collection) {
        if (collection == null) {
            m89055h0(17);
        }
        this.f62582P = collection;
        Iterator<? extends C13936b> it = collection.iterator();
        while (it.hasNext()) {
            if (((C14154y) it.next()).mo72320F0()) {
                this.f62578L = true;
                return;
            }
        }
    }

    /* renamed from: F0 */
    public boolean mo72320F0() {
        return this.f62578L;
    }

    /* renamed from: K0 */
    public C14154y mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, boolean z) {
        C14154y build = mo72401t().mo72511q(mVar).mo72505k(d0Var).mo72502h(uVar).mo72512r(aVar).mo72509o(z).build();
        if (build == null) {
            m89055h0(26);
        }
        return build;
    }

    /* renamed from: L */
    public C14146w0 mo72231L() {
        return this.f62567A;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public abstract C14020p mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var);

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public C14154y mo62206M0(C14023c cVar) {
        C13992f0 f0Var;
        C14146w0 w0Var;
        C14900e0 p;
        C14023c cVar2 = cVar;
        if (cVar2 == null) {
            m89055h0(25);
        }
        boolean[] zArr = new boolean[1];
        C13921g a = cVar.f62614s != null ? C13926i.m88508a(getAnnotations(), cVar.f62614s) : getAnnotations();
        C14064m mVar = cVar2.f62597b;
        C14154y yVar = cVar2.f62600e;
        C14020p L0 = mo62205L0(mVar, yVar, cVar2.f62601f, cVar2.f62607l, a, m89048N0(cVar2.f62610o, yVar));
        List<C13950e1> typeParameters = cVar.f62613r == null ? getTypeParameters() : cVar.f62613r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        C14945l1 c = C14975t.m93115c(typeParameters, cVar2.f62596a, L0, arrayList, zArr);
        if (c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar2.f62603h.isEmpty()) {
            for (C14146w0 next : cVar2.f62603h) {
                C14900e0 p2 = c.mo74215p(next.getType(), C14970r1.IN_VARIANCE);
                if (p2 == null) {
                    return null;
                }
                arrayList2.add(C14602c.m91470b(L0, p2, next.getAnnotations()));
                zArr[0] = (p2 != next.getType()) | zArr[0];
            }
        }
        C14146w0 w0Var2 = cVar2.f62604i;
        if (w0Var2 != null) {
            C14900e0 p3 = c.mo74215p(w0Var2.getType(), C14970r1.IN_VARIANCE);
            if (p3 == null) {
                return null;
            }
            C13992f0 f0Var2 = new C13992f0(L0, new C16754d(L0, p3, cVar2.f62604i.getValue()), cVar2.f62604i.getAnnotations());
            zArr[0] = (p3 != cVar2.f62604i.getType()) | zArr[0];
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        C14146w0 w0Var3 = cVar2.f62605j;
        if (w0Var3 != null) {
            C14146w0 c2 = w0Var3.mo72267c(c);
            if (c2 == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c2 != cVar2.f62605j);
            w0Var = c2;
        } else {
            w0Var = null;
        }
        List<C13966i1> P0 = m89050P0(L0, cVar2.f62602g, c, cVar2.f62611p, cVar2.f62610o, zArr);
        if (P0 == null || (p = c.mo74215p(cVar2.f62606k, C14970r1.OUT_VARIANCE)) == null) {
            return null;
        }
        zArr[0] = zArr[0] | (p != cVar2.f62606k);
        if (!zArr[0] && cVar2.f62618w) {
            return this;
        }
        C14945l1 l1Var = c;
        L0.mo72397R0(f0Var, w0Var, arrayList2, arrayList, P0, p, cVar2.f62598c, cVar2.f62599d);
        L0.mo72466f1(this.f62570D);
        L0.mo72464c1(this.f62571E);
        L0.mo72463X0(this.f62572F);
        L0.mo72465e1(this.f62573G);
        L0.mo72469i1(this.f62574H);
        L0.mo72468h1(this.f62579M);
        L0.mo72462W0(this.f62575I);
        L0.mo72461V0(this.f62576J);
        L0.mo68651Y0(this.f62580N);
        L0.m89053b1(cVar.f62612q);
        L0.m89052a1(cVar.f62615t);
        L0.mo68652Z0(cVar.f62617v != null ? cVar.f62617v.booleanValue() : this.f62581O);
        if (!cVar.f62616u.isEmpty() || this.f62587U != null) {
            Map<C13908a.C13909a<?>, Object> A = cVar.f62616u;
            Map<C13908a.C13909a<?>, Object> map = this.f62587U;
            if (map != null) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!A.containsKey(next2.getKey())) {
                        A.put(next2.getKey(), next2.getValue());
                    }
                }
            }
            if (A.size() == 1) {
                L0.f62587U = Collections.singletonMap(A.keySet().iterator().next(), A.values().iterator().next());
            } else {
                L0.f62587U = A;
            }
        }
        if (cVar2.f62609n || mo72331s0() != null) {
            L0.m89054d1((mo72331s0() != null ? mo72331s0() : this).mo72267c(l1Var));
        }
        if (cVar2.f62608m && !m89079a().mo72234d().isEmpty()) {
            if (cVar2.f62596a.mo72942f()) {
                C16254a<Collection<C14154y>> aVar = this.f62583Q;
                if (aVar != null) {
                    L0.f62583Q = aVar;
                } else {
                    L0.mo72262D0(mo72234d());
                }
            } else {
                L0.f62583Q = new C14021a(l1Var);
            }
        }
        return L0;
    }

    /* renamed from: P */
    public C14146w0 mo72232P() {
        return this.f62592z;
    }

    /* renamed from: Q0 */
    public boolean mo68650Q0() {
        return this.f62580N;
    }

    /* renamed from: R0 */
    public C14020p mo72397R0(C14146w0 w0Var, C14146w0 w0Var2, List<C14146w0> list, List<? extends C13950e1> list2, List<C13966i1> list3, C14900e0 e0Var, C13945d0 d0Var, C14141u uVar) {
        if (list == null) {
            m89055h0(5);
        }
        if (list2 == null) {
            m89055h0(6);
        }
        if (list3 == null) {
            m89055h0(7);
        }
        if (uVar == null) {
            m89055h0(8);
        }
        this.f62588g = C13566b0.m87402F0(list2);
        this.f62589o = C13566b0.m87402F0(list3);
        this.f62590p = e0Var;
        this.f62568B = d0Var;
        this.f62569C = uVar;
        this.f62592z = w0Var;
        this.f62567A = w0Var2;
        this.f62591s = list;
        int i = 0;
        int i2 = 0;
        while (i2 < list2.size()) {
            C13950e1 e1Var = (C13950e1) list2.get(i2);
            if (e1Var.mo72272i() == i2) {
                i2++;
            } else {
                throw new IllegalStateException(e1Var + " index is " + e1Var.mo72272i() + " but position is " + i2);
            }
        }
        while (i < list3.size()) {
            C13966i1 i1Var = list3.get(i);
            if (i1Var.mo72303i() == i + 0) {
                i++;
            } else {
                throw new IllegalStateException(i1Var + "index is " + i1Var.mo72303i() + " but position is " + i);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public C14023c mo72459S0(C14945l1 l1Var) {
        if (l1Var == null) {
            m89055h0(24);
        }
        return new C14023c(this, l1Var.mo74211j(), mo62163b(), mo62179r(), getVisibility(), mo72264h(), mo72235g(), mo72238x0(), mo72232P(), getReturnType(), (C16157f) null);
    }

    /* renamed from: U0 */
    public <V> void mo72460U0(C13908a.C13909a<V> aVar, Object obj) {
        if (this.f62587U == null) {
            this.f62587U = new LinkedHashMap();
        }
        this.f62587U.put(aVar, obj);
    }

    /* renamed from: V0 */
    public void mo72461V0(boolean z) {
        this.f62576J = z;
    }

    /* renamed from: W0 */
    public void mo72462W0(boolean z) {
        this.f62575I = z;
    }

    /* renamed from: X0 */
    public void mo72463X0(boolean z) {
        this.f62572F = z;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return this.f62576J;
    }

    /* renamed from: Y0 */
    public void mo68651Y0(boolean z) {
        this.f62580N = z;
    }

    /* renamed from: Z0 */
    public void mo68652Z0(boolean z) {
        this.f62581O = z;
    }

    /* renamed from: c1 */
    public void mo72464c1(boolean z) {
        this.f62571E = z;
    }

    /* renamed from: d */
    public Collection<? extends C14154y> mo72234d() {
        m89051T0();
        Collection<? extends C14154y> collection = this.f62582P;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection == null) {
            m89055h0(14);
        }
        return collection;
    }

    /* renamed from: e1 */
    public void mo72465e1(boolean z) {
        this.f62573G = z;
    }

    /* renamed from: f1 */
    public void mo72466f1(boolean z) {
        this.f62570D = z;
    }

    /* renamed from: g */
    public List<C13966i1> mo72235g() {
        List<C13966i1> list = this.f62589o;
        if (list == null) {
            m89055h0(19);
        }
        return list;
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return this.f62581O;
    }

    /* renamed from: g1 */
    public void mo72467g1(C14900e0 e0Var) {
        if (e0Var == null) {
            m89055h0(11);
        }
        this.f62590p = e0Var;
    }

    public C14900e0 getReturnType() {
        return this.f62590p;
    }

    public List<C13950e1> getTypeParameters() {
        List<C13950e1> list = this.f62588g;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public C14141u getVisibility() {
        C14141u uVar = this.f62569C;
        if (uVar == null) {
            m89055h0(16);
        }
        return uVar;
    }

    /* renamed from: h */
    public C13936b.C13937a mo72264h() {
        C13936b.C13937a aVar = this.f62585S;
        if (aVar == null) {
            m89055h0(21);
        }
        return aVar;
    }

    /* renamed from: h1 */
    public void mo72468h1(boolean z) {
        this.f62579M = z;
    }

    /* renamed from: i1 */
    public void mo72469i1(boolean z) {
        this.f62574H = z;
    }

    public boolean isExternal() {
        return this.f62572F;
    }

    public boolean isInfix() {
        if (this.f62571E) {
            return true;
        }
        for (C14154y isInfix : m89079a().mo72234d()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f62573G;
    }

    public boolean isOperator() {
        if (this.f62570D) {
            return true;
        }
        for (C14154y isOperator : m89079a().mo72234d()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f62579M;
    }

    /* renamed from: j1 */
    public void mo72470j1(C14141u uVar) {
        if (uVar == null) {
            m89055h0(10);
        }
        this.f62569C = uVar;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return this.f62575I;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 d0Var = this.f62568B;
        if (d0Var == null) {
            m89055h0(15);
        }
        return d0Var;
    }

    /* renamed from: s0 */
    public C14154y mo72331s0() {
        return this.f62586T;
    }

    /* renamed from: t */
    public C14154y.C14155a<? extends C14154y> mo72401t() {
        C14023c S0 = mo72459S0(C14945l1.f64066b);
        if (S0 == null) {
            m89055h0(23);
        }
        return S0;
    }

    /* renamed from: u0 */
    public <V> V mo68665u0(C13908a.C13909a<V> aVar) {
        Map map = this.f62587U;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo71974i(this, d);
    }

    /* renamed from: x0 */
    public List<C14146w0> mo72238x0() {
        List<C14146w0> list = this.f62591s;
        if (list == null) {
            m89055h0(13);
        }
        return list;
    }

    /* renamed from: c */
    public C14154y m89082c(C14945l1 l1Var) {
        if (l1Var == null) {
            m89055h0(22);
        }
        if (l1Var.mo74212k()) {
            return this;
        }
        return mo72459S0(l1Var).mo72508n(m89079a()).mo72506l().mo72481J(true).build();
    }

    /* renamed from: a */
    public C14154y m89080a() {
        C14154y yVar = this.f62584R;
        C14154y a = yVar == this ? this : yVar.mo72233a();
        if (a == null) {
            m89055h0(20);
        }
        return a;
    }
}
