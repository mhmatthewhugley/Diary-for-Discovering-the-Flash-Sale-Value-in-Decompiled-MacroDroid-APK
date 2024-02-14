package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14836c0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14928h0;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14965q;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p297ja.C13328m;
import p370qa.C16254a;
import p442yb.C16986f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d */
/* compiled from: CapturedTypeConstructor.kt */
public final class C14607d {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d$a */
    /* compiled from: CapturedTypeConstructor.kt */
    static final class C14608a extends C13708q implements C16254a<C14900e0> {
        final /* synthetic */ C14926g1 $this_createCapturedIfNeeded;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14608a(C14926g1 g1Var) {
            super(0);
            this.$this_createCapturedIfNeeded = g1Var;
        }

        /* renamed from: a */
        public final C14900e0 invoke() {
            C14900e0 type = this.$this_createCapturedIfNeeded.getType();
            C13706o.m87928e(type, "this@createCapturedIfNeeded.type");
            return type;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d$b */
    /* compiled from: CapturedTypeConstructor.kt */
    public static final class C14609b extends C14965q {

        /* renamed from: d */
        final /* synthetic */ boolean f63613d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14609b(C14936j1 j1Var, boolean z) {
            super(j1Var);
            this.f63613d = z;
        }

        /* renamed from: b */
        public boolean mo73714b() {
            return this.f63613d;
        }

        /* JADX WARNING: type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlin.reflect.jvm.internal.impl.types.C14926g1 mo72941e(kotlin.reflect.jvm.internal.impl.types.C14900e0 r4) {
            /*
                r3 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.C13706o.m87929f(r4, r0)
                kotlin.reflect.jvm.internal.impl.types.g1 r0 = super.mo72941e(r4)
                r1 = 0
                if (r0 == 0) goto L_0x001f
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = r4.mo73702N0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r4 = r4.mo62183c()
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13950e1
                if (r2 == 0) goto L_0x001b
                r1 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r1
            L_0x001b:
                kotlin.reflect.jvm.internal.impl.types.g1 r1 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d.m91512b(r0, r1)
            L_0x001f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d.C14609b.mo72941e(kotlin.reflect.jvm.internal.impl.types.e0):kotlin.reflect.jvm.internal.impl.types.g1");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14926g1 m91512b(C14926g1 g1Var, C13950e1 e1Var) {
        if (e1Var == null || g1Var.mo74185c() == C14970r1.INVARIANT) {
            return g1Var;
        }
        if (e1Var.mo72273l() != g1Var.mo74185c()) {
            return new C14933i1(m91513c(g1Var));
        }
        if (!g1Var.mo74184b()) {
            return new C14933i1(g1Var.getType());
        }
        C17012n nVar = C16986f.f68366e;
        C13706o.m87928e(nVar, "NO_LOCKS");
        return new C14933i1(new C14928h0(nVar, new C14608a(g1Var)));
    }

    /* renamed from: c */
    public static final C14900e0 m91513c(C14926g1 g1Var) {
        C13706o.m87929f(g1Var, "typeProjection");
        return new C14604a(g1Var, (C14605b) null, false, (C14830a1) null, 14, (C13695i) null);
    }

    /* renamed from: d */
    public static final boolean m91514d(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return e0Var.mo73702N0() instanceof C14605b;
    }

    /* renamed from: e */
    public static final C14936j1 m91515e(C14936j1 j1Var, boolean z) {
        C13706o.m87929f(j1Var, "<this>");
        if (!(j1Var instanceof C14836c0)) {
            return new C14609b(j1Var, z);
        }
        C14836c0 c0Var = (C14836c0) j1Var;
        C13950e1[] j = c0Var.mo74057j();
        List<C13328m> y0 = C13596m.m87633y0(c0Var.mo74056i(), c0Var.mo74057j());
        ArrayList arrayList = new ArrayList(C13616u.m87774u(y0, 10));
        for (C13328m mVar : y0) {
            arrayList.add(m91512b((C14926g1) mVar.mo70154c(), (C13950e1) mVar.mo70155d()));
        }
        Object[] array = arrayList.toArray(new C14926g1[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return new C14836c0(j, (C14926g1[]) array, z);
    }

    /* renamed from: f */
    public static /* synthetic */ C14936j1 m91516f(C14936j1 j1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m91515e(j1Var, z);
    }
}
