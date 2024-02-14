package p242db;

import java.io.InputStream;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14454o;
import p288ib.C12492g;
import p362pb.C16151b;
import p362pb.C16152c;
import p434xb.C16903a;
import p434xb.C16908d;

/* renamed from: db.g */
/* compiled from: ReflectKotlinClassFinder.kt */
public final class C11997g implements C14454o {

    /* renamed from: a */
    private final ClassLoader f58198a;

    /* renamed from: b */
    private final C16908d f58199b = new C16908d();

    public C11997g(ClassLoader classLoader) {
        C13706o.m87929f(classLoader, "classLoader");
        this.f58198a = classLoader;
    }

    /* renamed from: d */
    private final C14454o.C14455a m82412d(String str) {
        C11995f a;
        Class<?> a2 = C11994e.m82405a(this.f58198a, str);
        if (a2 == null || (a = C11995f.f58195c.mo67435a(a2)) == null) {
            return null;
        }
        return new C14454o.C14455a.C14457b(a, (byte[]) null, 2, (C13695i) null);
    }

    /* renamed from: a */
    public InputStream mo67436a(C16152c cVar) {
        C13706o.m87929f(cVar, "packageFqName");
        if (!cVar.mo78565i(C13902k.f62195q)) {
            return null;
        }
        return this.f58199b.mo80080a(C16903a.f68154n.mo80076n(cVar));
    }

    /* renamed from: b */
    public C14454o.C14455a mo67437b(C12492g gVar) {
        String b;
        C13706o.m87929f(gVar, "javaClass");
        C16152c e = gVar.mo68968e();
        if (e == null || (b = e.mo78556b()) == null) {
            return null;
        }
        return m82412d(b);
    }

    /* renamed from: c */
    public C14454o.C14455a mo67438c(C16151b bVar) {
        C13706o.m87929f(bVar, "classId");
        return m82412d(C11998h.m82417b(bVar));
    }
}
