package p327mb;

import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;

/* renamed from: mb.i */
/* compiled from: versionSpecificBehavior.kt */
public final class C15727i {
    /* renamed from: a */
    public static final boolean m95049a(C15712a aVar) {
        C13706o.m87929f(aVar, ClientCookie.VERSION_ATTR);
        return aVar.mo75147a() == 1 && aVar.mo75148b() >= 4;
    }

    /* renamed from: b */
    public static final boolean m95050b(C15712a aVar) {
        C13706o.m87929f(aVar, ClientCookie.VERSION_ATTR);
        return m95049a(aVar);
    }
}
