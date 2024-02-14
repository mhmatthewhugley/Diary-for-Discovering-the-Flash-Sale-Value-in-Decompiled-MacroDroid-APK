package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import p297ja.C13318e;
import p362pb.C16152c;
import p370qa.C16265l;
import p433xa.C16878g;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.w */
/* compiled from: JavaTypeEnhancementState.kt */
public final class C14403w {

    /* renamed from: d */
    public static final C14405b f63183d = new C14405b((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C14403w f63184e = new C14403w(C14400u.m90446b((C13318e) null, 1, (Object) null), C14404a.f63188a);

    /* renamed from: a */
    private final C14407y f63185a;

    /* renamed from: b */
    private final C16265l<C16152c, C14200f0> f63186b;

    /* renamed from: c */
    private final boolean f63187c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.w$a */
    /* compiled from: JavaTypeEnhancementState.kt */
    /* synthetic */ class C14404a extends C13703l implements C16265l<C16152c, C14200f0> {

        /* renamed from: a */
        public static final C14404a f63188a = new C14404a();

        C14404a() {
            super(1);
        }

        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        public final C16878g getOwner() {
            return C13687e0.m87870d(C14400u.class, "compiler.common.jvm");
        }

        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        /* renamed from: l */
        public final C14200f0 invoke(C16152c cVar) {
            C13706o.m87929f(cVar, "p0");
            return C14400u.m90448d(cVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.w$b */
    /* compiled from: JavaTypeEnhancementState.kt */
    public static final class C14405b {
        private C14405b() {
        }

        public /* synthetic */ C14405b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14403w mo73097a() {
            return C14403w.f63184e;
        }
    }

    public C14403w(C14407y yVar, C16265l<? super C16152c, ? extends C14200f0> lVar) {
        C13706o.m87929f(yVar, "jsr305");
        C13706o.m87929f(lVar, "getReportLevelForAnnotation");
        this.f63185a = yVar;
        this.f63186b = lVar;
        this.f63187c = yVar.mo73103d() || lVar.invoke(C14400u.m90449e()) == C14200f0.IGNORE;
    }

    /* renamed from: b */
    public final boolean mo73092b() {
        return this.f63187c;
    }

    /* renamed from: c */
    public final C16265l<C16152c, C14200f0> mo73093c() {
        return this.f63186b;
    }

    /* renamed from: d */
    public final C14407y mo73094d() {
        return this.f63185a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f63185a + ", getReportLevelForAnnotation=" + this.f63186b + ')';
    }
}
