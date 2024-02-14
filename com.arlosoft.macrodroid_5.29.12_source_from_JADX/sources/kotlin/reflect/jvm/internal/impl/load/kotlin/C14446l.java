package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p398tb.C16610e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.l */
/* compiled from: methodSignatureMapping.kt */
public abstract class C14446l {

    /* renamed from: a */
    public static final C14448b f63289a = new C14448b((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C14450d f63290b = new C14450d(C16610e.BOOLEAN);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C14450d f63291c = new C14450d(C16610e.CHAR);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C14450d f63292d = new C14450d(C16610e.BYTE);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C14450d f63293e = new C14450d(C16610e.SHORT);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C14450d f63294f = new C14450d(C16610e.INT);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C14450d f63295g = new C14450d(C16610e.FLOAT);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C14450d f63296h = new C14450d(C16610e.LONG);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C14450d f63297i = new C14450d(C16610e.DOUBLE);

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.l$a */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C14447a extends C14446l {

        /* renamed from: j */
        private final C14446l f63298j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14447a(C14446l lVar) {
            super((C13695i) null);
            C13706o.m87929f(lVar, "elementType");
            this.f63298j = lVar;
        }

        /* renamed from: i */
        public final C14446l mo73178i() {
            return this.f63298j;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.l$b */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C14448b {
        private C14448b() {
        }

        public /* synthetic */ C14448b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14450d mo73179a() {
            return C14446l.f63290b;
        }

        /* renamed from: b */
        public final C14450d mo73180b() {
            return C14446l.f63292d;
        }

        /* renamed from: c */
        public final C14450d mo73181c() {
            return C14446l.f63291c;
        }

        /* renamed from: d */
        public final C14450d mo73182d() {
            return C14446l.f63297i;
        }

        /* renamed from: e */
        public final C14450d mo73183e() {
            return C14446l.f63295g;
        }

        /* renamed from: f */
        public final C14450d mo73184f() {
            return C14446l.f63294f;
        }

        /* renamed from: g */
        public final C14450d mo73185g() {
            return C14446l.f63296h;
        }

        /* renamed from: h */
        public final C14450d mo73186h() {
            return C14446l.f63293e;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.l$c */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C14449c extends C14446l {

        /* renamed from: j */
        private final String f63299j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14449c(String str) {
            super((C13695i) null);
            C13706o.m87929f(str, "internalName");
            this.f63299j = str;
        }

        /* renamed from: i */
        public final String mo73187i() {
            return this.f63299j;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.l$d */
    /* compiled from: methodSignatureMapping.kt */
    public static final class C14450d extends C14446l {

        /* renamed from: j */
        private final C16610e f63300j;

        public C14450d(C16610e eVar) {
            super((C13695i) null);
            this.f63300j = eVar;
        }

        /* renamed from: i */
        public final C16610e mo73188i() {
            return this.f63300j;
        }
    }

    private C14446l() {
    }

    public /* synthetic */ C14446l(C13695i iVar) {
        this();
    }

    public String toString() {
        return C14452n.f63301a.mo73192d(this);
    }
}
