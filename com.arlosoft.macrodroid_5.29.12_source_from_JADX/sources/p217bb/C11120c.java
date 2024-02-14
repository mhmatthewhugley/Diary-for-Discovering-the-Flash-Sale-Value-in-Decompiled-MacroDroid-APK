package p217bb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;

/* renamed from: bb.c */
/* compiled from: PlatformDependentDeclarationFilter.kt */
public interface C11120c {

    /* renamed from: bb.c$a */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class C11121a implements C11120c {

        /* renamed from: a */
        public static final C11121a f54037a = new C11121a();

        private C11121a() {
        }

        /* renamed from: a */
        public boolean mo62253a(C13948e eVar, C14156y0 y0Var) {
            C13706o.m87929f(eVar, "classDescriptor");
            C13706o.m87929f(y0Var, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: bb.c$b */
    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class C11122b implements C11120c {

        /* renamed from: a */
        public static final C11122b f54038a = new C11122b();

        private C11122b() {
        }

        /* renamed from: a */
        public boolean mo62253a(C13948e eVar, C14156y0 y0Var) {
            C13706o.m87929f(eVar, "classDescriptor");
            C13706o.m87929f(y0Var, "functionDescriptor");
            return !y0Var.getAnnotations().mo72249n1(C11123d.m74787a());
        }
    }

    /* renamed from: a */
    boolean mo62253a(C13948e eVar, C14156y0 y0Var);
}
