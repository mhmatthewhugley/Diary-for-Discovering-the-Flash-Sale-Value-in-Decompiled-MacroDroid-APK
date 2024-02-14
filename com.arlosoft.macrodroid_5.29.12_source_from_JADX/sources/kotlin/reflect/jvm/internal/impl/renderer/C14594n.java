package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import p362pb.C16153d;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.n */
/* compiled from: RenderingUtils.kt */
public final class C14594n {
    /* renamed from: a */
    public static final String m91449a(C16153d dVar) {
        C13706o.m87929f(dVar, "<this>");
        List<C16157f> h = dVar.mo78574h();
        C13706o.m87928e(h, "pathSegments()");
        return m91451c(h);
    }

    /* renamed from: b */
    public static final String m91450b(C16157f fVar) {
        C13706o.m87929f(fVar, "<this>");
        if (m91452d(fVar)) {
            StringBuilder sb = new StringBuilder();
            String d = fVar.mo78583d();
            C13706o.m87928e(d, "asString()");
            sb.append('`' + d);
            sb.append('`');
            return sb.toString();
        }
        String d2 = fVar.mo78583d();
        C13706o.m87928e(d2, "asString()");
        return d2;
    }

    /* renamed from: c */
    public static final String m91451c(List<C16157f> list) {
        C13706o.m87929f(list, "pathSegments");
        StringBuilder sb = new StringBuilder();
        for (C16157f next : list) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m91450b(next));
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    private static final boolean m91452d(C16157f fVar) {
        boolean z;
        String d = fVar.mo78583d();
        C13706o.m87928e(d, "asString()");
        if (!C14587i.f63582a.contains(d)) {
            int i = 0;
            while (true) {
                if (i >= d.length()) {
                    z = false;
                    break;
                }
                char charAt = d.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }
}
