package p242db;

import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14100l;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14120w;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import org.apache.commons.p353io.FilenameUtils;
import p288ib.C12492g;
import p288ib.C12507u;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: db.d */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C11993d implements C14325o {

    /* renamed from: a */
    private final ClassLoader f58194a;

    public C11993d(ClassLoader classLoader) {
        C13706o.m87929f(classLoader, "classLoader");
        this.f58194a = classLoader;
    }

    /* renamed from: a */
    public C12492g mo67423a(C14325o.C14327b bVar) {
        C13706o.m87929f(bVar, "request");
        C16151b a = bVar.mo72967a();
        C16152c h = a.mo78549h();
        C13706o.m87928e(h, "classId.packageFqName");
        String b = a.mo78551i().mo78556b();
        C13706o.m87928e(b, "classId.relativeClassName.asString()");
        String D = C15176v.m93629D(b, FilenameUtils.EXTENSION_SEPARATOR, '$', false, 4, (Object) null);
        if (!h.mo78558d()) {
            D = h.mo78556b() + FilenameUtils.EXTENSION_SEPARATOR + D;
        }
        Class<?> a2 = C11994e.m82405a(this.f58194a, D);
        if (a2 != null) {
            return new C14100l(a2);
        }
        return null;
    }

    /* renamed from: b */
    public Set<String> mo67424b(C16152c cVar) {
        C13706o.m87929f(cVar, "packageFqName");
        return null;
    }

    /* renamed from: c */
    public C12507u mo67425c(C16152c cVar, boolean z) {
        C13706o.m87929f(cVar, "fqName");
        return new C14120w(cVar);
    }
}
