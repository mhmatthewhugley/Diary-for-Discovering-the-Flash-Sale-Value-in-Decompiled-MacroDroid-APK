package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p218bc.C11129d;
import p218bc.C11134i;
import p218bc.C11136k;
import p218bc.C11141p;
import p272gc.C12359f;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.d1 */
/* compiled from: AbstractTypeChecker.kt */
public class C14889d1 {

    /* renamed from: a */
    private final boolean f64009a;

    /* renamed from: b */
    private final boolean f64010b;

    /* renamed from: c */
    private final boolean f64011c;

    /* renamed from: d */
    private final C11141p f64012d;

    /* renamed from: e */
    private final C14927h f64013e;

    /* renamed from: f */
    private final C14931i f64014f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f64015g;

    /* renamed from: h */
    private boolean f64016h;

    /* renamed from: i */
    private ArrayDeque<C11136k> f64017i;

    /* renamed from: j */
    private Set<C11136k> f64018j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$a */
    /* compiled from: AbstractTypeChecker.kt */
    public interface C14890a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$a$a */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C14891a implements C14890a {

            /* renamed from: a */
            private boolean f64019a;

            /* renamed from: a */
            public void mo74139a(C16254a<Boolean> aVar) {
                C13706o.m87929f(aVar, "block");
                if (!this.f64019a) {
                    this.f64019a = aVar.invoke().booleanValue();
                }
            }

            /* renamed from: b */
            public final boolean mo74140b() {
                return this.f64019a;
            }
        }

        /* renamed from: a */
        void mo74139a(C16254a<Boolean> aVar);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$b */
    /* compiled from: AbstractTypeChecker.kt */
    public enum C14892b {
        CHECK_ONLY_LOWER,
        CHECK_SUBTYPE_AND_LOWER,
        SKIP_LOWER
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$c */
    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class C14893c {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$c$a */
        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class C14894a extends C14893c {
            public C14894a() {
                super((C13695i) null);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$c$b */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C14895b extends C14893c {

            /* renamed from: a */
            public static final C14895b f64024a = new C14895b();

            private C14895b() {
                super((C13695i) null);
            }

            /* renamed from: a */
            public C11136k mo74058a(C14889d1 d1Var, C11134i iVar) {
                C13706o.m87929f(d1Var, "state");
                C13706o.m87929f(iVar, "type");
                return d1Var.mo74131j().mo62314m0(iVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$c$c */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C14896c extends C14893c {

            /* renamed from: a */
            public static final C14896c f64025a = new C14896c();

            private C14896c() {
                super((C13695i) null);
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C11136k mo74058a(C14889d1 d1Var, C11134i iVar) {
                return (C11136k) mo74141b(d1Var, iVar);
            }

            /* renamed from: b */
            public Void mo74141b(C14889d1 d1Var, C11134i iVar) {
                C13706o.m87929f(d1Var, "state");
                C13706o.m87929f(iVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.d1$c$d */
        /* compiled from: AbstractTypeChecker.kt */
        public static final class C14897d extends C14893c {

            /* renamed from: a */
            public static final C14897d f64026a = new C14897d();

            private C14897d() {
                super((C13695i) null);
            }

            /* renamed from: a */
            public C11136k mo74058a(C14889d1 d1Var, C11134i iVar) {
                C13706o.m87929f(d1Var, "state");
                C13706o.m87929f(iVar, "type");
                return d1Var.mo74131j().mo62301f0(iVar);
            }
        }

        private C14893c() {
        }

        public /* synthetic */ C14893c(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public abstract C11136k mo74058a(C14889d1 d1Var, C11134i iVar);
    }

    public C14889d1(boolean z, boolean z2, boolean z3, C11141p pVar, C14927h hVar, C14931i iVar) {
        C13706o.m87929f(pVar, "typeSystemContext");
        C13706o.m87929f(hVar, "kotlinTypePreparator");
        C13706o.m87929f(iVar, "kotlinTypeRefiner");
        this.f64009a = z;
        this.f64010b = z2;
        this.f64011c = z3;
        this.f64012d = pVar;
        this.f64013e = hVar;
        this.f64014f = iVar;
    }

    /* renamed from: d */
    public static /* synthetic */ Boolean m92739d(C14889d1 d1Var, C11134i iVar, C11134i iVar2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            return d1Var.mo74126c(iVar, iVar2, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
    }

    /* renamed from: c */
    public Boolean mo74126c(C11134i iVar, C11134i iVar2, boolean z) {
        C13706o.m87929f(iVar, "subType");
        C13706o.m87929f(iVar2, "superType");
        return null;
    }

    /* renamed from: e */
    public final void mo74127e() {
        ArrayDeque<C11136k> arrayDeque = this.f64017i;
        C13706o.m87926c(arrayDeque);
        arrayDeque.clear();
        Set<C11136k> set = this.f64018j;
        C13706o.m87926c(set);
        set.clear();
        this.f64016h = false;
    }

    /* renamed from: f */
    public boolean mo73790f(C11134i iVar, C11134i iVar2) {
        C13706o.m87929f(iVar, "subType");
        C13706o.m87929f(iVar2, "superType");
        return true;
    }

    /* renamed from: g */
    public C14892b mo74128g(C11136k kVar, C11129d dVar) {
        C13706o.m87929f(kVar, "subType");
        C13706o.m87929f(dVar, "superType");
        return C14892b.CHECK_SUBTYPE_AND_LOWER;
    }

    /* renamed from: h */
    public final ArrayDeque<C11136k> mo74129h() {
        return this.f64017i;
    }

    /* renamed from: i */
    public final Set<C11136k> mo74130i() {
        return this.f64018j;
    }

    /* renamed from: j */
    public final C11141p mo74131j() {
        return this.f64012d;
    }

    /* renamed from: k */
    public final void mo74132k() {
        this.f64016h = true;
        if (this.f64017i == null) {
            this.f64017i = new ArrayDeque<>(4);
        }
        if (this.f64018j == null) {
            this.f64018j = C12359f.f59044d.mo68706a();
        }
    }

    /* renamed from: l */
    public final boolean mo74133l(C11134i iVar) {
        C13706o.m87929f(iVar, "type");
        return this.f64011c && this.f64012d.mo62287V(iVar);
    }

    /* renamed from: m */
    public final boolean mo74134m() {
        return this.f64009a;
    }

    /* renamed from: n */
    public final boolean mo74135n() {
        return this.f64010b;
    }

    /* renamed from: o */
    public final C11134i mo74136o(C11134i iVar) {
        C13706o.m87929f(iVar, "type");
        return this.f64013e.mo74061a(iVar);
    }

    /* renamed from: p */
    public final C11134i mo74137p(C11134i iVar) {
        C13706o.m87929f(iVar, "type");
        return this.f64014f.mo74071a(iVar);
    }

    /* renamed from: q */
    public boolean mo74138q(C16265l<? super C14890a, C13339u> lVar) {
        C13706o.m87929f(lVar, "block");
        C14890a.C14891a aVar = new C14890a.C14891a();
        lVar.invoke(aVar);
        return aVar.mo74140b();
    }
}
