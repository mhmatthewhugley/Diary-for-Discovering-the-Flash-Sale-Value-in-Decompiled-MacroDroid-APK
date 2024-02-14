package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p225cc.C11170a;
import p362pb.C16151b;
import p389sb.C16519a;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q */
/* compiled from: constantValues.kt */
public final class C14636q extends C14617g<C14638b> {

    /* renamed from: b */
    public static final C14637a f63637b = new C14637a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q$a */
    /* compiled from: constantValues.kt */
    public static final class C14637a {
        private C14637a() {
        }

        public /* synthetic */ C14637a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14617g<?> mo73749a(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "argumentType");
            if (C14925g0.m92873a(e0Var)) {
                return null;
            }
            C14900e0 e0Var2 = e0Var;
            int i = 0;
            while (C13853h.m88255c0(e0Var2)) {
                e0Var2 = ((C14926g1) C13566b0.m87446u0(e0Var2.mo73700L0())).getType();
                C13706o.m87928e(e0Var2, "type.arguments.single().type");
                i++;
            }
            C13961h c = e0Var2.mo73702N0().mo62183c();
            if (c instanceof C13948e) {
                C16151b g = C16519a.m98614g(c);
                if (g == null) {
                    return new C14636q((C14638b) new C14638b.C14639a(e0Var));
                }
                return new C14636q(g, i);
            } else if (!(c instanceof C13950e1)) {
                return null;
            } else {
                C16151b m = C16151b.m96975m(C13902k.C13903a.f62241b.mo78579l());
                C13706o.m87928e(m, "topLevel(StandardNames.FqNames.any.toSafe())");
                return new C14636q(m, 0);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q$b */
    /* compiled from: constantValues.kt */
    public static abstract class C14638b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$a */
        /* compiled from: constantValues.kt */
        public static final class C14639a extends C14638b {

            /* renamed from: a */
            private final C14900e0 f63638a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14639a(C14900e0 e0Var) {
                super((C13695i) null);
                C13706o.m87929f(e0Var, "type");
                this.f63638a = e0Var;
            }

            /* renamed from: a */
            public final C14900e0 mo73750a() {
                return this.f63638a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14639a) && C13706o.m87924a(this.f63638a, ((C14639a) obj).f63638a);
            }

            public int hashCode() {
                return this.f63638a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f63638a + ')';
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$b */
        /* compiled from: constantValues.kt */
        public static final class C14640b extends C14638b {

            /* renamed from: a */
            private final C14616f f63639a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14640b(C14616f fVar) {
                super((C13695i) null);
                C13706o.m87929f(fVar, "value");
                this.f63639a = fVar;
            }

            /* renamed from: a */
            public final int mo73754a() {
                return this.f63639a.mo73722c();
            }

            /* renamed from: b */
            public final C16151b mo73755b() {
                return this.f63639a.mo73723d();
            }

            /* renamed from: c */
            public final C14616f mo73756c() {
                return this.f63639a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C14640b) && C13706o.m87924a(this.f63639a, ((C14640b) obj).f63639a);
            }

            public int hashCode() {
                return this.f63639a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f63639a + ')';
            }
        }

        private C14638b() {
        }

        public /* synthetic */ C14638b(C13695i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14636q(C14638b bVar) {
        super(bVar);
        C13706o.m87929f(bVar, "value");
    }

    /* renamed from: a */
    public C14900e0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14830a1 h = C14830a1.f63959c.mo74051h();
        C13948e E = g0Var.mo72296m().mo72115E();
        C13706o.m87928e(E, "module.builtIns.kClass");
        return C14906f0.m92819g(h, E, C13612s.m87736e(new C14933i1(mo73748c(g0Var))));
    }

    /* renamed from: c */
    public final C14900e0 mo73748c(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14638b bVar = (C14638b) mo73727b();
        if (bVar instanceof C14638b.C14639a) {
            return ((C14638b.C14639a) mo73727b()).mo73750a();
        }
        if (bVar instanceof C14638b.C14640b) {
            C14616f c = ((C14638b.C14640b) mo73727b()).mo73756c();
            C16151b a = c.mo73720a();
            int b = c.mo73721b();
            C13948e a2 = C14147x.m89564a(g0Var, a);
            if (a2 == null) {
                C17087j jVar = C17087j.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String bVar2 = a.toString();
                C13706o.m87928e(bVar2, "classId.toString()");
                return C17088k.m100540d(jVar, bVar2, String.valueOf(b));
            }
            C14951m0 p = a2.mo72274p();
            C13706o.m87928e(p, "descriptor.defaultType");
            C14900e0 w = C11170a.m74974w(p);
            for (int i = 0; i < b; i++) {
                w = g0Var.mo72296m().mo72139l(C14970r1.INVARIANT, w);
                C13706o.m87928e(w, "module.builtIns.getArray…Variance.INVARIANT, type)");
            }
            return w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14636q(C14616f fVar) {
        this((C14638b) new C14638b.C14640b(fVar));
        C13706o.m87929f(fVar, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14636q(C16151b bVar, int i) {
        this(new C14616f(bVar, i));
        C13706o.m87929f(bVar, "classId");
    }
}
