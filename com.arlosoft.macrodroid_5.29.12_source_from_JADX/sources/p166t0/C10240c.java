package p166t0;

import android.content.res.Resources;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.c */
/* compiled from: ActivityModule_ProvidesResourcesFactory */
public final class C10240c implements C12478a {

    /* renamed from: a */
    private final C10238a f23374a;

    public C10240c(C10238a aVar) {
        this.f23374a = aVar;
    }

    /* renamed from: a */
    public static C10240c m40256a(C10238a aVar) {
        return new C10240c(aVar);
    }

    /* renamed from: c */
    public static Resources m40257c(C10238a aVar) {
        return m40258d(aVar);
    }

    /* renamed from: d */
    public static Resources m40258d(C10238a aVar) {
        return (Resources) C16779b.m99514b(aVar.mo40847b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Resources get() {
        return m40257c(this.f23374a);
    }
}
