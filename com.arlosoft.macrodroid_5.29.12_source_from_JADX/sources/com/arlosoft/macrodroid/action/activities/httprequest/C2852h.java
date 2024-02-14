package com.arlosoft.macrodroid.action.activities.httprequest;

import android.content.res.Resources;
import p287ia.C12478a;

/* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.h */
/* compiled from: HttpRequestConfigViewModel_Factory */
public final class C2852h implements C12478a {

    /* renamed from: a */
    private final C12478a<Resources> f7926a;

    public C2852h(C12478a<Resources> aVar) {
        this.f7926a = aVar;
    }

    /* renamed from: a */
    public static C2852h m14071a(C12478a<Resources> aVar) {
        return new C2852h(aVar);
    }

    /* renamed from: c */
    public static HttpRequestConfigViewModel m14072c(C12478a<Resources> aVar) {
        return new HttpRequestConfigViewModel(aVar.get());
    }

    /* renamed from: b */
    public HttpRequestConfigViewModel get() {
        return m14072c(this.f7926a);
    }
}
