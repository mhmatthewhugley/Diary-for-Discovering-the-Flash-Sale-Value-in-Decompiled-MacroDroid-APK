package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14610a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14622j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14645v;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.f */
/* compiled from: annotationUtil.kt */
public final class C13919f {

    /* renamed from: a */
    private static final C16157f f62325a;

    /* renamed from: b */
    private static final C16157f f62326b;

    /* renamed from: c */
    private static final C16157f f62327c;

    /* renamed from: d */
    private static final C16157f f62328d;

    /* renamed from: e */
    private static final C16157f f62329e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.f$a */
    /* compiled from: annotationUtil.kt */
    static final class C13920a extends C13708q implements C16265l<C13958g0, C14900e0> {
        final /* synthetic */ C13853h $this_createDeprecatedAnnotation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13920a(C13853h hVar) {
            super(1);
            this.$this_createDeprecatedAnnotation = hVar;
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "module");
            C14951m0 l = g0Var.mo72296m().mo72139l(C14970r1.INVARIANT, this.$this_createDeprecatedAnnotation.mo72129W());
            C13706o.m87928e(l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return l;
        }
    }

    static {
        C16157f i = C16157f.m97019i("message");
        C13706o.m87928e(i, "identifier(\"message\")");
        f62325a = i;
        C16157f i2 = C16157f.m97019i("replaceWith");
        C13706o.m87928e(i2, "identifier(\"replaceWith\")");
        f62326b = i2;
        C16157f i3 = C16157f.m97019i("level");
        C13706o.m87928e(i3, "identifier(\"level\")");
        f62327c = i3;
        C16157f i4 = C16157f.m97019i("expression");
        C13706o.m87928e(i4, "identifier(\"expression\")");
        f62328d = i4;
        C16157f i5 = C16157f.m97019i("imports");
        C13706o.m87928e(i5, "identifier(\"imports\")");
        f62329e = i5;
    }

    /* renamed from: a */
    public static final C13915c m88494a(C13853h hVar, String str, String str2, String str3) {
        C13706o.m87929f(hVar, "<this>");
        C13706o.m87929f(str, "message");
        C13706o.m87929f(str2, "replaceWith");
        C13706o.m87929f(str3, "level");
        C13927j jVar = new C13927j(hVar, C13902k.C13903a.f62205B, C13615t0.m87762l(C13337s.m85692a(f62328d, new C14645v(str2)), C13337s.m85692a(f62329e, new C14612b(C13614t.m87748j(), new C13920a(hVar)))));
        C16152c cVar = C13902k.C13903a.f62287y;
        C16157f fVar = f62327c;
        C16151b m = C16151b.m96975m(C13902k.C13903a.f62203A);
        C13706o.m87928e(m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C16157f i = C16157f.m97019i(str3);
        C13706o.m87928e(i, "identifier(level)");
        return new C13927j(hVar, cVar, C13615t0.m87762l(C13337s.m85692a(f62325a, new C14645v(str)), C13337s.m85692a(f62326b, new C14610a(jVar)), C13337s.m85692a(fVar, new C14622j(m, i))));
    }

    /* renamed from: b */
    public static /* synthetic */ C13915c m88495b(C13853h hVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m88494a(hVar, str, str2, str3);
    }
}
