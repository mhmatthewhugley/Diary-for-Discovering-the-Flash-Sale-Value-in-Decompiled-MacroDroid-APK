package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14942k1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p297ja.C13321g;
import p370qa.C16254a;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n */
/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class C14628n implements C14901e1 {

    /* renamed from: f */
    public static final C14629a f63623f = new C14629a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f63624a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13958g0 f63625b;

    /* renamed from: c */
    private final Set<C14900e0> f63626c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14951m0 f63627d;

    /* renamed from: e */
    private final C13321g f63628e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$a */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class C14629a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$a$a */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        private enum C14630a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$a$b */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class C14631b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63632a;

            static {
                int[] iArr = new int[C14630a.values().length];
                iArr[C14630a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[C14630a.INTERSECTION_TYPE.ordinal()] = 2;
                f63632a = iArr;
            }
        }

        private C14629a() {
        }

        public /* synthetic */ C14629a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        private final C14951m0 m91567a(Collection<? extends C14951m0> collection, C14630a aVar) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it = collection.iterator();
            if (it.hasNext()) {
                T next = it.next();
                while (it.hasNext()) {
                    C14629a aVar2 = C14628n.f63623f;
                    next = aVar2.m91570e((C14951m0) next, (C14951m0) it.next(), aVar);
                }
                return (C14951m0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        /* renamed from: c */
        private final C14951m0 m91568c(C14628n nVar, C14628n nVar2, C14630a aVar) {
            Set set;
            int i = C14631b.f63632a[aVar.ordinal()];
            if (i == 1) {
                set = C13566b0.m87428c0(nVar.mo73741i(), nVar2.mo73741i());
            } else if (i == 2) {
                set = C13566b0.m87409L0(nVar.mo73741i(), nVar2.mo73741i());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return C14906f0.m92817e(C14830a1.f63959c.mo74051h(), new C14628n(nVar.f63624a, nVar.f63625b, set, (C13695i) null), false);
        }

        /* renamed from: d */
        private final C14951m0 m91569d(C14628n nVar, C14951m0 m0Var) {
            if (nVar.mo73741i().contains(m0Var)) {
                return m0Var;
            }
            return null;
        }

        /* renamed from: e */
        private final C14951m0 m91570e(C14951m0 m0Var, C14951m0 m0Var2, C14630a aVar) {
            if (m0Var == null || m0Var2 == null) {
                return null;
            }
            C14901e1 N0 = m0Var.mo73702N0();
            C14901e1 N02 = m0Var2.mo73702N0();
            boolean z = N0 instanceof C14628n;
            if (z && (N02 instanceof C14628n)) {
                return m91568c((C14628n) N0, (C14628n) N02, aVar);
            }
            if (z) {
                return m91569d((C14628n) N0, m0Var2);
            }
            if (N02 instanceof C14628n) {
                return m91569d((C14628n) N02, m0Var);
            }
            return null;
        }

        /* renamed from: b */
        public final C14951m0 mo73743b(Collection<? extends C14951m0> collection) {
            C13706o.m87929f(collection, "types");
            return m91567a(collection, C14630a.INTERSECTION_TYPE);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$b */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class C14632b extends C13708q implements C16254a<List<C14951m0>> {
        final /* synthetic */ C14628n this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14632b(C14628n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* renamed from: a */
        public final List<C14951m0> invoke() {
            C14951m0 p = this.this$0.mo72371m().mo72149x().mo72274p();
            C13706o.m87928e(p, "builtIns.comparable.defaultType");
            List<C14951m0> p2 = C13614t.m87754p(C14942k1.m92926f(p, C13612s.m87736e(new C14933i1(C14970r1.IN_VARIANCE, this.this$0.f63627d)), (C14830a1) null, 2, (Object) null));
            if (!this.this$0.m91559k()) {
                p2.add(this.this$0.mo72371m().mo72122L());
            }
            return p2;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.n$c */
    /* compiled from: IntegerLiteralTypeConstructor.kt */
    static final class C14633c extends C13708q implements C16265l<C14900e0, CharSequence> {

        /* renamed from: a */
        public static final C14633c f63633a = new C14633c();

        C14633c() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "it");
            return e0Var.toString();
        }
    }

    private C14628n(long j, C13958g0 g0Var, Set<? extends C14900e0> set) {
        this.f63627d = C14906f0.m92817e(C14830a1.f63959c.mo74051h(), this, false);
        this.f63628e = C13323i.m85669b(new C14632b(this));
        this.f63624a = j;
        this.f63625b = g0Var;
        this.f63626c = set;
    }

    public /* synthetic */ C14628n(long j, C13958g0 g0Var, Set set, C13695i iVar) {
        this(j, g0Var, set);
    }

    /* renamed from: j */
    private final List<C14900e0> m91558j() {
        return (List) this.f63628e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m91559k() {
        Collection<C14900e0> a = C14643t.m91592a(this.f63625b);
        if ((a instanceof Collection) && a.isEmpty()) {
            return true;
        }
        for (C14900e0 contains : a) {
            if (!(!this.f63626c.contains(contains))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private final String m91560n() {
        return '[' + C13566b0.m87432g0(this.f63626c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14633c.f63633a, 30, (Object) null) + ']';
    }

    /* renamed from: a */
    public C14901e1 mo72368a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: c */
    public C13961h mo62183c() {
        return null;
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return false;
    }

    public List<C13950e1> getParameters() {
        return C13614t.m87748j();
    }

    /* renamed from: i */
    public final Set<C14900e0> mo73741i() {
        return this.f63626c;
    }

    /* renamed from: l */
    public Collection<C14900e0> mo72370l() {
        return m91558j();
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        return this.f63625b.mo72296m();
    }

    public String toString() {
        return "IntegerLiteralType" + m91560n();
    }
}
