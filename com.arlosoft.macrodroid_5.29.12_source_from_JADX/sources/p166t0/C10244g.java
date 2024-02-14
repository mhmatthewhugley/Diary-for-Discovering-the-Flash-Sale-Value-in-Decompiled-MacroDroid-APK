package p166t0;

import android.app.Application;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.g */
/* compiled from: ApplicationModule_ProvidesApplicationFactory */
public final class C10244g implements C12478a {

    /* renamed from: a */
    private final C10241d f23378a;

    public C10244g(C10241d dVar) {
        this.f23378a = dVar;
    }

    /* renamed from: a */
    public static C10244g m40272a(C10241d dVar) {
        return new C10244g(dVar);
    }

    /* renamed from: c */
    public static Application m40273c(C10241d dVar) {
        return m40274d(dVar);
    }

    /* renamed from: d */
    public static Application m40274d(C10241d dVar) {
        return (Application) C16779b.m99514b(dVar.mo40852c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Application get() {
        return m40273c(this.f23378a);
    }
}
