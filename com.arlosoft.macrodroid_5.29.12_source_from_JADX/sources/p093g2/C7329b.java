package p093g2;

import android.app.Activity;
import p287ia.C12478a;

/* renamed from: g2.b */
/* compiled from: HeadingColorMapper_Factory */
public final class C7329b implements C12478a {

    /* renamed from: a */
    private final C12478a<Activity> f17932a;

    public C7329b(C12478a<Activity> aVar) {
        this.f17932a = aVar;
    }

    /* renamed from: a */
    public static C7329b m30268a(C12478a<Activity> aVar) {
        return new C7329b(aVar);
    }

    /* renamed from: c */
    public static C7328a m30269c(C12478a<Activity> aVar) {
        return new C7328a(aVar.get());
    }

    /* renamed from: b */
    public C7328a get() {
        return m30269c(this.f17932a);
    }
}
