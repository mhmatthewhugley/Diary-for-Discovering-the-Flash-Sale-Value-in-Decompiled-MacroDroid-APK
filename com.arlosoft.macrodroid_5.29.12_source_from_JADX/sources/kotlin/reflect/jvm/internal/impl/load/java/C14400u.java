package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.java.C14401v;
import p297ja.C13318e;
import p297ja.C13337s;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.u */
/* compiled from: JavaNullabilityAnnotationSettings.kt */
public final class C14400u {

    /* renamed from: a */
    private static final C16152c f63174a;

    /* renamed from: b */
    private static final C16152c f63175b;

    /* renamed from: c */
    private static final C14167c0<C14401v> f63176c;

    /* renamed from: d */
    private static final C14401v f63177d;

    static {
        C16152c cVar = new C16152c("org.jspecify.nullness");
        f63174a = cVar;
        C16152c cVar2 = new C16152c("org.checkerframework.checker.nullness.compatqual");
        f63175b = cVar2;
        C16152c cVar3 = new C16152c("org.jetbrains.annotations");
        C14401v.C14402a aVar = C14401v.f63178d;
        C16152c cVar4 = new C16152c("androidx.annotation.RecentlyNullable");
        C14200f0 f0Var = C14200f0.WARN;
        C14200f0 f0Var2 = f0Var;
        C13318e eVar = new C13318e(1, 8);
        C14200f0 f0Var3 = C14200f0.STRICT;
        f63176c = new C14192d0(C13615t0.m87762l(C13337s.m85692a(cVar3, aVar.mo73091a()), C13337s.m85692a(new C16152c("androidx.annotation"), aVar.mo73091a()), C13337s.m85692a(new C16152c("android.support.annotation"), aVar.mo73091a()), C13337s.m85692a(new C16152c("android.annotation"), aVar.mo73091a()), C13337s.m85692a(new C16152c("com.android.annotations"), aVar.mo73091a()), C13337s.m85692a(new C16152c("org.eclipse.jdt.annotation"), aVar.mo73091a()), C13337s.m85692a(new C16152c("org.checkerframework.checker.nullness.qual"), aVar.mo73091a()), C13337s.m85692a(cVar2, aVar.mo73091a()), C13337s.m85692a(new C16152c("javax.annotation"), aVar.mo73091a()), C13337s.m85692a(new C16152c("edu.umd.cs.findbugs.annotations"), aVar.mo73091a()), C13337s.m85692a(new C16152c("io.reactivex.annotations"), aVar.mo73091a()), C13337s.m85692a(cVar4, new C14401v(f0Var2, (C13318e) null, (C14200f0) null, 4, (C13695i) null)), C13337s.m85692a(new C16152c("androidx.annotation.RecentlyNonNull"), new C14401v(f0Var2, (C13318e) null, (C14200f0) null, 4, (C13695i) null)), C13337s.m85692a(new C16152c("lombok"), aVar.mo73091a()), C13337s.m85692a(cVar, new C14401v(f0Var, eVar, f0Var3)), C13337s.m85692a(new C16152c("io.reactivex.rxjava3.annotations"), new C14401v(f0Var, new C13318e(1, 8), f0Var3))));
        f63177d = new C14401v(f0Var2, (C13318e) null, (C14200f0) null, 4, (C13695i) null);
    }

    /* renamed from: a */
    public static final C14407y m90445a(C13318e eVar) {
        C14200f0 f0Var;
        C13706o.m87929f(eVar, "configuredKotlinVersion");
        C14401v vVar = f63177d;
        if (vVar.mo73087d() == null || vVar.mo73087d().compareTo(eVar) > 0) {
            f0Var = vVar.mo73086c();
        } else {
            f0Var = vVar.mo73085b();
        }
        C14200f0 f0Var2 = f0Var;
        return new C14407y(f0Var2, m90447c(f0Var2), (Map) null, 4, (C13695i) null);
    }

    /* renamed from: b */
    public static /* synthetic */ C14407y m90446b(C13318e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = C13318e.f61316o;
        }
        return m90445a(eVar);
    }

    /* renamed from: c */
    public static final C14200f0 m90447c(C14200f0 f0Var) {
        C13706o.m87929f(f0Var, "globalReportLevel");
        if (f0Var == C14200f0.WARN) {
            return null;
        }
        return f0Var;
    }

    /* renamed from: d */
    public static final C14200f0 m90448d(C16152c cVar) {
        C13706o.m87929f(cVar, "annotationFqName");
        return m90451g(cVar, C14167c0.f62836a.mo72683a(), (C13318e) null, 4, (Object) null);
    }

    /* renamed from: e */
    public static final C16152c m90449e() {
        return f63174a;
    }

    /* renamed from: f */
    public static final C14200f0 m90450f(C16152c cVar, C14167c0<? extends C14200f0> c0Var, C13318e eVar) {
        C13706o.m87929f(cVar, "annotation");
        C13706o.m87929f(c0Var, "configuredReportLevels");
        C13706o.m87929f(eVar, "configuredKotlinVersion");
        C14200f0 f0Var = (C14200f0) c0Var.mo72682a(cVar);
        if (f0Var != null) {
            return f0Var;
        }
        C14401v a = f63176c.mo72682a(cVar);
        if (a == null) {
            return C14200f0.IGNORE;
        }
        if (a.mo73087d() == null || a.mo73087d().compareTo(eVar) > 0) {
            return a.mo73086c();
        }
        return a.mo73085b();
    }

    /* renamed from: g */
    public static /* synthetic */ C14200f0 m90451g(C16152c cVar, C14167c0 c0Var, C13318e eVar, int i, Object obj) {
        if ((i & 4) != 0) {
            eVar = new C13318e(1, 7, 0);
        }
        return m90450f(cVar, c0Var, eVar);
    }
}
