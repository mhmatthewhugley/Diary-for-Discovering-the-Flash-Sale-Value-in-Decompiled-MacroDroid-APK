package p374qe;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p392se.C16556h;

/* renamed from: qe.e */
/* compiled from: DateTimeTextProvider */
public abstract class C16337e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final AtomicReference<C16337e> f66803a = new AtomicReference<>();

    /* renamed from: qe.e$a */
    /* compiled from: DateTimeTextProvider */
    static class C16338a {

        /* renamed from: a */
        static final C16337e f66804a = m98023a();

        /* renamed from: a */
        static C16337e m98023a() {
            C16337e.f66803a.compareAndSet((Object) null, new C16342i());
            return (C16337e) C16337e.f66803a.get();
        }
    }

    /* renamed from: b */
    static C16337e m98021b() {
        return C16338a.f66804a;
    }

    /* renamed from: c */
    public abstract String mo78967c(C16556h hVar, long j, C16345j jVar, Locale locale);
}
