package com.arlosoft.macrodroid.action.activities.httprequest;

import com.arlosoft.macrodroid.action.HttpRequestAction;
import com.arlosoft.macrodroid.action.HttpRequestConfig;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.action.activities.httprequest.g */
/* compiled from: HttpRequestConfigViewModel.kt */
public final class C2851g {

    /* renamed from: a */
    private final HttpRequestConfig f7924a;

    /* renamed from: b */
    private final HttpRequestAction f7925b;

    public C2851g(HttpRequestConfig httpRequestConfig, HttpRequestAction httpRequestAction) {
        C13706o.m87929f(httpRequestConfig, "requestConfig");
        C13706o.m87929f(httpRequestAction, "httpRequestionAction");
        this.f7924a = httpRequestConfig;
        this.f7925b = httpRequestAction;
    }

    /* renamed from: a */
    public final HttpRequestAction mo26233a() {
        return this.f7925b;
    }

    /* renamed from: b */
    public final HttpRequestConfig mo26234b() {
        return this.f7924a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2851g)) {
            return false;
        }
        C2851g gVar = (C2851g) obj;
        return C13706o.m87924a(this.f7924a, gVar.f7924a) && C13706o.m87924a(this.f7925b, gVar.f7925b);
    }

    public int hashCode() {
        return (this.f7924a.hashCode() * 31) + this.f7925b.hashCode();
    }

    public String toString() {
        return "HttpRequestConfigAndAction(requestConfig=" + this.f7924a + ", httpRequestionAction=" + this.f7925b + ')';
    }
}
