package p242db;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13911a1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14112p;
import p279hb.C12412a;
import p279hb.C12413b;
import p288ib.C12497l;

/* renamed from: db.l */
/* compiled from: RuntimeSourceElementFactory.kt */
public final class C12003l implements C12413b {

    /* renamed from: a */
    public static final C12003l f58205a = new C12003l();

    /* renamed from: db.l$a */
    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class C12004a implements C12412a {

        /* renamed from: b */
        private final C14112p f58206b;

        public C12004a(C14112p pVar) {
            C13706o.m87929f(pVar, "javaElement");
            this.f58206b = pVar;
        }

        /* renamed from: b */
        public C13911a1 mo67419b() {
            C13911a1 a1Var = C13911a1.f62310a;
            C13706o.m87928e(a1Var, "NO_SOURCE_FILE");
            return a1Var;
        }

        /* renamed from: d */
        public C14112p mo67446c() {
            return this.f58206b;
        }

        public String toString() {
            return C12004a.class.getName() + ": " + mo67446c();
        }
    }

    private C12003l() {
    }

    /* renamed from: a */
    public C12412a mo67445a(C12497l lVar) {
        C13706o.m87929f(lVar, "javaElement");
        return new C12004a((C14112p) lVar);
    }
}
