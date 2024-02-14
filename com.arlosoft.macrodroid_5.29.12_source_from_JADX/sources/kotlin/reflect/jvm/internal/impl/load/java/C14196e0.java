package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import p253ec.C12187a;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.e0 */
/* compiled from: propertiesConventionUtil.kt */
public final class C14196e0 {
    /* renamed from: a */
    public static final List<C16157f> m89732a(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        String d = fVar.mo78583d();
        C13706o.m87928e(d, "name.asString()");
        if (C14409z.m90471c(d)) {
            return C13614t.m87752n(m89733b(fVar));
        }
        if (C14409z.m90472d(d)) {
            return m89737f(fVar);
        }
        return C14202g.f62890a.mo72732b(fVar);
    }

    /* renamed from: b */
    public static final C16157f m89733b(C16157f fVar) {
        C13706o.m87929f(fVar, "methodName");
        C16157f e = m89736e(fVar, "get", false, (String) null, 12, (Object) null);
        return e == null ? m89736e(fVar, "is", false, (String) null, 8, (Object) null) : e;
    }

    /* renamed from: c */
    public static final C16157f m89734c(C16157f fVar, boolean z) {
        C13706o.m87929f(fVar, "methodName");
        return m89736e(fVar, "set", false, z ? "is" : null, 4, (Object) null);
    }

    /* renamed from: d */
    private static final C16157f m89735d(C16157f fVar, String str, boolean z, String str2) {
        if (fVar.mo78588j()) {
            return null;
        }
        String f = fVar.mo78586f();
        C13706o.m87928e(f, "methodName.identifier");
        boolean z2 = false;
        if (!C15176v.m93634I(f, str, false, 2, (Object) null) || f.length() == str.length()) {
            return null;
        }
        char charAt = f.charAt(str.length());
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        if (str2 != null) {
            return C16157f.m97019i(str2 + C15177w.m93698q0(f, str));
        } else if (!z) {
            return fVar;
        } else {
            String c = C12187a.m82852c(C15177w.m93698q0(f, str), true);
            if (!C16157f.m97020k(c)) {
                return null;
            }
            return C16157f.m97019i(c);
        }
    }

    /* renamed from: e */
    static /* synthetic */ C16157f m89736e(C16157f fVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m89735d(fVar, str, z, str2);
    }

    /* renamed from: f */
    public static final List<C16157f> m89737f(C16157f fVar) {
        C13706o.m87929f(fVar, "methodName");
        return C13614t.m87753o(m89734c(fVar, false), m89734c(fVar, true));
    }
}
