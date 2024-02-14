package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14704n;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p218bc.C11133h;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.d0 */
/* compiled from: IntersectionTypeConstructor.kt */
public final class C14884d0 implements C14901e1, C11133h {

    /* renamed from: a */
    private C14900e0 f64004a;

    /* renamed from: b */
    private final LinkedHashSet<C14900e0> f64005b;

    /* renamed from: c */
    private final int f64006c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d0$a */
    /* compiled from: IntersectionTypeConstructor.kt */
    static final class C14885a extends C13708q implements C16265l<C14849g, C14951m0> {
        final /* synthetic */ C14884d0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14885a(C14884d0 d0Var) {
            super(1);
            this.this$0 = d0Var;
        }

        /* renamed from: a */
        public final C14951m0 invoke(C14849g gVar) {
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            return this.this$0.mo72368a(gVar).mo74115f();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d0$b */
    /* compiled from: Comparisons.kt */
    public static final class C14886b<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ C16265l f64007a;

        public C14886b(C16265l lVar) {
            this.f64007a = lVar;
        }

        public final int compare(T t, T t2) {
            C14900e0 e0Var = (C14900e0) t;
            C16265l lVar = this.f64007a;
            C13706o.m87928e(e0Var, "it");
            String obj = lVar.invoke(e0Var).toString();
            C14900e0 e0Var2 = (C14900e0) t2;
            C16265l lVar2 = this.f64007a;
            C13706o.m87928e(e0Var2, "it");
            return C15612b.m94865a(obj, lVar2.invoke(e0Var2).toString());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d0$c */
    /* compiled from: IntersectionTypeConstructor.kt */
    static final class C14887c extends C13708q implements C16265l<C14900e0, String> {

        /* renamed from: a */
        public static final C14887c f64008a = new C14887c();

        C14887c() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "it");
            return e0Var.toString();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d0$d */
    /* compiled from: IntersectionTypeConstructor.kt */
    static final class C14888d extends C13708q implements C16265l<C14900e0, CharSequence> {
        final /* synthetic */ C16265l<C14900e0, Object> $getProperTypeRelatedToStringify;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14888d(C16265l<? super C14900e0, ? extends Object> lVar) {
            super(1);
            this.$getProperTypeRelatedToStringify = lVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(C14900e0 e0Var) {
            C16265l<C14900e0, Object> lVar = this.$getProperTypeRelatedToStringify;
            C13706o.m87928e(e0Var, "it");
            return lVar.invoke(e0Var).toString();
        }
    }

    public C14884d0(Collection<? extends C14900e0> collection) {
        C13706o.m87929f(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<C14900e0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f64005b = linkedHashSet;
        this.f64006c = linkedHashSet.hashCode();
    }

    /* renamed from: i */
    public static /* synthetic */ String m92722i(C14884d0 d0Var, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = C14887c.f64008a;
        }
        return d0Var.mo74117h(lVar);
    }

    /* renamed from: c */
    public C13961h mo62183c() {
        return null;
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return false;
    }

    /* renamed from: e */
    public final C14692h mo74113e() {
        return C14704n.f63734d.mo73829a("member scope for intersection type", this.f64005b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14884d0)) {
            return false;
        }
        return C13706o.m87924a(this.f64005b, ((C14884d0) obj).f64005b);
    }

    /* renamed from: f */
    public final C14951m0 mo74115f() {
        return C14906f0.m92823k(C14830a1.f63959c.mo74051h(), this, C13614t.m87748j(), false, mo74113e(), new C14885a(this));
    }

    /* renamed from: g */
    public final C14900e0 mo74116g() {
        return this.f64004a;
    }

    public List<C13950e1> getParameters() {
        return C13614t.m87748j();
    }

    /* renamed from: h */
    public final String mo74117h(C16265l<? super C14900e0, ? extends Object> lVar) {
        C13706o.m87929f(lVar, "getProperTypeRelatedToStringify");
        return C13566b0.m87432g0(C13566b0.m87450y0(this.f64005b, new C14886b(lVar)), " & ", "{", "}", 0, (CharSequence) null, new C14888d(lVar), 24, (Object) null);
    }

    public int hashCode() {
        return this.f64006c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.d0} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [kotlin.reflect.jvm.internal.impl.types.e0] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.types.C14884d0 mo72368a(kotlin.reflect.jvm.internal.impl.types.checker.C14849g r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            java.util.Collection r0 = r4.mo72370l()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C13616u.m87774u(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0019:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002f
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r2
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r2.mo72946P0(r5)
            r3 = 1
            r1.add(r2)
            r2 = 1
            goto L_0x0019
        L_0x002f:
            r0 = 0
            if (r2 != 0) goto L_0x0033
            goto L_0x0046
        L_0x0033:
            kotlin.reflect.jvm.internal.impl.types.e0 r2 = r4.mo74116g()
            if (r2 == 0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r2.mo72946P0(r5)
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.types.d0 r5 = new kotlin.reflect.jvm.internal.impl.types.d0
            r5.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.d0 r0 = r5.mo74120k(r0)
        L_0x0046:
            if (r0 != 0) goto L_0x0049
            r0 = r4
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14884d0.mo72368a(kotlin.reflect.jvm.internal.impl.types.checker.g):kotlin.reflect.jvm.internal.impl.types.d0");
    }

    /* renamed from: k */
    public final C14884d0 mo74120k(C14900e0 e0Var) {
        return new C14884d0(this.f64005b, e0Var);
    }

    /* renamed from: l */
    public Collection<C14900e0> mo72370l() {
        return this.f64005b;
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        C13853h m = ((C14900e0) this.f64005b.iterator().next()).mo73702N0().mo72371m();
        C13706o.m87928e(m, "intersectedTypes.iterato…xt().constructor.builtIns");
        return m;
    }

    public String toString() {
        return m92722i(this, (C16265l) null, 1, (Object) null);
    }

    private C14884d0(Collection<? extends C14900e0> collection, C14900e0 e0Var) {
        this(collection);
        this.f64004a = e0Var;
    }
}
