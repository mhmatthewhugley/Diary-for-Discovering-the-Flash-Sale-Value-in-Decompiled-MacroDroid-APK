package p166t0;

import android.content.Context;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.h */
/* compiled from: ApplicationModule_ProvidesContextFactory */
public final class C10245h implements C12478a {

    /* renamed from: a */
    private final C10241d f23379a;

    public C10245h(C10241d dVar) {
        this.f23379a = dVar;
    }

    /* renamed from: a */
    public static C10245h m40276a(C10241d dVar) {
        return new C10245h(dVar);
    }

    /* renamed from: c */
    public static Context m40277c(C10241d dVar) {
        return m40278d(dVar);
    }

    /* renamed from: d */
    public static Context m40278d(C10241d dVar) {
        return (Context) C16779b.m99514b(dVar.mo40853d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Context get() {
        return m40277c(this.f23379a);
    }
}
