package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.crashlytics.internal.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1845b implements Deferred.DeferredHandler {

    /* renamed from: a */
    public final /* synthetic */ String f4862a;

    /* renamed from: b */
    public final /* synthetic */ String f4863b;

    /* renamed from: c */
    public final /* synthetic */ long f4864c;

    /* renamed from: d */
    public final /* synthetic */ StaticSessionData f4865d;

    public /* synthetic */ C1845b(String str, String str2, long j, StaticSessionData staticSessionData) {
        this.f4862a = str;
        this.f4863b = str2;
        this.f4864c = j;
        this.f4865d = staticSessionData;
    }

    /* renamed from: a */
    public final void mo22929a(Provider provider) {
        ((CrashlyticsNativeComponent) provider.get()).mo22944c(this.f4862a, this.f4863b, this.f4864c, this.f4865d);
    }
}
