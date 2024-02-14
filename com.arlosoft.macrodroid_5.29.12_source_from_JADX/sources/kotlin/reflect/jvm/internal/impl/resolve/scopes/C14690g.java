package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p370qa.C16254a;
import p442yb.C17006i;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.g */
/* compiled from: LazyScopeAdapter.kt */
public final class C14690g extends C14677a {

    /* renamed from: b */
    private final C17006i<C14692h> f63721b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.g$a */
    /* compiled from: LazyScopeAdapter.kt */
    static final class C14691a extends C13708q implements C16254a<C14692h> {
        final /* synthetic */ C16254a<C14692h> $getScope;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14691a(C16254a<? extends C14692h> aVar) {
            super(0);
            this.$getScope = aVar;
        }

        /* renamed from: a */
        public final C14692h invoke() {
            C14692h invoke = this.$getScope.invoke();
            return invoke instanceof C14677a ? ((C14677a) invoke).mo73793h() : invoke;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14690g(C16254a<? extends C14692h> aVar) {
        this((C17012n) null, aVar, 1, (C13695i) null);
        C13706o.m87929f(aVar, "getScope");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C14690g(p442yb.C17012n r1, p370qa.C16254a r2, int r3, kotlin.jvm.internal.C13695i r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto L_0x000b
            yb.n r1 = p442yb.C16986f.f68366e
            java.lang.String r3 = "NO_LOCKS"
            kotlin.jvm.internal.C13706o.m87928e(r1, r3)
        L_0x000b:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.C14690g.<init>(yb.n, qa.a, int, kotlin.jvm.internal.i):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C14692h mo73794i() {
        return (C14692h) this.f63721b.invoke();
    }

    public C14690g(C17012n nVar, C16254a<? extends C14692h> aVar) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(aVar, "getScope");
        this.f63721b = nVar.mo80221f(new C14691a(aVar));
    }
}
