package p078d3;

import android.content.Context;
import p287ia.C12478a;

/* renamed from: d3.e */
/* compiled from: TranslationHelper_Factory */
public final class C7256e implements C12478a {

    /* renamed from: a */
    private final C12478a<Context> f17689a;

    public C7256e(C12478a<Context> aVar) {
        this.f17689a = aVar;
    }

    /* renamed from: a */
    public static C7256e m29971a(C12478a<Context> aVar) {
        return new C7256e(aVar);
    }

    /* renamed from: c */
    public static C7245d m29972c(C12478a<Context> aVar) {
        return new C7245d(aVar.get());
    }

    /* renamed from: b */
    public C7245d get() {
        return m29972c(this.f17689a);
    }
}
