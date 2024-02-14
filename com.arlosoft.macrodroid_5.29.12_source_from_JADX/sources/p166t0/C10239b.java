package p166t0;

import android.app.Activity;
import p287ia.C12478a;
import p422w8.C16779b;

/* renamed from: t0.b */
/* compiled from: ActivityModule_ProvidesActivityFactory */
public final class C10239b implements C12478a {

    /* renamed from: a */
    private final C10238a f23373a;

    public C10239b(C10238a aVar) {
        this.f23373a = aVar;
    }

    /* renamed from: a */
    public static C10239b m40252a(C10238a aVar) {
        return new C10239b(aVar);
    }

    /* renamed from: c */
    public static Activity m40253c(C10238a aVar) {
        return m40254d(aVar);
    }

    /* renamed from: d */
    public static Activity m40254d(C10238a aVar) {
        return (Activity) C16779b.m99514b(aVar.mo40846a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public Activity get() {
        return m40253c(this.f23373a);
    }
}
