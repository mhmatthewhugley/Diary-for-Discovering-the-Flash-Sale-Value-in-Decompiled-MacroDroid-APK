package p242db;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14434e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import p297ja.C13339u;

/* renamed from: db.k */
/* compiled from: RuntimeModuleData.kt */
public final class C12001k {

    /* renamed from: c */
    public static final C12002a f58202c = new C12002a((C13695i) null);

    /* renamed from: a */
    private final C14794k f58203a;

    /* renamed from: b */
    private final C11990a f58204b;

    /* renamed from: db.k$a */
    /* compiled from: RuntimeModuleData.kt */
    public static final class C12002a {
        private C12002a() {
        }

        public /* synthetic */ C12002a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C12001k mo67444a(ClassLoader classLoader) {
            C13706o.m87929f(classLoader, "classLoader");
            C11997g gVar = new C11997g(classLoader);
            C14434e.C14435a aVar = C14434e.f63267b;
            ClassLoader classLoader2 = C13339u.class.getClassLoader();
            C13706o.m87928e(classLoader2, "Unit::class.java.classLoader");
            C11997g gVar2 = new C11997g(classLoader2);
            C11993d dVar = new C11993d(classLoader);
            C14434e.C14435a.C14436a a = aVar.mo73157a(gVar, gVar2, dVar, "runtime module for " + classLoader, C12000j.f58201b, C12003l.f58205a);
            return new C12001k(a.mo73158a().mo73156a(), new C11990a(a.mo73159b(), gVar), (C13695i) null);
        }
    }

    private C12001k(C14794k kVar, C11990a aVar) {
        this.f58203a = kVar;
        this.f58204b = aVar;
    }

    public /* synthetic */ C12001k(C14794k kVar, C11990a aVar, C13695i iVar) {
        this(kVar, aVar);
    }

    /* renamed from: a */
    public final C14794k mo67441a() {
        return this.f58203a;
    }

    /* renamed from: b */
    public final C13958g0 mo67442b() {
        return this.f58203a.mo73974p();
    }

    /* renamed from: c */
    public final C11990a mo67443c() {
        return this.f58204b;
    }
}
