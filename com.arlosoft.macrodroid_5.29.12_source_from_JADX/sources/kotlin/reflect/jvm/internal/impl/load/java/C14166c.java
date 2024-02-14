package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14352h;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14353i;
import p297ja.C13337s;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.c */
/* compiled from: AnnotationQualifiersFqNames.kt */
public final class C14166c {

    /* renamed from: a */
    private static final C16152c f62828a = new C16152c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C16152c f62829b = new C16152c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C16152c f62830c = new C16152c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C16152c f62831d = new C16152c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<C14164b> f62832e;

    /* renamed from: f */
    private static final Map<C16152c, C14330q> f62833f;

    /* renamed from: g */
    private static final Map<C16152c, C14330q> f62834g;

    /* renamed from: h */
    private static final Set<C16152c> f62835h = C13627z0.m87809g(C14165b0.m89641f(), C14165b0.m89640e());

    static {
        C14164b bVar = C14164b.VALUE_PARAMETER;
        List<C14164b> m = C13614t.m87751m(C14164b.FIELD, C14164b.METHOD_RETURN_TYPE, bVar, C14164b.TYPE_PARAMETER_BOUNDS, C14164b.TYPE_USE);
        f62832e = m;
        C16152c i = C14165b0.m89644i();
        C14352h hVar = C14352h.NOT_NULL;
        Map<C16152c, C14330q> f = C13613s0.m87741f(C13337s.m85692a(i, new C14330q(new C14353i(hVar, false, 2, (C13695i) null), m, false)));
        f62833f = f;
        f62834g = C13615t0.m87765o(C13615t0.m87762l(C13337s.m85692a(new C16152c("javax.annotation.ParametersAreNullableByDefault"), new C14330q(new C14353i(C14352h.NULLABLE, false, 2, (C13695i) null), C13612s.m87736e(bVar), false, 4, (C13695i) null)), C13337s.m85692a(new C16152c("javax.annotation.ParametersAreNonnullByDefault"), new C14330q(new C14353i(hVar, false, 2, (C13695i) null), C13612s.m87736e(bVar), false, 4, (C13695i) null))), f);
    }

    /* renamed from: a */
    public static final Map<C16152c, C14330q> m89649a() {
        return f62834g;
    }

    /* renamed from: b */
    public static final Set<C16152c> m89650b() {
        return f62835h;
    }

    /* renamed from: c */
    public static final Map<C16152c, C14330q> m89651c() {
        return f62833f;
    }

    /* renamed from: d */
    public static final C16152c m89652d() {
        return f62831d;
    }

    /* renamed from: e */
    public static final C16152c m89653e() {
        return f62830c;
    }

    /* renamed from: f */
    public static final C16152c m89654f() {
        return f62829b;
    }

    /* renamed from: g */
    public static final C16152c m89655g() {
        return f62828a;
    }
}
