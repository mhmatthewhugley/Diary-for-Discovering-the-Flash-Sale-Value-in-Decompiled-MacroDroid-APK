package p242db;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14088d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import org.apache.commons.p353io.FilenameUtils;
import p298jb.C13359a;
import p298jb.C13362b;
import p362pb.C16151b;

/* renamed from: db.f */
/* compiled from: ReflectKotlinClass.kt */
public final class C11995f implements C14459q {

    /* renamed from: c */
    public static final C11996a f58195c = new C11996a((C13695i) null);

    /* renamed from: a */
    private final Class<?> f58196a;

    /* renamed from: b */
    private final C13359a f58197b;

    /* renamed from: db.f$a */
    /* compiled from: ReflectKotlinClass.kt */
    public static final class C11996a {
        private C11996a() {
        }

        public /* synthetic */ C11996a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C11995f mo67435a(Class<?> cls) {
            C13706o.m87929f(cls, "klass");
            C13362b bVar = new C13362b();
            C11992c.f58193a.mo67421b(cls, bVar);
            C13359a m = bVar.mo70774m();
            if (m == null) {
                return null;
            }
            return new C11995f(cls, m, (C13695i) null);
        }
    }

    private C11995f(Class<?> cls, C13359a aVar) {
        this.f58196a = cls;
        this.f58197b = aVar;
    }

    public /* synthetic */ C11995f(Class cls, C13359a aVar, C13695i iVar) {
        this(cls, aVar);
    }

    /* renamed from: a */
    public void mo67426a(C14459q.C14463d dVar, byte[] bArr) {
        C13706o.m87929f(dVar, "visitor");
        C11992c.f58193a.mo67422i(this.f58196a, dVar);
    }

    /* renamed from: b */
    public C13359a mo67427b() {
        return this.f58197b;
    }

    /* renamed from: c */
    public void mo67428c(C14459q.C14462c cVar, byte[] bArr) {
        C13706o.m87929f(cVar, "visitor");
        C11992c.f58193a.mo67421b(this.f58196a, cVar);
    }

    /* renamed from: d */
    public C16151b mo67429d() {
        return C14088d.m89397a(this.f58196a);
    }

    /* renamed from: e */
    public final Class<?> mo67430e() {
        return this.f58196a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11995f) && C13706o.m87924a(this.f58196a, ((C11995f) obj).f58196a);
    }

    public String getLocation() {
        StringBuilder sb = new StringBuilder();
        String name = this.f58196a.getName();
        C13706o.m87928e(name, "klass.name");
        sb.append(C15176v.m93629D(name, FilenameUtils.EXTENSION_SEPARATOR, '/', false, 4, (Object) null));
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f58196a.hashCode();
    }

    public String toString() {
        return C11995f.class.getName() + ": " + this.f58196a;
    }
}
