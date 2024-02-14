package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0 */
/* compiled from: ScopesHolderForClass.kt */
public final class C14150x0<T extends C14692h> {

    /* renamed from: e */
    public static final C14151a f62770e = new C14151a((C13695i) null);

    /* renamed from: f */
    static final /* synthetic */ C16887m<Object>[] f62771f = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14150x0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a */
    private final C13948e f62772a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16265l<C14849g, T> f62773b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14849g f62774c;

    /* renamed from: d */
    private final C17006i f62775d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$a */
    /* compiled from: ScopesHolderForClass.kt */
    public static final class C14151a {
        private C14151a() {
        }

        public /* synthetic */ C14151a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final <T extends C14692h> C14150x0<T> mo72665a(C13948e eVar, C17012n nVar, C14849g gVar, C16265l<? super C14849g, ? extends T> lVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            C13706o.m87929f(nVar, "storageManager");
            C13706o.m87929f(gVar, "kotlinTypeRefinerForOwnerModule");
            C13706o.m87929f(lVar, "scopeFactory");
            return new C14150x0(eVar, nVar, lVar, gVar, (C13695i) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$b */
    /* compiled from: ScopesHolderForClass.kt */
    static final class C14152b extends C13708q implements C16254a<T> {
        final /* synthetic */ C14849g $kotlinTypeRefiner;
        final /* synthetic */ C14150x0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14152b(C14150x0<T> x0Var, C14849g gVar) {
            super(0);
            this.this$0 = x0Var;
            this.$kotlinTypeRefiner = gVar;
        }

        /* renamed from: a */
        public final T invoke() {
            return (C14692h) this.this$0.f62773b.invoke(this.$kotlinTypeRefiner);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.x0$c */
    /* compiled from: ScopesHolderForClass.kt */
    static final class C14153c extends C13708q implements C16254a<T> {
        final /* synthetic */ C14150x0<T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14153c(C14150x0<T> x0Var) {
            super(0);
            this.this$0 = x0Var;
        }

        /* renamed from: a */
        public final T invoke() {
            return (C14692h) this.this$0.f62773b.invoke(this.this$0.f62774c);
        }
    }

    private C14150x0(C13948e eVar, C17012n nVar, C16265l<? super C14849g, ? extends T> lVar, C14849g gVar) {
        this.f62772a = eVar;
        this.f62773b = lVar;
        this.f62774c = gVar;
        this.f62775d = nVar.mo80221f(new C14153c(this));
    }

    public /* synthetic */ C14150x0(C13948e eVar, C17012n nVar, C16265l lVar, C14849g gVar, C13695i iVar) {
        this(eVar, nVar, lVar, gVar);
    }

    /* renamed from: d */
    private final T m89572d() {
        return (C14692h) C17011m.m100276a(this.f62775d, this, f62771f[0]);
    }

    /* renamed from: c */
    public final T mo72664c(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        if (!gVar.mo74066d(C16519a.m98619l(this.f62772a))) {
            return m89572d();
        }
        C14901e1 j = this.f62772a.mo62171j();
        C13706o.m87928e(j, "classDescriptor.typeConstructor");
        if (!gVar.mo74067e(j)) {
            return m89572d();
        }
        return gVar.mo74065c(this.f62772a, new C14152b(this, gVar));
    }
}
