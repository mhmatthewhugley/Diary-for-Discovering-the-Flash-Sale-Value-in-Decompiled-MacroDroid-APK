package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13846b;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13995h;
import p217bb.C11119b;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.e */
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class C13874e implements C11119b {

    /* renamed from: d */
    public static final C13876b f62133d = new C13876b((C13695i) null);

    /* renamed from: e */
    static final /* synthetic */ C16887m<Object>[] f62134e = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C13874e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C16152c f62135f = C13902k.f62196r;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C16157f f62136g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C16151b f62137h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13958g0 f62138a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<C13958g0, C14064m> f62139b;

    /* renamed from: c */
    private final C17006i f62140c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.e$a */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    static final class C13875a extends C13708q implements C16265l<C13958g0, C13846b> {

        /* renamed from: a */
        public static final C13875a f62141a = new C13875a();

        C13875a() {
            super(1);
        }

        /* renamed from: a */
        public final C13846b invoke(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "module");
            List<C14050k0> i0 = g0Var.mo72295V(C13874e.f62135f).mo72522i0();
            ArrayList arrayList = new ArrayList();
            for (T next : i0) {
                if (next instanceof C13846b) {
                    arrayList.add(next);
                }
            }
            return (C13846b) C13566b0.m87422W(arrayList);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.e$b */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class C13876b {
        private C13876b() {
        }

        public /* synthetic */ C13876b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16151b mo72191a() {
            return C13874e.f62137h;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.e$c */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    static final class C13877c extends C13708q implements C16254a<C13995h> {
        final /* synthetic */ C17012n $storageManager;
        final /* synthetic */ C13874e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13877c(C13874e eVar, C17012n nVar) {
            super(0);
            this.this$0 = eVar;
            this.$storageManager = nVar;
        }

        /* renamed from: a */
        public final C13995h invoke() {
            C13995h hVar = new C13995h((C14064m) this.this$0.f62139b.invoke(this.this$0.f62138a), C13874e.f62136g, C13945d0.ABSTRACT, C13951f.INTERFACE, C13612s.m87736e(this.this$0.f62138a.mo72296m().mo72136i()), C14158z0.f62778a, false, this.$storageManager);
            hVar.mo72402K0(new C13867a(this.$storageManager, hVar), C13627z0.m87806d(), (C13944d) null);
            return hVar;
        }
    }

    static {
        C16153d dVar = C13902k.C13903a.f62245d;
        C16157f i = dVar.mo78576i();
        C13706o.m87928e(i, "cloneable.shortName()");
        f62136g = i;
        C16151b m = C16151b.m96975m(dVar.mo78579l());
        C13706o.m87928e(m, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f62137h = m;
    }

    public C13874e(C17012n nVar, C13958g0 g0Var, C16265l<? super C13958g0, ? extends C14064m> lVar) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(g0Var, "moduleDescriptor");
        C13706o.m87929f(lVar, "computeContainingDeclaration");
        this.f62138a = g0Var;
        this.f62139b = lVar;
        this.f62140c = nVar.mo80221f(new C13877c(this, nVar));
    }

    /* renamed from: i */
    private final C13995h m88382i() {
        return (C13995h) C17011m.m100276a(this.f62140c, this, f62134e[0]);
    }

    /* renamed from: a */
    public Collection<C13948e> mo62146a(C16152c cVar) {
        C13706o.m87929f(cVar, "packageFqName");
        if (C13706o.m87924a(cVar, f62135f)) {
            return C13625y0.m87800c(m88382i());
        }
        return C13627z0.m87806d();
    }

    /* renamed from: b */
    public C13948e mo62147b(C16151b bVar) {
        C13706o.m87929f(bVar, "classId");
        if (C13706o.m87924a(bVar, f62137h)) {
            return m88382i();
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo62148c(C16152c cVar, C16157f fVar) {
        C13706o.m87929f(cVar, "packageFqName");
        C13706o.m87929f(fVar, "name");
        return C13706o.m87924a(fVar, f62136g) && C13706o.m87924a(cVar, f62135f);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13874e(C17012n nVar, C13958g0 g0Var, C16265l lVar, int i, C13695i iVar) {
        this(nVar, g0Var, (i & 4) != 0 ? C13875a.f62141a : lVar);
    }
}
